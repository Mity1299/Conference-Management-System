package team.softwarede.confersys.mapper;

import team.softwarede.confersys.entity.Equipment;

public interface EquipmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment
     *
     * @mbg.generated Sat May 18 16:16:01 CST 2019
     */
    int deleteByPrimaryKey(String equipmentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment
     *
     * @mbg.generated Sat May 18 16:16:01 CST 2019
     */
    int insert(Equipment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment
     *
     * @mbg.generated Sat May 18 16:16:01 CST 2019
     */
    int insertSelective(Equipment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment
     *
     * @mbg.generated Sat May 18 16:16:01 CST 2019
     */
    Equipment selectByPrimaryKey(String equipmentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment
     *
     * @mbg.generated Sat May 18 16:16:01 CST 2019
     */
    int updateByPrimaryKeySelective(Equipment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment
     *
     * @mbg.generated Sat May 18 16:16:01 CST 2019
     */
    int updateByPrimaryKey(Equipment record);
}