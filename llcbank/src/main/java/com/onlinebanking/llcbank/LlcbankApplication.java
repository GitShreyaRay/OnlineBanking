package com.onlinebanking.llcbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.onlinebanking")
public class LlcbankApplication {

	public static void main(String[] args) {
		SpringApplication.run(LlcbankApplication.class, args);
	}

}
