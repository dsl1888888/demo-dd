package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(value ={"classpath*:spring/ApplicationContext-redis.xml"})
public class XmlConfiguration {
}
//public class Config01 {
//
//}
