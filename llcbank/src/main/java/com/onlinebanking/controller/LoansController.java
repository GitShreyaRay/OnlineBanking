package com.onlinebanking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {
	
	@GetMapping("/loans")
	public String getLoanDetails() {
		return "These are the loans!";
	}

}
