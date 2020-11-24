package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.swagger.annotations.Api;

/* 类注解 */
@Api(value = "desc of class")
@RestController
public class DemoService02Controller
{
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }


    @Value("${spring.application.name}")
    private String name;
    
    @Autowired
    private RestTemplate mRestTemplate;

//    @RequestMapping(value = "/service02/hello/{name}")
    @RequestMapping(value = "/service02/hello")
    public String sayHello()
    {
        return "Hello ,".concat(name).concat("! ");
    }

}
