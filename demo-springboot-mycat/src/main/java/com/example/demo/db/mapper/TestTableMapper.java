package com.example.demo.db.mapper;

import org.apache.ibatis.annotations.Select;

import com.example.demo.db.model.TestTable;

/**
 * 
 * @author Administrator
 *
 */
public interface TestTableMapper
{

    @Select(" select id,title,content from test_table ")
    public java.util.List<TestTable> listAll();

}
