package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.singleandcluster.util.StringRedisUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/Login02Method02Controller")
@RestController
public class Login02Method02Controller {

	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpServletResponse response;
	@Autowired
	protected HttpSession session;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    

	@RequestMapping(value = "/getSession", method = RequestMethod.GET)
	@ResponseBody
	public String getSession(@RequestHeader(value = "token") String token) {

		StringRedisUtil stringRedisUtil = new StringRedisUtil();
		stringRedisUtil.setRedisTemplate(stringRedisTemplate);
		Gson gson = new GsonBuilder().serializeNulls().create();

		Object object = stringRedisUtil.get("token:" + token);

		String string = object.toString();

		return string;

	}
    
}
