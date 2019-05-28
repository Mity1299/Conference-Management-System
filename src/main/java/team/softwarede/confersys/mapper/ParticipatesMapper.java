package team.softwarede.confersys.mapper;

import team.softwarede.confersys.entity.Participates;
import team.softwarede.confersys.entity.ParticipatesKey;

public interface ParticipatesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participates
     *
     * @mbg.generated Sun May 26 23:58:28 CST 2019
     */
    int deleteByPrimaryKey(ParticipatesKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participates
     *
     * @mbg.generated Sun May 26 23:58:28 CST 2019
     */
    int insert(Participates record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participates
     *
     * @mbg.generated Sun May 26 23:58:28 CST 2019
     */
    int insertSelective(Participates record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participates
     *
     * @mbg.generated Sun May 26 23:58:28 CST 2019
     */
    Participates selectByPrimaryKey(ParticipatesKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participates
     *
     * @mbg.generated Sun May 26 23:58:28 CST 2019
     */
    int updateByPrimaryKeySelective(Participates record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participates
     *
     * @mbg.generated Sun May 26 23:58:28 CST 2019
     */
    int updateByPrimaryKey(Participates record);
}