package team.softwarede.confersys.entity;

public class ParticipatesMeetingKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column participates_meeting.user_group_id
     *
     * @mbg.generated Thu May 30 09:12:43 CST 2019
     */
    private Integer userGroupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column participates_meeting.meeting_id
     *
     * @mbg.generated Thu May 30 09:12:43 CST 2019
     */
    private Integer meetingId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column participates_meeting.user_group_id
     *
     * @return the value of participates_meeting.user_group_id
     *
     * @mbg.generated Thu May 30 09:12:43 CST 2019
     */
    public Integer getUserGroupId() {
        return userGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column participates_meeting.user_group_id
     *
     * @param userGroupId the value for participates_meeting.user_group_id
     *
     * @mbg.generated Thu May 30 09:12:43 CST 2019
     */
    public void setUserGroupId(Integer userGroupId) {
        this.userGroupId = userGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column participates_meeting.meeting_id
     *
     * @return the value of participates_meeting.meeting_id
     *
     * @mbg.generated Thu May 30 09:12:43 CST 2019
     */
    public Integer getMeetingId() {
        return meetingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column participates_meeting.meeting_id
     *
     * @param meetingId the value for participates_meeting.meeting_id
     *
     * @mbg.generated Thu May 30 09:12:43 CST 2019
     */
    public void setMeetingId(Integer meetingId) {
        this.meetingId = meetingId;
    }
}