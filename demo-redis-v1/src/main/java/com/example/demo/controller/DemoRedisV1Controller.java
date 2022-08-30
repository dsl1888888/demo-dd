package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.singleandcluster.util.HashRedisUtil;
import com.singleandcluster.util.StringRedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.io.IOException;

/* 类注解 */
@Slf4j
@Api(value = "desc of class")
@RestController
public class DemoRedisV1Controller {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @PostConstruct
    public void init() {

        try {
            log.info(redisTemplate.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* 方法注解 */
    @ApiOperation(value = "queryById", notes = "")
    @RequestMapping(value = "demo/redis/queryById", method = RequestMethod.GET)
    public String queryById(String tv, String key) {
        String resp = "";

        HashRedisUtil hashRedisUtil = new HashRedisUtil();
        hashRedisUtil.setRedisTemplate(redisTemplate);

        Object object = hashRedisUtil.get(tv, key);

        return "" + JSON.toJSONString(object);
    }

    /* 方法注解 */
    @ApiOperation(value = "detele", notes = "")
    @RequestMapping(value = "demo/redis/detele", method = RequestMethod.GET)
    public String detele(String id) {
        HashRedisUtil hashRedisUtil = new HashRedisUtil();
        hashRedisUtil.setRedisTemplate(redisTemplate);

        hashRedisUtil.deleteAll(id);
        return "ok";
    }

    // /* 方法注解 */
    // @ApiOperation(value = "insertBatch", notes = "")
    // @RequestMapping(value = "demo/redis/insertBatch", method =
    // RequestMethod.GET)
    // public String insertBatch() throws IOException {
    //
    // return "{\"name\":\"我是名字\",\"pwd\":\"我是密碼\"}";
    // }

    /* 方法注解 */
    @ApiOperation(value = "insert", notes = "")
    @RequestMapping(value = "demo/redis/insert", method = RequestMethod.GET)
    public String insertOne() throws IOException {
        HashRedisUtil hashRedisUtil = new HashRedisUtil();
        hashRedisUtil.setRedisTemplate(redisTemplate);


        for (int i = 0; i < 200000; i++) {
            hashRedisUtil.set("tvlizi", "key" + i, "value" + i);
        }

        return "{\"name\":\"我是名字\",\"pwd\":\"我是密碼\"}";
    }
}
