package com.example.demo.service.impl;

import java.util.List;

import com.example.demo.db.mapper.TestTableMapper;
import com.example.demo.db.model.TestTable;
import com.example.demo.service.TestTbleService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@org.springframework.stereotype.Service
public class TestTbleServiceImpl implements TestTbleService
{
    @org.springframework.beans.factory.annotation.Autowired
    private TestTableMapper testTableMapper;

    @Override
    public List<TestTable> listAll()
    {
        List<TestTable> listAll = new java.util.ArrayList<>();
        listAll = testTableMapper.listAll();

        log.info("listAll=" + listAll.toString());
        return listAll;
    }

    @Override
    public PageInfo<TestTable> page(Integer page, Integer num)
    {
        Page pageResp = PageHelper.startPage(page, num, true);

        List<TestTable> list = listAll();
        PageInfo pageInfo = new PageInfo(pageResp.getResult());

        return pageInfo;
    }

}
