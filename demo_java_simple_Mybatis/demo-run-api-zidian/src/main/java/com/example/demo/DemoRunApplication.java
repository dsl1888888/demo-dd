package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@SpringBootApplication
@MapperScan(basePackages = { "com.example.demo.db.mapper", 
        "com.example.demo.db.manual.mapper" ,
        "com.example.demo.db.manual.mapper" ,
        "com.ruoyi.system.mapper" ,
        "com.example.demo.mapper" 
        })
@ComponentScan(basePackages = { 
                                "com.example.demo.**", 
                                "com.example.demo.mail",
                                "com.example.demo.aspect",
                                "com.example.demo.config",
                                "com.example.demo.interceptor",
                                "com.example.demo.controller",
                                "com.example.demo.service",
                                })
@ComponentScan(value = {"io.fqyd.platform.util.web.interactive.client","com.ruoyi","com.example"})
public class DemoRunApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRunApplication.class, args);
	}

}
