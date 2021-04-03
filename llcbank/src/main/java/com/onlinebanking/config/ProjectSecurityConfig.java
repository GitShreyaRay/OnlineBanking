package com.onlinebanking.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class ProjectSecurityConfig extends WebSecurityConfigurerAdapter {
	
	/**
	 * /accounts - Secured
	 * /balance  - Secured
	 * /loans   - Secured 
	 * /cards  - Secured
	 * /notifications  - Not Secured
	 * /contact  - Not Secured
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
				.antMatchers("/accounts").authenticated()
				.antMatchers("/balance").authenticated()
				.antMatchers("/loans").authenticated()
				.antMatchers("/cards").authenticated()
				.antMatchers("/notifications").permitAll()
				.antMatchers("/contact").permitAll()
				.antMatchers("/welcome").permitAll()
				.and()
			.formLogin().and()
			.httpBasic();
	}
	

	@Bean
	protected PasswordEncoder passwordEncoder( ) {
		return NoOpPasswordEncoder.getInstance();
	}
	

}
