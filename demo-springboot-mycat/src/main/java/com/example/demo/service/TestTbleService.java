package com.example.demo.service;

import java.util.List;

import com.example.demo.db.model.TestTable;
import com.github.pagehelper.PageInfo;

public interface TestTbleService
{

    List<TestTable> listAll();

    PageInfo<TestTable> page(Integer page, Integer num);
}
