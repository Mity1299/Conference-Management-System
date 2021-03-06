/**
* 
* @author Mity1299
*/
package team.softwarede.confersys.biz;

import java.util.Date;
import java.util.List;

import team.softwarede.confersys.dto.EquipmentRepairDetails;
import team.softwarede.confersys.dto.MeetingRoomAvail;
import team.softwarede.confersys.dto.MeetingRoomSchedule;
import team.softwarede.confersys.dto.MeetingRoomScheduleOrg;
import team.softwarede.confersys.entity.EquipmentType;

/**
 * @author Mity1299
 *
 */
public interface MeetingRoomBiz {

    List<MeetingRoomAvail> showAvailMtRoom(Date beginTime,
                                          Date endTime,
                                          List<Integer> equipmentTypeIdList,
                                          Integer capacity);

    List<EquipmentType> showMtRoomBookPage();
    
    EquipmentRepairDetails repairDetails(int repairId);
    
    List<MeetingRoomAvail> showAllMtRoom();
    
    List<MeetingRoomSchedule> showScheduleAdmin(int meetingRoomId);
    
    List<MeetingRoomScheduleOrg> showScheduleOrg(int meetingRoomId);
}
