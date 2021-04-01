package com.onlinebanking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
	
	@GetMapping("/contact")
	public String saveContactInfo() {
		return "These are the contact details!";
	}

}
