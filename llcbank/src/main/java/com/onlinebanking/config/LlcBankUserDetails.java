package com.onlinebanking.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.onlinebanking.model.Customer;
import com.onlinebanking.model.SecurityCustomer;
import com.onlinebanking.repository.CustomerRepository;

@Service
public class LlcBankUserDetails implements UserDetailsService {
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		List<Customer> customer = customerRepository.findByEmail(username);
		if (customer.size() == 0) {
			throw new UsernameNotFoundException("Username not found for user :"+ username);
		}
		return new SecurityCustomer(customer.get(0));
	}

}
