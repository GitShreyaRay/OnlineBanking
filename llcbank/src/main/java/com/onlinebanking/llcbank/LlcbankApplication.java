package com.onlinebanking.llcbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScans({@ComponentScan("com.onlinebanking.controller"),@ComponentScan("com.onlinebanking.config")})
@EnableJpaRepositories("com.onlinebanking.repository")
@EntityScan("com.onlinebanking.model")
public class LlcbankApplication {

	public static void main(String[] args) {
		SpringApplication.run(LlcbankApplication.class, args);
	}

}
