package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan(basePackages = { "com.example.demo.db.mapper", "com.example.demo.db.manual.mapper" })
@ComponentScan(basePackages = { 
                                "com.example.demo.**", 
                                "com.example.demo.interceptor",
                                "com.example.demo.controller",
                                "com.example.demo.service",
                                })
@SpringBootApplication
public class DemoSimpleJdbcApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(DemoSimpleJdbcApplication.class, args);
    }

}
