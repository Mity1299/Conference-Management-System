package team.softwarede.confersys.entity;

public class UserGroup {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_group.id
     *
     * @mbg.generated Thu May 30 16:48:49 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_group.user_id
     *
     * @mbg.generated Thu May 30 16:48:49 CST 2019
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_group.name
     *
     * @mbg.generated Thu May 30 16:48:49 CST 2019
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_group.id
     *
     * @return the value of user_group.id
     *
     * @mbg.generated Thu May 30 16:48:49 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_group.id
     *
     * @param id the value for user_group.id
     *
     * @mbg.generated Thu May 30 16:48:49 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_group.user_id
     *
     * @return the value of user_group.user_id
     *
     * @mbg.generated Thu May 30 16:48:49 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_group.user_id
     *
     * @param userId the value for user_group.user_id
     *
     * @mbg.generated Thu May 30 16:48:49 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_group.name
     *
     * @return the value of user_group.name
     *
     * @mbg.generated Thu May 30 16:48:49 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_group.name
     *
     * @param name the value for user_group.name
     *
     * @mbg.generated Thu May 30 16:48:49 CST 2019
     */
    public void setName(String name) {
        this.name = name;
    }
}