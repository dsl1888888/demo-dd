package com.example.demo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableDubbo(scanBasePackages = { "com.example.demo", "com.fuyin.lima" })
//@SpringBootApplication
//@PropertySource("classpath:/spring/dubbo-consumer.properties")
//@MapperScan(basePackages = { "com.example.demo.db.mapper", 
//                             "com.example.demo.db.manual.mapper" ,
//                             "com.jww.ump.generator.mapper" 
//})
@ComponentScan(value = { "com.example.demo", "com.fuyin.lima", "com.jww.ump.generator.web" })

@SpringBootApplication(exclude = { MongoAutoConfiguration.class, MongoDataAutoConfiguration.class,
		DataSourceAutoConfiguration.class })
//@EnableScheduling
public class DemoSpringbootDubboXmlConsumerApplication {

	@Value("${server.port}")
	private String serverport;

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringbootDubboXmlConsumerApplication.class, args);
	}

}
