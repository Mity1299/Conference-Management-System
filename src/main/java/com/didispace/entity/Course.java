package com.didispace.entity;

public class Course {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.course_id
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    private Integer courseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.title
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.room_num
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    private Integer roomNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.time_slot_id
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    private Integer timeSlotId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.course_id
     *
     * @return the value of course.course_id
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.course_id
     *
     * @param courseId the value for course.course_id
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.title
     *
     * @return the value of course.title
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.title
     *
     * @param title the value for course.title
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.room_num
     *
     * @return the value of course.room_num
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    public Integer getRoomNum() {
        return roomNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.room_num
     *
     * @param roomNum the value for course.room_num
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.time_slot_id
     *
     * @return the value of course.time_slot_id
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    public Integer getTimeSlotId() {
        return timeSlotId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.time_slot_id
     *
     * @param timeSlotId the value for course.time_slot_id
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    public void setTimeSlotId(Integer timeSlotId) {
        this.timeSlotId = timeSlotId;
    }
}