package com.didispace.entity;

public class Teacher {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.t_id
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    private Integer tId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.t_name
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    private String tName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.t_passwd
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    private String tPasswd;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.t_id
     *
     * @return the value of teacher.t_id
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    public Integer gettId() {
        return tId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.t_id
     *
     * @param tId the value for teacher.t_id
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    public void settId(Integer tId) {
        this.tId = tId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.t_name
     *
     * @return the value of teacher.t_name
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    public String gettName() {
        return tName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.t_name
     *
     * @param tName the value for teacher.t_name
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    public void settName(String tName) {
        this.tName = tName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.t_passwd
     *
     * @return the value of teacher.t_passwd
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    public String gettPasswd() {
        return tPasswd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.t_passwd
     *
     * @param tPasswd the value for teacher.t_passwd
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    public void settPasswd(String tPasswd) {
        this.tPasswd = tPasswd;
    }
}