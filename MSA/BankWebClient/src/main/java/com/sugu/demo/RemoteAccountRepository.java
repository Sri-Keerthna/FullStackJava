package com.sugu.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;


public class RemoteAccountRepository implements AccountRepository {
	
	@Autowired
	protected RestTemplate restTemplate;
	
	protected String serviceUrl;
	
	public RemoteAccountRepository(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
				: "http://" + serviceUrl;
	}
	
	@Override
	public Account getAccountDetails(Integer accountnum) {
		return restTemplate.getForObject(serviceUrl+"/getaccount/{accountnum}", Account.class,accountnum);
		 
	}

	@Override
	public Account addAccount(Account account) {
		return restTemplate.getForObject(serviceUrl + "/addaccount",
				Account.class, account);
	}
	
	@Override
	public String deleteAccount(Integer accountnum) {
		restTemplate.getForObject(serviceUrl + "/deleteaccount/{accountnum}",
				Account.class, accountnum);
		return "deleted";
	}

	@Override
	public Account getAccountByuserid(Integer userid) {
		return restTemplate.getForObject(serviceUrl+"/getaccounts/{userid}", Account.class,userid);
		 
	}
}
