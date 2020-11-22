package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/* 类注解 */
@Api(value = "desc")
@RestController
public class DemoController {
    /* 方法注解 */
    @ApiOperation(value = "desc", notes = "")
    @RequestMapping(value = "demo",method = RequestMethod.GET)
    public String demo() {
        return "{\"name\":\"我是名字\",\"pwd\":\"我是密碼\"}";
    }
}
