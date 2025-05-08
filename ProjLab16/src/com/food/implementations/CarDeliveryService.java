package com.food.implementations;

import org.springframework.stereotype.Component;

import com.food.requirement.DeliveryService;

@Component("carDelivery")
public class CarDeliveryService implements DeliveryService {

	@Override
	public void deliverOrder(String address) {
		System.out.println("Car deliver to "+address);
	}
	
}
