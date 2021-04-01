package com.onlinebanking.llcbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScans({@ComponentScan("com.onlinebanking.controller"),@ComponentScan("com.onlinebanking.config")})
public class LlcbankApplication {

	public static void main(String[] args) {
		SpringApplication.run(LlcbankApplication.class, args);
	}

}
