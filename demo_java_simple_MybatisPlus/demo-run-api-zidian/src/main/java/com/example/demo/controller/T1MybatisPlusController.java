package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lvfang.mybatisplus.test.model.T1;
import com.lvfang.mybatisplus.test.service.impl.T1ServiceImpl;

@RestController
public class T1MybatisPlusController
{
    @Autowired
    private T1ServiceImpl serviceImpl;

    // http://localhost:8080/listAll
    @RequestMapping("listAll")
    @ResponseBody
    public List tes()
    {
        List<T1> listAll = new ArrayList<>();

        listAll = serviceImpl.list(null);

        return listAll;
    }

    // http://localhost:8080/testPage?currentPage=1&pageSize=1
    /**
     * 测试testPage
     * 
     * @return
     */
    @GetMapping(value = "/testPage")
    public PageInfo testPage(Long currentPage, Long pageSize)
    {
        // 设置分页规则
        PageHelper.startPage(Integer.valueOf(String.valueOf(currentPage)), Integer.valueOf(String.valueOf(pageSize)),
                             true);
        if (null == currentPage || null == pageSize)
        {
            // 设置分页规则
            PageHelper.startPage(1, 20, true);
        }

        List<T1> list = serviceImpl.list(null);

        // 返回所有分页信息参数为查询所有记录的信息
        PageInfo pageInfo = new PageInfo<>(list);
        long total = pageInfo.getTotal();
        Integer totalInteger = Integer.valueOf(String.valueOf(total));
        return pageInfo;
    }
}
