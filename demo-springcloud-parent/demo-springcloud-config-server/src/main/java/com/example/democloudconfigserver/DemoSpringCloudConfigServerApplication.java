package com.example.democloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@org.springframework.cloud.client.discovery.EnableDiscoveryClient
@org.springframework.cloud.config.server.EnableConfigServer
@SpringBootApplication
public class DemoSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringCloudConfigServerApplication.class, args);
	}

}
