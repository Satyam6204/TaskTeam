package com.food.repository;

import org.springframework.stereotype.Component;

import com.food.model.Restaurant;

@Component
public class RestaurantRepository {
	public Restaurant getRestaurantById(int id) {
		return new Restaurant("Pizza", "Italian");
	}
}
