package team.softwarede.confersys.mapper;

import team.softwarede.confersys.entity.Meeting;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface MeetingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting
     *
     * @mbg.generated Sun May 26 09:58:09 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting
     *
     * @mbg.generated Sun May 26 09:58:09 CST 2019
     */
    int insert(Meeting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting
     *
     * @mbg.generated Sun May 26 09:58:09 CST 2019
     */
    int insertSelective(Meeting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting
     *
     * @mbg.generated Sun May 26 09:58:09 CST 2019
     */
    Meeting selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting
     *
     * @mbg.generated Sun May 26 09:58:09 CST 2019
     */
    int updateByPrimaryKeySelective(Meeting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting
     *
     * @mbg.generated Sun May 26 09:58:09 CST 2019
     */
    int updateByPrimaryKey(Meeting record);
}