package team.softwarede.confersys.mapper;

import team.softwarede.confersys.entity.Meeting;

public interface MeetingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting
     *
     * @mbg.generated Sat May 18 16:16:01 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting
     *
     * @mbg.generated Sat May 18 16:16:01 CST 2019
     */
    int insert(Meeting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting
     *
     * @mbg.generated Sat May 18 16:16:01 CST 2019
     */
    int insertSelective(Meeting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting
     *
     * @mbg.generated Sat May 18 16:16:01 CST 2019
     */
    Meeting selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting
     *
     * @mbg.generated Sat May 18 16:16:01 CST 2019
     */
    int updateByPrimaryKeySelective(Meeting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting
     *
     * @mbg.generated Sat May 18 16:16:01 CST 2019
     */
    int updateByPrimaryKey(Meeting record);
}