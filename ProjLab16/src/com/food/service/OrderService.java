package com.food.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.food.model.Customer;
import com.food.model.Restaurant;
import com.food.repository.CustomerRepository;
import com.food.repository.RestaurantRepository;
import com.food.requirement.DeliveryService;

@Component
public class OrderService {
	@Autowired
	private CustomerRepository custRepository;
	
	@Autowired
	private RestaurantRepository restRepository;
	
	@Autowired
	@Qualifier("bikeDelivery")
	private DeliveryService deliService;
	
	public void placeOrder(int customerId, int restaurantId) {
		Customer customer = custRepository.getCustomerById(customerId);
		Restaurant restaurant = restRepository.getRestaurantById(restaurantId);
		
        System.out.println("Placing order from " + restaurant.getName() + " for customer " + customer.getName());
        deliService.deliverOrder(customer.getAddress());
	}
}
