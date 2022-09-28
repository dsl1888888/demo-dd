package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.util.PageHelperUtil;
import com.example.demo.domain.T1;
import com.example.demo.domain.T1Example;
import com.example.demo.mapper.T1Mapper;
import com.example.demo.service.IT1Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class T1ServiceImpl implements IT1Service
{

    @Autowired
    private T1Mapper t1Mapper;

    @Override
    public List<T1> listAll()
    {
        return t1Mapper.selectByExample(null);
    }

    @Override
    public PageInfo selectPage(T1 req, PageHelperUtil pageHelperUtil)
    {
        
        Page page = PageHelper.startPage(pageHelperUtil.getPage(), pageHelperUtil.getRows(), true);

        List<T1> list = listAll(req);
        PageInfo pageInfo = new PageInfo(page.getResult());

        return pageInfo;
    }

    @Override
    public List<T1> listAll(T1 req)
    { 
        List<T1> list = new ArrayList<T1>();

        T1Example example = new T1Example();
        T1Example.Criteria criteria = example.createCriteria();

        if (null != req)
        {

        }
        list = t1Mapper.selectByExample(example);
        return list;
    }

}
