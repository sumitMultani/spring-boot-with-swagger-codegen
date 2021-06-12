package com.example.bankservice.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bankservice.service.BankService;
import com.example.demo.base.model.Account;

@Service
public class BankServiceImpl implements BankService {

	@Override
	public List<Account> getAllAccounts() {
		List<Account> accounts = new ArrayList<Account>();
		Account account1 = new Account();
		account1.setName("vivek");
		account1.setAmount("5000");
		Account account2 = new Account();
		account2.setName("Ashish");
		account2.setAmount("8000");
		accounts.add(account1);
		accounts.add(account2);
		return accounts;
	}

}
