package team.softwarede.confersys.entity;

import java.util.Date;

public class Apply {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column apply.id
     *
     * @mbg.generated Wed May 29 09:02:50 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column apply.mee_id
     *
     * @mbg.generated Wed May 29 09:02:50 CST 2019
     */
    private Integer meeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column apply.user_id
     *
     * @mbg.generated Wed May 29 09:02:50 CST 2019
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column apply.apply_status_id
     *
     * @mbg.generated Wed May 29 09:02:50 CST 2019
     */
    private String applyStatusId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column apply.apply_time
     *
     * @mbg.generated Wed May 29 09:02:50 CST 2019
     */
    private Date applyTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column apply.id
     *
     * @return the value of apply.id
     *
     * @mbg.generated Wed May 29 09:02:50 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column apply.id
     *
     * @param id the value for apply.id
     *
     * @mbg.generated Wed May 29 09:02:50 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column apply.mee_id
     *
     * @return the value of apply.mee_id
     *
     * @mbg.generated Wed May 29 09:02:50 CST 2019
     */
    public Integer getMeeId() {
        return meeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column apply.mee_id
     *
     * @param meeId the value for apply.mee_id
     *
     * @mbg.generated Wed May 29 09:02:50 CST 2019
     */
    public void setMeeId(Integer meeId) {
        this.meeId = meeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column apply.user_id
     *
     * @return the value of apply.user_id
     *
     * @mbg.generated Wed May 29 09:02:50 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column apply.user_id
     *
     * @param userId the value for apply.user_id
     *
     * @mbg.generated Wed May 29 09:02:50 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column apply.apply_status_id
     *
     * @return the value of apply.apply_status_id
     *
     * @mbg.generated Wed May 29 09:02:50 CST 2019
     */
    public String getApplyStatusId() {
        return applyStatusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column apply.apply_status_id
     *
     * @param applyStatusId the value for apply.apply_status_id
     *
     * @mbg.generated Wed May 29 09:02:50 CST 2019
     */
    public void setApplyStatusId(String applyStatusId) {
        this.applyStatusId = applyStatusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column apply.apply_time
     *
     * @return the value of apply.apply_time
     *
     * @mbg.generated Wed May 29 09:02:50 CST 2019
     */
    public Date getApplyTime() {
        return applyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column apply.apply_time
     *
     * @param applyTime the value for apply.apply_time
     *
     * @mbg.generated Wed May 29 09:02:50 CST 2019
     */
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }
}