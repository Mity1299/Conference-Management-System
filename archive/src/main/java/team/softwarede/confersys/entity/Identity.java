package team.softwarede.confersys.entity;

public class Identity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column identity.id
     *
     * @mbg.generated Thu May 30 16:48:49 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column identity.role_id
     *
     * @mbg.generated Thu May 30 16:48:49 CST 2019
     */
    private Integer roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column identity.identity
     *
     * @mbg.generated Thu May 30 16:48:49 CST 2019
     */
    private String identity;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column identity.id
     *
     * @return the value of identity.id
     *
     * @mbg.generated Thu May 30 16:48:49 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column identity.id
     *
     * @param id the value for identity.id
     *
     * @mbg.generated Thu May 30 16:48:49 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column identity.role_id
     *
     * @return the value of identity.role_id
     *
     * @mbg.generated Thu May 30 16:48:49 CST 2019
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column identity.role_id
     *
     * @param roleId the value for identity.role_id
     *
     * @mbg.generated Thu May 30 16:48:49 CST 2019
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column identity.identity
     *
     * @return the value of identity.identity
     *
     * @mbg.generated Thu May 30 16:48:49 CST 2019
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column identity.identity
     *
     * @param identity the value for identity.identity
     *
     * @mbg.generated Thu May 30 16:48:49 CST 2019
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }
}