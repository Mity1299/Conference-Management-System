package team.softwarede.confersys.entity;

public class Role {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.id
     *
     * @mbg.generated Thu May 30 16:48:49 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.role
     *
     * @mbg.generated Thu May 30 16:48:49 CST 2019
     */
    private String role;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.id
     *
     * @return the value of role.id
     *
     * @mbg.generated Thu May 30 16:48:49 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.id
     *
     * @param id the value for role.id
     *
     * @mbg.generated Thu May 30 16:48:49 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.role
     *
     * @return the value of role.role
     *
     * @mbg.generated Thu May 30 16:48:49 CST 2019
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.role
     *
     * @param role the value for role.role
     *
     * @mbg.generated Thu May 30 16:48:49 CST 2019
     */
    public void setRole(String role) {
        this.role = role;
    }
}