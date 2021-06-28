package com.example.demo.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@Component
public class CConfiguration
{

    @Value(value = "${SnowflakeIdWorkerNode}")
    private String SnowflakeIdWorkerNode;

    public static String StaticSnowflakeIdWorkerNode = "";

    @PostConstruct
    public void init()
    {
        StaticSnowflakeIdWorkerNode = SnowflakeIdWorkerNode;
        log.info("");
        log.info("");

        log.info("#####################################################################################");
        log.info("###################               CConfiguration config...............  start                 ");
        log.info("#######");
        log.info("StaticSnowflakeIdWorkerNode=" + StaticSnowflakeIdWorkerNode);
        log.info("#######");
        log.info("###################               CConfiguration config...............  end                   ");
        log.info("#####################################################################################");

    }

}
