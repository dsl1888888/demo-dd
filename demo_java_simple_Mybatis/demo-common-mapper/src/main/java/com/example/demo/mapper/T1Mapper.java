package com.example.demo.mapper;

import com.example.demo.domain.T1;
import com.example.demo.domain.T1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface T1Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_1
     *
     * @mbg.generated Tue May 24 14:20:02 CST 2022
     */
    long countByExample(T1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_1
     *
     * @mbg.generated Tue May 24 14:20:02 CST 2022
     */
    int deleteByExample(T1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_1
     *
     * @mbg.generated Tue May 24 14:20:02 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_1
     *
     * @mbg.generated Tue May 24 14:20:02 CST 2022
     */
    int insert(T1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_1
     *
     * @mbg.generated Tue May 24 14:20:02 CST 2022
     */
    int insertSelective(T1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_1
     *
     * @mbg.generated Tue May 24 14:20:02 CST 2022
     */
    List<T1> selectByExample(T1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_1
     *
     * @mbg.generated Tue May 24 14:20:02 CST 2022
     */
    T1 selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_1
     *
     * @mbg.generated Tue May 24 14:20:02 CST 2022
     */
    int updateByExampleSelective(@Param("record") T1 record, @Param("example") T1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_1
     *
     * @mbg.generated Tue May 24 14:20:02 CST 2022
     */
    int updateByExample(@Param("record") T1 record, @Param("example") T1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_1
     *
     * @mbg.generated Tue May 24 14:20:02 CST 2022
     */
    int updateByPrimaryKeySelective(T1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_1
     *
     * @mbg.generated Tue May 24 14:20:02 CST 2022
     */
    int updateByPrimaryKey(T1 record);
}