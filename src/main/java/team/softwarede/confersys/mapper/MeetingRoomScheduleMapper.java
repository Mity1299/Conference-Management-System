package team.softwarede.confersys.mapper;

import team.softwarede.confersys.entity.MeetingRoomSchedule;

public interface MeetingRoomScheduleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room_schedule
     *
     * @mbg.generated Wed May 29 09:02:50 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room_schedule
     *
     * @mbg.generated Wed May 29 09:02:50 CST 2019
     */
    int insert(MeetingRoomSchedule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room_schedule
     *
     * @mbg.generated Wed May 29 09:02:50 CST 2019
     */
    int insertSelective(MeetingRoomSchedule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room_schedule
     *
     * @mbg.generated Wed May 29 09:02:50 CST 2019
     */
    MeetingRoomSchedule selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room_schedule
     *
     * @mbg.generated Wed May 29 09:02:50 CST 2019
     */
    int updateByPrimaryKeySelective(MeetingRoomSchedule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room_schedule
     *
     * @mbg.generated Wed May 29 09:02:50 CST 2019
     */
    int updateByPrimaryKey(MeetingRoomSchedule record);
}