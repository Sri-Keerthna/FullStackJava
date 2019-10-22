package com.sri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableEurekaClient
public class LoanWebClientApplication implements WebMvcConfigurer {

	public static final String USER_SERVICE_URL="http://loanuserservice";
	
	public static void main(String[] args) {
		SpringApplication.run(LoanWebClientApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public ClientUserService clientUserService() {
		return new RemoteUserRepository(USER_SERVICE_URL);
	}
}
