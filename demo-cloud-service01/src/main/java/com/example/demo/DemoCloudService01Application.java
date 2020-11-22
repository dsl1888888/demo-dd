package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@org.springframework.cloud.client.discovery.EnableDiscoveryClient
@SpringBootApplication
public class DemoCloudService01Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoCloudService01Application.class, args);
	}

}
