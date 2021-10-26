package com.example.demo.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RestTemplateConfig {

//	@Bean
//	public RestTemplate getRestTemplate(@Value("${did-service.bearer-token}") String bearerToken) {
//		RestTemplate restTemplate = new RestTemplate();
//		restTemplate.getInterceptors().add((request, body, clientHttpRequestExecution) -> {
//			HttpHeaders headers = request.getHeaders();
//			if (!headers.containsKey("Authorization")) {
//				String token = bearerToken.toLowerCase().startsWith("bearer") ? bearerToken : "Bearer " + bearerToken;
//				request.getHeaders().add("Authorization", token);
//			}
//			return clientHttpRequestExecution.execute(request, body);
//		});
//		return restTemplate;
//	}

//	@Bean
//	public RestTemplate getRestTemplate(@Value("${did-service.bearer-token}") String bearerToken) {
//		RestTemplate restTemplate = new RestTemplate();
//		restTemplate.getInterceptors().add((request, body, clientHttpRequestExecution) -> {
//			HttpHeaders headers = request.getHeaders();
//			if (!headers.containsKey("Authorization")) {
//				String token = bearerToken.toLowerCase().startsWith("bearer") ? bearerToken : "Bearer " + bearerToken;
//				request.getHeaders().add("Authorization", token);
//			}
//			return clientHttpRequestExecution.execute(request, body);
//		});
//		return restTemplate;
//	}

}