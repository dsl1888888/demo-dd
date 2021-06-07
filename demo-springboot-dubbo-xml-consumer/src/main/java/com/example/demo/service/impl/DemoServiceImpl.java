package com.example.demo.service.impl;

import org.apache.dubbo.config.annotation.DubboService;

import com.example.demo.service.DemoService;

@DubboService(retries = 0)
public class DemoServiceImpl implements DemoService {
	@Override
	public String sayHello(String name) {
		return "Hello, " + name + " (from Spring Boot)";
	}
}
