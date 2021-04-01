package com.onlinebanking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {
	
	@GetMapping("/cards")
	public String getCardDetails() {
		return "These are the card details!";
	}

}
