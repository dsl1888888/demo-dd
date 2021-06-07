package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.WykjUserIdRemoteService;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class ConsumerController {

	@Autowired
	private WykjUserIdRemoteService wykjUserIdRemoteService;

	@ApiOperation(value = "dubboReq", notes = "dubboReq")
	@RequestMapping(value = "/dubboReq", method = RequestMethod.GET)
	public String dubboReq() {

		String demo = wykjUserIdRemoteService.demo();

		return demo;
	}

}
