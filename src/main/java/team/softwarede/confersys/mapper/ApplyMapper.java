package team.softwarede.confersys.mapper;

import team.softwarede.confersys.entity.Apply;

public interface ApplyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbg.generated Wed May 29 09:02:50 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbg.generated Wed May 29 09:02:50 CST 2019
     */
    int insert(Apply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbg.generated Wed May 29 09:02:50 CST 2019
     */
    int insertSelective(Apply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbg.generated Wed May 29 09:02:50 CST 2019
     */
    Apply selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbg.generated Wed May 29 09:02:50 CST 2019
     */
    int updateByPrimaryKeySelective(Apply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbg.generated Wed May 29 09:02:50 CST 2019
     */
    int updateByPrimaryKey(Apply record);
}