package com.onlinebanking.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
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
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		InMemoryUserDetailsManager userDetailsService = new InMemoryUserDetailsManager();
		UserDetails user = User.withUsername("admin").password("12345").authorities("admin").build();
		UserDetails user1 = User.withUsername("admin").password("12345").authorities("admin").build();
		userDetailsService.createUser(user);
		userDetailsService.createUser(user1);
		auth.userDetailsService(userDetailsService);
	}
	
	@Bean
	protected PasswordEncoder passwordEncoder( ) {
		return NoOpPasswordEncoder.getInstance();
	}
}
