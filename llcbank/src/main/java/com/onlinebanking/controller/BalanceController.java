package com.onlinebanking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {
	
	@GetMapping("/balance")
	public String getBalanceDetails() {
		return "These are the notification details!";
	}

}
