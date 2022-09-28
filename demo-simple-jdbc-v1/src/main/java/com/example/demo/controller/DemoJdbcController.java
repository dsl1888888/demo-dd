package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db.model.TestB1;
import com.example.demo.service.TestB1Service;
import com.github.pagehelper.PageInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/* 类注解 */
@Api(value = "desc of class")
@RestController
public class DemoJdbcController
{
    @org.springframework.beans.factory.annotation.Autowired
    private TestB1Service testB1Service;
    
    /* 方法注解 */
    @ApiOperation(value = "desc of method", notes = "")
    @RequestMapping(value = "/jdbc/demo", method = RequestMethod.GET)
    public List<TestB1> demo()
    {
        List<TestB1> listAll = new java.util.ArrayList<>();
        
        listAll = testB1Service.listAll();
        return listAll;
    }
    
    /* 方法注解 */
    @ApiOperation(value = "desc of method", notes = "")
    @RequestMapping(value = "/jdbc/page", method = RequestMethod.GET)
    public PageInfo page(
                       @org.springframework.web.bind.annotation.RequestParam(required = true)  Integer page,
                       @org.springframework.web.bind.annotation.RequestParam(required = true)   Integer num)
    { 
        PageInfo<TestB1> page2 = testB1Service.page(page, num); 
        return page2;
    }
}
