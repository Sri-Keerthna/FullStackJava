package com.sugu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class RemoteUserRepository implements UserRepository {

	@Autowired
	protected RestTemplate restTemplate;
	
protected String serviceUrl;
	
	public RemoteUserRepository(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
				: "http://" + serviceUrl;
	}
	
	@Override
	public User byusername(String username) {
		return restTemplate.getForObject(serviceUrl+"/user/{username}", User.class, username);
		 
	}
	
}
