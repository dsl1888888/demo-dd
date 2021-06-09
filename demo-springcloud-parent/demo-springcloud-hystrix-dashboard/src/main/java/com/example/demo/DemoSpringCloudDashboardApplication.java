package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@org.springframework.cloud.client.discovery.EnableDiscoveryClient
@org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard
@SpringBootApplication
public class DemoSpringCloudDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringCloudDashboardApplication.class, args);
	}

}
