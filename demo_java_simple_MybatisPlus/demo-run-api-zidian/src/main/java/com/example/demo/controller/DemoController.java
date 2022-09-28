package com.example.demo.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("demo")
@Slf4j
public class DemoController
{

    @RequestMapping("demo/tes")
    @ResponseBody
    public HashMap<String, String> tes()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("name", "我是名字");
        map.put("pwd", "我是密碼");
        return map;
    }

 
}
