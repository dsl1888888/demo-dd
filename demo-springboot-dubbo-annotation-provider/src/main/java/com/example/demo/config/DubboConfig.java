package com.example.demo.config;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboConfig {
	@Bean
	public ApplicationConfig applicationConfig() {
		ApplicationConfig config = new ApplicationConfig();
		config.setName("boot-user-service-provider");
		return config;
	}
//————————————————
//版权声明：本文为CSDN博主「如不來」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//原文链接：https://blog.csdn.net/rubulai/article/details/84843975

	@Bean
	public RegistryConfig registryConfig() {
		RegistryConfig config = new RegistryConfig();
		config.setProtocol("zookeeper");
		config.setAddress("127.0.0.1:2181");
		return config;
	}
//	————————————————版权声明：本文为CSDN博主「如不來」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。原文链接：https:// blog.csdn.net/rubulai/article/details/84843975
}
