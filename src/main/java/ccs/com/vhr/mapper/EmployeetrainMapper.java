package ccs.com.vhr.mapper;

import ccs.com.vhr.model.Employeetrain;

public interface EmployeetrainMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employeetrain
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employeetrain
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    int insert(Employeetrain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employeetrain
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    int insertSelective(Employeetrain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employeetrain
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    Employeetrain selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employeetrain
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    int updateByPrimaryKeySelective(Employeetrain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employeetrain
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    int updateByPrimaryKey(Employeetrain record);
}