package team.softwarede.confersys.entity;

public class Participates extends ParticipatesKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column participates.participants_status
     *
     * @mbg.generated Wed May 29 09:02:50 CST 2019
     */
    private String participantsStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column participates.participants_status
     *
     * @return the value of participates.participants_status
     *
     * @mbg.generated Wed May 29 09:02:50 CST 2019
     */
    public String getParticipantsStatus() {
        return participantsStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column participates.participants_status
     *
     * @param participantsStatus the value for participates.participants_status
     *
     * @mbg.generated Wed May 29 09:02:50 CST 2019
     */
    public void setParticipantsStatus(String participantsStatus) {
        this.participantsStatus = participantsStatus;
    }
}