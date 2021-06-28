package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.CConfiguration;
import com.example.demo.util.SnowflakeIdWorker;

import io.swagger.annotations.ApiOperation;

@RestController
public class SnowflakeIdController
{
    @ApiOperation(value = "SnowflakeId", notes = "")
    @RequestMapping(value = "/SnowflakeId", method = RequestMethod.GET)
    public String SnowflakeId()
    {

        String[] split = CConfiguration.StaticSnowflakeIdWorkerNode.split(",");

        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(Integer.valueOf(split[0]), Integer.valueOf(split[1]));
        return "" + idWorker.nextId();
    }

}
