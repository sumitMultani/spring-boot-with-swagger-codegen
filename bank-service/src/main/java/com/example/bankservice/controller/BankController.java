package com.example.bankservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.example.bankservice.service.BankService;
import com.example.demo.base.api.BankApi;
import com.example.demo.base.model.Account;

@Controller
public class BankController implements BankApi{

	@Autowired
	public BankService bankService;
	
	public ResponseEntity<List<Account>> getAllAccount() {
		return new ResponseEntity<List<Account>>(bankService.getAllAccounts(), HttpStatus.OK);
	}
}
