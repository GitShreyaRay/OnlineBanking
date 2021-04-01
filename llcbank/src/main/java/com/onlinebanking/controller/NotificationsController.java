package com.onlinebanking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationsController {
	
	@GetMapping("/notifications")
	public String getNotifications() {
		return "These are the notification details!";
	}

}
		