/*
Travel Booking System:
==================================
Problem Statement:
--------------------
Develop an application to book travel tickets via bus or train.

Requirements:
Interface:
Create TravelBookingService:
void bookTicket(String destination);
Implementations:

BusBookingService ➔ "Booking bus ticket to <destination>"

TrainBookingService ➔ "Booking train ticket to <destination>"

Annotations:

@Component("busBooking")

@Component("trainBooking")

TravelAgency Class:

Inject TravelBookingService using setter injection.

Use @Autowired + @Qualifier("trainBooking").

Configuration:

AppConfig class with @Configuration + @ComponentScan.

Main Class:

Load context.

Book a ticket to "Mumbai".

 */

package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.service.TravelAgency;

public class MainTestClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		TravelAgency agency = ctx.getBean(TravelAgency.class);
		agency.booking("Mumbai");
		
		ctx.close();
	}
}
