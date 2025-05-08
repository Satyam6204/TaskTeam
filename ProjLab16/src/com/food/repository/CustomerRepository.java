package com.food.repository;

import org.springframework.stereotype.Component;

import com.food.model.Customer;

@Component
public class CustomerRepository {
	public Customer getCustomerById(int id) {
		return new Customer("Pranaya hure", "Manjeera building, Ameerpet");
	}
	
}
