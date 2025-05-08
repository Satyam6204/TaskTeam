package com.food.implementations;


import org.springframework.stereotype.Component;

import com.food.requirement.DeliveryService;

@Component("bikeDelivery")
public class BikeDeliveryService implements DeliveryService{

	@Override
	public void deliverOrder(String address) {
		System.out.println("Bike deliver to "+address);
	}

}
