package com.example.demo.controller;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.singleandcluster.util.StringRedisUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

/* 类注解 */
@Slf4j
@Api(value = "desc of class")
@RestController
public class DemoRedisController
{

    private static final String solrDataName = "demo1";

    @Autowired
    private StringRedisTemplate redisTemplate;

    @PostConstruct
    public void init()
    {

        try
        {
            log.info(redisTemplate.toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /* 方法注解 */
    @ApiOperation(value = "queryById", notes = "")
    @RequestMapping(value = "demo/redis/queryById", method = RequestMethod.GET)
    public String queryById(String id)
    {
        String resp = "";

        StringRedisUtil stringRedisUtil = new StringRedisUtil();
        stringRedisUtil.setRedisTemplate(redisTemplate);

        Object object = stringRedisUtil.get(id);

        return "" + JSON.toJSONString(object);
    }

    /* 方法注解 */
    @ApiOperation(value = "detele", notes = "")
    @RequestMapping(value = "demo/redis/detele", method = RequestMethod.GET)
    public String detele(String id)
    {
        StringRedisUtil stringRedisUtil = new StringRedisUtil();
        stringRedisUtil.setRedisTemplate(redisTemplate);

        stringRedisUtil.deleteAll(id);
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
    @ApiOperation(value = "insertOne", notes = "")
    @RequestMapping(value = "demo/redis/insertOne", method = RequestMethod.GET)
    public String insertOne() throws IOException
    {
        StringRedisUtil stringRedisUtil = new StringRedisUtil();
        stringRedisUtil.setRedisTemplate(redisTemplate);

        stringRedisUtil.set("1",
                            "[{\"code\":\"1\",\"value\":\"https://h5.cashlena.com/web/UserNotice.html\"},{\"code\":\"2\",\"value\":\"https://h5.cashlena.com/web/PrivacyPolicy.html\"},{\"code\":\"3\",\"value\":\"https://h5.cashlena.com/Protocol/borrow\"},{\"code\":\"4\",\"value\":\"https://h5.cashlena.com/web/empower/empower.html\"}]");
        return "{\"name\":\"我是名字\",\"pwd\":\"我是密碼\"}";
    }
}
