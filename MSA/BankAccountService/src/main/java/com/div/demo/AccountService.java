package com.div.demo;

import java.util.List;
import java.util.Optional;


public interface AccountService {

	public void addAccount(Account account);

	public Account getAccountDetails(Integer accountnum);

	public String deleteAccount(Integer accountnum);

	public List<Account> getAccountByuserid(Integer userid);

}
