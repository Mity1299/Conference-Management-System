package team.softwarede.confersys.entity;

public class ParticipatesKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column participates.user_id
     *
     * @mbg.generated Sun May 26 23:58:28 CST 2019
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column participates.id
     *
     * @mbg.generated Sun May 26 23:58:28 CST 2019
     */
    private Integer id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column participates.user_id
     *
     * @return the value of participates.user_id
     *
     * @mbg.generated Sun May 26 23:58:28 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column participates.user_id
     *
     * @param userId the value for participates.user_id
     *
     * @mbg.generated Sun May 26 23:58:28 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column participates.id
     *
     * @return the value of participates.id
     *
     * @mbg.generated Sun May 26 23:58:28 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column participates.id
     *
     * @param id the value for participates.id
     *
     * @mbg.generated Sun May 26 23:58:28 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }
}