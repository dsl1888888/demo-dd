package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication(exclude = { 
       MongoAutoConfiguration.class, 
       MongoDataAutoConfiguration.class,
		DataSourceAutoConfiguration.class, 
		RedisAutoConfiguration.class, 
		RedisRepositoriesAutoConfiguration.class })
@ComponentScan(basePackages = { 
		"com.example.demo", 
		"com.example.demo.config", 
		"com.example.demo.config.service" })
public class DemoProviderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProviderServiceApplication.class, args);
	}

}
