package com.example.demo.db.mapper;

import org.apache.ibatis.annotations.Select;

import com.example.demo.db.model.TestB1;

/**
 * 
 * @author Administrator
 *
 */
public interface TestB1Mapper
{

    @Select(" select * from test_b1 ")
    public java.util.List<TestB1> listAll();

}
