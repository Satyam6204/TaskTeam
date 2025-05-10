package com.nt.sbeans;

import java.time.LocalDate;


public class showDate {
	
	
	private LocalDate d;
	
	public showDate() {
		System.out.println("showDate()-0 param Constructor");
	}
		
	public void setDate(LocalDate date) {
		System.out.println("showDate.setDate()");
		this.d= d;
	}

	public LocalDate WhatDate() {
		
		System.out.println("showDate.WhatDate()");
		
	return LocalDate.now();
	}
	
	

}
