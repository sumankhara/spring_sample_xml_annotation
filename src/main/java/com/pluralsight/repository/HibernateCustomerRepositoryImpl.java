package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbUsername}")
	private String dbUsername;
	
	@Autowired
	private Customer customer;
	
	@Override
	public List<Customer> findAll(){
		
		System.out.println(dbUsername);
		
		List<Customer> customers = new ArrayList<>();
		
		//Customer customer = new Customer();
		customer.setFirstname("Suman");
		customer.setLastname("Khara");
		
		customers.add(customer);
		
		return customers;
	}
}
