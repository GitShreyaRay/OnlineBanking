package com.onlinebanking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {
	
	@GetMapping("/accounts")
	public String getAccountDetails() {
		return "These are the account details!";
	}

}
