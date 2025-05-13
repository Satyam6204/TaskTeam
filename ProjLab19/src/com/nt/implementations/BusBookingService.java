package com.nt.implementations;

import org.springframework.stereotype.Component;

import com.nt.requirement.TravelBookingService;

@Component("busBooking")
public class BusBookingService implements TravelBookingService{

	@Override
	public void bookTicket(String destination) {
		System.out.println("Booking bus ticket to "+destination);
	}

}
