package team.softwarede.confersys.mapper;

import team.softwarede.confersys.entity.MeetingRoom;

public interface MeetingRoomMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room
     *
     * @mbg.generated Thu May 30 16:48:49 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room
     *
     * @mbg.generated Thu May 30 16:48:49 CST 2019
     */
    int insert(MeetingRoom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room
     *
     * @mbg.generated Thu May 30 16:48:49 CST 2019
     */
    int insertSelective(MeetingRoom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room
     *
     * @mbg.generated Thu May 30 16:48:49 CST 2019
     */
    MeetingRoom selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room
     *
     * @mbg.generated Thu May 30 16:48:49 CST 2019
     */
    int updateByPrimaryKeySelective(MeetingRoom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room
     *
     * @mbg.generated Thu May 30 16:48:49 CST 2019
     */
    int updateByPrimaryKey(MeetingRoom record);
}