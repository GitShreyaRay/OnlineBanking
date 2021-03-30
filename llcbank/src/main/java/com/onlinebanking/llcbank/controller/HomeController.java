package com.onlinebanking.llcbank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/welcome")
	public String sayWelcome() {
		return "Welcome User!";
	}

}
