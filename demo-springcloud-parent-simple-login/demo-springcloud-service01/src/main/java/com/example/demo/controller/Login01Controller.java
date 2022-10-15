package com.example.demo.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.singleandcluster.util.StringRedisUtil;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/")
@RestController
public class Login01Controller {

	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpServletResponse response;
	@Autowired
	protected HttpSession session;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

	@Autowired
	private RestTemplate mRestTemplate;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
	public String login(@RequestParam String username) {

		StringRedisUtil stringRedisUtil = new StringRedisUtil();
		stringRedisUtil.setRedisTemplate(stringRedisTemplate);

		String uuid = UUID.randomUUID().toString().replace("-", "");

		Gson gson = new GsonBuilder().serializeNulls().create();

		HashMap minimap = new HashMap<>();
		minimap.put("mobile", "13813813800");
		minimap.put("mobile1", "13813813800");
		minimap.put("username", "" + username);

		HashMap map = new HashMap<>();
		map.put("token", uuid);
		map.put("data", minimap);

		stringRedisUtil.set("token:" + uuid, gson.toJson(map));

		Object object = stringRedisUtil.get(uuid);

		String string = object.toString();

		// json to object

		return string;

	}

	@RequestMapping(value = "/getSession", method = RequestMethod.GET)
	@ResponseBody
	public String getSession() {

		StringRedisUtil stringRedisUtil = new StringRedisUtil();
		stringRedisUtil.setRedisTemplate(stringRedisTemplate);
		Gson gson = new GsonBuilder().serializeNulls().create();

		String token = request.getHeader("token");
		Object object = stringRedisUtil.get("token:" + token);

		String string = object.toString();

		return string;

	}

//	@ApiOperation(value = "/ask/mRestTemplate/getSession", notes = "")
//	@RequestMapping(value = "/ask/mRestTemplate/getSession", method = RequestMethod.GET)
//	public String ask(@RequestHeader(value = "token") String tokenReq) throws Exception {
//
//		/**
//		 * HttpHeaders headers = new HttpHeaders(); headers.setBearerAuth(accessToken);
//		 * restTemplate.exchange(RequestEntity.get(new
//		 * URI(url)).headers(headers).build(), returnType);
//		 */
//		HttpHeaders headers = new HttpHeaders();
//		headers.setBearerAuth(tokenReq);
//
//		mRestTemplate.exchange(
//				RequestEntity.get(new URI("http://demo-springcloud-service02/getSession")).headers(headers).build(),
//				null);
//		String body = mRestTemplate.getForEntity("http://demo-springcloud-service02/getSession", String.class)
//				.getHeaders()
//				.getBody();
//		return body;
//	}

	@ApiOperation(value = "/ask01/mRestTemplate/getSession", notes = "")
	@RequestMapping(value = "/ask01/mRestTemplate/getSession", method = RequestMethod.GET)
	public String ask01(@RequestHeader(value = "token") String tokenReq) {

		String body = mRestTemplate.getForEntity("http://demo-springcloud-service02/getSession", String.class)
				.getBody();
		return body;
	}

}
