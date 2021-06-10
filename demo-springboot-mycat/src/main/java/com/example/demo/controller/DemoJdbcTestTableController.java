package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db.model.TestTable;
import com.example.demo.service.TestTbleService;
import com.github.pagehelper.PageInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/* 类注解 */
@Api(value = "")
@RestController
public class DemoJdbcTestTableController
{
    @org.springframework.beans.factory.annotation.Autowired
    private TestTbleService testTbleService;

    /* 方法注解 */
    @ApiOperation(value = "", notes = "")
    @RequestMapping(value = "/TestTable/jdbc/demo", method = RequestMethod.GET)
    public List<TestTable> demo()
    {
        List<TestTable> listAll = new java.util.ArrayList<>();

        listAll = testTbleService.listAll();
        return listAll;
    }

    /* 方法注解 */
    @ApiOperation(value = "", notes = "")
    @RequestMapping(value = "/TestTable/jdbc/page", method = RequestMethod.GET)
    public PageInfo page(@org.springframework.web.bind.annotation.RequestParam(required = true) Integer page,
                         @org.springframework.web.bind.annotation.RequestParam(required = true) Integer num)
    {
        PageInfo<TestTable> page2 = testTbleService.page(page, num);
        return page2;
    }
}
