package com.sugu.demo;

public interface AccountRepository {

	Account getAccountDetails(Integer accountnum);

	Account addAccount(Account account);

	String deleteAccount(Integer accountnum);

	Account getAccountByuserid(Integer userid);

}
