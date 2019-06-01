/**
* 
* @author Mity1299
*/
package team.softwarede.confersys.bizImpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import team.softwarede.confersys.biz.InformBiz;
import team.softwarede.confersys.entity.Apply;
import team.softwarede.confersys.entity.Meeting;
import team.softwarede.confersys.entity.NoticesKey;
import team.softwarede.confersys.entity.Notification;
import team.softwarede.confersys.entity.Participates;
import team.softwarede.confersys.entity.Schedule;
import team.softwarede.confersys.enums.EnumApplyStatusId;
import team.softwarede.confersys.enums.EnumMeetingStatusId;
import team.softwarede.confersys.enums.EnumNotificationStatus;
import team.softwarede.confersys.enums.EnumNotificationType;
import team.softwarede.confersys.mapper.ApplyMapper;
import team.softwarede.confersys.mapper.MeetingMapper;
import team.softwarede.confersys.mapper.NoticesMapper;
import team.softwarede.confersys.mapper.NotificationMapper;
import team.softwarede.confersys.mapper.ParticipatesMapper;
import team.softwarede.confersys.mapper.ScheduleMapper;

/**
 * @author Mity1299
 *
 */
@Service("informBiz")
public class InformBizImpl implements InformBiz {

    @Autowired
    ApplyMapper applyMapper; 
    @Autowired
    MeetingMapper meetingMapper;
    @Autowired
    ScheduleMapper scheduleMapper; 
    @Autowired
    NotificationMapper notificationMapper;
    @Autowired
    NoticesMapper noticesMapper;
    @Autowired
    ParticipatesMapper participatesMapper; 
    
    @Transactional
    @Override
    public boolean auditMeeingBookApply(Integer mtRoomApplyId, Integer bookStatus) {
        // TODO Auto-generated method stub
        
        Apply apply = applyMapper.selectByPrimaryKey(mtRoomApplyId);
        applyMapper.updateStatusById(mtRoomApplyId, EnumApplyStatusId.SUCCEED.getDescription());
        
        Integer meetingId = apply.getMeetingId();
        Meeting meeting = meetingMapper.selectByPrimaryKey(meetingId);
        String meetingTopic = meeting.getTopic();
        Schedule schedule = scheduleMapper.selectByMtId(meetingId);
        String auditdetail = null;
        
        if(bookStatus==0) {
            //如果会议拒绝
            meetingMapper.updateStatusById(meetingId, EnumMeetingStatusId.FAILED.getDescription());
            auditdetail = "主题为\""+meetingTopic+"\"的会议预约未通过";
            
            
        }else if(bookStatus==1) {
            //如果会议通过
            meetingMapper.updateStatusById(meetingId, EnumMeetingStatusId.READY.getDescription());
            auditdetail = "主题为\""+ meetingTopic +"\"的会议预约已通过";
            Date beginDateTime = schedule.getBeginTime();
            Date endtDateTime = schedule.getEndTime();

            SimpleDateFormat sdfDate = new SimpleDateFormat("MM月dd日");
            SimpleDateFormat sdfTime = new SimpleDateFormat("HH时mm分");
            
            String date = sdfDate.format(beginDateTime);
            String beginTime = sdfTime.format(beginDateTime);
            String endTime = sdfTime.format(endtDateTime);
            
            String attendMtDetail = date + ",从" + beginTime + "到" + endTime 
                                    + "您需要参加 \"" + meetingTopic +"\"会议，请您做好与会准备"; 
            
            List<String> partUserIdList =participatesMapper.selectByMtId(meetingId);
            
            for(String userId : partUserIdList) {
                
                //插入与会通知
                Notification attendNoti = new Notification();
                attendNoti.setNotificationType(EnumNotificationType.MEETING.getDescription());
                attendNoti.setNotificationDetail(attendMtDetail);
                attendNoti.setNotificationnStatus(EnumNotificationStatus.UNREAD.getDescription());
                attendNoti.setReferId(meetingId.toString());
                
                notificationMapper.insertSelective(attendNoti);
                
                //插入接收者和通知的联系
                NoticesKey noticesKey = new NoticesKey();
                noticesKey.setUserId(userId);
                noticesKey.setNotificationId(attendNoti.getId());
                
                noticesMapper.insert(noticesKey);
            }
            
        }else {
            return false;
        }
        
        //插入审核结果通知
        Notification auditNoti = new Notification();
        auditNoti.setNotificationType(EnumNotificationType.AUIDIT.getDescription());
        auditNoti.setNotificationDetail(auditdetail);
        auditNoti.setNotificationnStatus(EnumNotificationStatus.UNREAD.getDescription());
        auditNoti.setReferId(meetingId.toString());
        
        notificationMapper.insertSelective(auditNoti);
        
        //插入接收者和通知的联系
        NoticesKey noticesKey = new NoticesKey();
        noticesKey.setUserId(apply.getUserId());
        noticesKey.setNotificationId(auditNoti.getId());
        
        noticesMapper.insert(noticesKey);
        
        return true;
    }

}