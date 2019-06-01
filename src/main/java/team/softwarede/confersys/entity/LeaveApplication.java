package team.softwarede.confersys.entity;

import java.util.Date;

public class LeaveApplication extends LeaveApplicationKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave_application.apply_time
     *
     * @mbg.generated Sun Jun 02 00:43:49 CST 2019
     */
    private Date applyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave_application.apply_status_id
     *
     * @mbg.generated Sun Jun 02 00:43:49 CST 2019
     */
    private String applyStatusId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave_application.reason
     *
     * @mbg.generated Sun Jun 02 00:43:49 CST 2019
     */
    private String reason;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave_application.apply_time
     *
     * @return the value of leave_application.apply_time
     *
     * @mbg.generated Sun Jun 02 00:43:49 CST 2019
     */
    public Date getApplyTime() {
        return applyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave_application.apply_time
     *
     * @param applyTime the value for leave_application.apply_time
     *
     * @mbg.generated Sun Jun 02 00:43:49 CST 2019
     */
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave_application.apply_status_id
     *
     * @return the value of leave_application.apply_status_id
     *
     * @mbg.generated Sun Jun 02 00:43:49 CST 2019
     */
    public String getApplyStatusId() {
        return applyStatusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave_application.apply_status_id
     *
     * @param applyStatusId the value for leave_application.apply_status_id
     *
     * @mbg.generated Sun Jun 02 00:43:49 CST 2019
     */
    public void setApplyStatusId(String applyStatusId) {
        this.applyStatusId = applyStatusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave_application.reason
     *
     * @return the value of leave_application.reason
     *
     * @mbg.generated Sun Jun 02 00:43:49 CST 2019
     */
    public String getReason() {
        return reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave_application.reason
     *
     * @param reason the value for leave_application.reason
     *
     * @mbg.generated Sun Jun 02 00:43:49 CST 2019
     */
    public void setReason(String reason) {
        this.reason = reason;
    }
}