package com.example.demo.db.mapper;

import org.springframework.stereotype.Repository;

import com.example.demo.db.model.TestB1;

/**
 * 
 * @author Administrator
 *
 */
@Repository
public interface TestB1Mapper 
//extends BaseMapper<TestB1> 
{

    
   @org.apache.ibatis.annotations.Select(" select * from test_b1 ")
   public java.util.List<TestB1> listAll();
     
}
