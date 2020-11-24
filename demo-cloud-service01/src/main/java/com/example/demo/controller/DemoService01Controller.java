package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/* 类注解 */
@Api(value = "desc of class")
@RestController
public class DemoService01Controller
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

    @ApiOperation(value = "/sayHello", notes = "")
//    @RequestMapping(value = "/service01/hello/{name}")
    @RequestMapping(value = "/service01/hello")
    public String sayHello(
//                           @PathVariable("name") String name
                           )
    {
        return "Hello ,".concat(name).concat("! ");
    }
    
    @ApiOperation(value = "/ask/mRestTemplate", notes = "")
    @RequestMapping(value="/ask/mRestTemplate")
    public String ask() {
        String body = mRestTemplate.getForEntity("http://demo-cloud-service02/service02/hello",String.class).getBody();
        return body;
    }
}
