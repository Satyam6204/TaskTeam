package com.nt.implementations;

import org.springframework.stereotype.Component;

import com.nt.requirement.TravelBookingService;

@Component("trainBooking")
public class TrainBookingService implements TravelBookingService{

	@Override
	public void bookTicket(String destination) {
		System.out.println("Booking train ticket to "+destination);
	}

}
