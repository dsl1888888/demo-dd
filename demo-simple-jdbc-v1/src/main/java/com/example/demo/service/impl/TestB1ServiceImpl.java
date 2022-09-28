package com.example.demo.service.impl;

import java.util.List;

import com.example.demo.db.mapper.TestB1Mapper;
import com.example.demo.db.model.TestB1;
import com.example.demo.service.TestB1Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@lombok.extern.slf4j.Slf4j
@org.springframework.stereotype.Service
public class TestB1ServiceImpl implements TestB1Service
{
    @org.springframework.beans.factory.annotation.Autowired
    private TestB1Mapper testB1Mapper;

    @Override
    public List<TestB1> listAll()
    {
        List<TestB1> listAll = new java.util.ArrayList<>();
        listAll = testB1Mapper.listAll();

        log.info("listAll=" + listAll.toString());
        return listAll;
    }

    @Override
    public PageInfo page(Integer page, Integer num)
    {
        Page pageResp = PageHelper.startPage(page, num, true);

        List<TestB1> list = listAll();
        PageInfo pageInfo = new PageInfo(pageResp.getResult());

        return pageInfo;
    }

}
