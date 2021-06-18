package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.example.demo.config.FileStorageProperties;

/**
 * https://blog.csdn.net/u012702547/article/details/88775298
 */
@EnableConfigurationProperties({ FileStorageProperties.class })
@SpringBootApplication
public class DemoSpringBootFileApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(DemoSpringBootFileApplication.class, args);
    }

}
