package com.example.demo.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.WykjUserIdRemoteService;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class ConsumerController {

//	@Reference(version = "0.0.1") // 最简单的用法
	@Reference(version = "0.0.1", check = false) // check 参数,启动时候不检查提供者在线不. 默认为true,如果提供者不在线直接启动消费者,项目启动不起来.
//	@Reference(version = "0.0.1", retries = 1, timeout = 8000, cluster = "failfast") //集群策略优先重试次数参数,集群快速失败的话,不会再进行重试了
//	@Reference(version = "0.0.1", retries = 0, timeout = 8000, cluster = "failfast")
//	@Reference(version = "0.0.1", retries = 0, timeout = 8000)
//	@Reference(version = "0.0.1", retries = 1, timeout = 8000) // 如果第一次没有调通,将会还有一次机会
//	@Reference(version = "0.0.1", timeout = 8000) //这里没有限制重试次数,请求超时将会调用多次接口
	private WykjUserIdRemoteService wykjUserIdRemoteService;

	@ApiOperation(value = "dubboReq", notes = "dubboReq")
	@RequestMapping(value = "/dubboReq", method = RequestMethod.GET)
	public String dubboReq() {

		String demo = wykjUserIdRemoteService.demo();

		return demo;
	}

}
