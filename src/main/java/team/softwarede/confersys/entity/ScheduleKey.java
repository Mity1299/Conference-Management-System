package team.softwarede.confersys.entity;

public class ScheduleKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column schedule.meeting_id
	 * @mbg.generated  Sat Jun 01 21:30:06 CST 2019
	 */
	private Integer meetingId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column schedule.meeting_room_id
	 * @mbg.generated  Sat Jun 01 21:30:06 CST 2019
	 */
	private Integer meetingRoomId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column schedule.meeting_id
	 * @return  the value of schedule.meeting_id
	 * @mbg.generated  Sat Jun 01 21:30:06 CST 2019
	 */
	public Integer getMeetingId() {
		return meetingId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column schedule.meeting_id
	 * @param meetingId  the value for schedule.meeting_id
	 * @mbg.generated  Sat Jun 01 21:30:06 CST 2019
	 */
	public void setMeetingId(Integer meetingId) {
		this.meetingId = meetingId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column schedule.meeting_room_id
	 * @return  the value of schedule.meeting_room_id
	 * @mbg.generated  Sat Jun 01 21:30:06 CST 2019
	 */
	public Integer getMeetingRoomId() {
		return meetingRoomId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column schedule.meeting_room_id
	 * @param meetingRoomId  the value for schedule.meeting_room_id
	 * @mbg.generated  Sat Jun 01 21:30:06 CST 2019
	 */
	public void setMeetingRoomId(Integer meetingRoomId) {
		this.meetingRoomId = meetingRoomId;
	}
}