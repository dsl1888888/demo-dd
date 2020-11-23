package com.example.democlouddashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@org.springframework.cloud.client.discovery.EnableDiscoveryClient
@org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard
@SpringBootApplication
public class DemoCloudDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCloudDashboardApplication.class, args);
	}

}
