package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.T1;
import com.example.demo.mapper.T1Mapper;
import com.example.demo.service.impl.T1ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
public class T1Controller
{

    @Autowired
    private T1ServiceImpl t1ServiceImpl;

    @Autowired
    private T1Mapper t1Mapper;

    //http://localhost:8080/listAll
    @RequestMapping("listAll")
    @ResponseBody
    public List tes()
    {
        List<T1> listAll = new ArrayList<T1>();
        listAll = t1ServiceImpl.listAll();
        return listAll;
    }

  //http://localhost:8080/testPage?currentPage=1&pageSize=1
    /**
     * 测试testPage
     * 
     * @return
     */
    @GetMapping(value = "/testPage")
    public PageInfo testPage(Long currentPage, Long pageSize)
    {
        // 设置分页规则
        PageHelper.startPage(Integer.valueOf(String.valueOf(currentPage)),Integer.valueOf(String.valueOf(pageSize)), true);
        if (null == currentPage || null == pageSize)
        {
            // 设置分页规则
            PageHelper.startPage(1, 20, true);
        }
        
        T1 reqQuery = new T1();
        List<T1> list = t1ServiceImpl.listAll(reqQuery);
        
        // 返回所有分页信息参数为查询所有记录的信息
        PageInfo pageInfo = new PageInfo<>(list);
        long total = pageInfo.getTotal();
        Integer totalInteger = Integer.valueOf(String.valueOf(total));
        return pageInfo;
    }
}
