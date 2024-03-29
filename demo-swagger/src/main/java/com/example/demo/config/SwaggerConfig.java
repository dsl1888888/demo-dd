package com.example.demo.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig
{

	  @Bean
	    public Docket api() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .apiInfo(apiInfo())
	                .pathMapping("/")
	                .select() // 选择那些路径和api会生成document
	                .apis(RequestHandlerSelectors.any())// 对所有api进行监控
	                //不显示错误的接口地址
	                .paths(Predicates.not(PathSelectors.regex("/error.*")))//错误路径不监控
	                .paths(PathSelectors.regex("/.*"))// 对根下所有路径进行监控
	                .build();
	    }

	    private ApiInfo apiInfo() {
	        return new ApiInfoBuilder().title("Doc Title")
	                .contact(new Contact("demo", "", "dorosdebby@gmail.com"))
	                .description("Doc description")
	                .termsOfServiceUrl("NO terms of service")
	                .license("The Apache License, Version 2.0")
	                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
	                .version("v1.0")
	                .build();
	    }
//	————————————————
//	版权声明：本文为CSDN博主「会飞的照相机」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//	原文链接：https://blog.csdn.net/qq_41280118/article/details/109499481

}