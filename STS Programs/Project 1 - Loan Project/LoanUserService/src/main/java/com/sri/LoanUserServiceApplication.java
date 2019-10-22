package com.sri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LoanUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanUserServiceApplication.class, args);
	}

}
