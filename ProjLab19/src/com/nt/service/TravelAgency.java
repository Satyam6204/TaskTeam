package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nt.requirement.TravelBookingService;

@Component
public class TravelAgency {
	private TravelBookingService bookingservice;

	@Autowired
	@Qualifier("trainBooking")
	public void setbookingservice(TravelBookingService bookingservice) {
		this.bookingservice = bookingservice;
	}
	
	public void booking(String destination) {
		bookingservice.bookTicket(destination);
	}
}
