package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController
{

    @RequestMapping(value = "demo")
    public String demo()
    {
        return "{\"name\":\"我是名字\",\"pwd\":\"我是密碼\"}";
    }
}
