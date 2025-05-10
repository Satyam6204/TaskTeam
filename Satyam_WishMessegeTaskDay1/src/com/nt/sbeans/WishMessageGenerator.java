package com.nt.sbeans;

import java.time.LocalDateTime;

public class WishMessageGenerator {
	
	private LocalDateTime time;
	
	public WishMessageGenerator() {
	System.out.println("WishMessegeGenerator.WishMessegeGenerator()");
	time = LocalDateTime.now();
	        
	}


	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	
	public String WishMessageMethod(String user) {
		System.out.println("WishMessegeGenerator.WishMessageMethod()");
		
		int hour =time.getHour();
		
		if(hour<12) {
			return "Good Morning:::🥰☺:::"+user;
		}
		else if(hour<16) {
			return"Good AfterNoon:::🎀:::"+user;
		}
		else if(hour<20) {
			return"Good Evening:::🍕:::"+user;
		}
		else {
			return "Good Night:::🎃:::";
		}
		
	}
	

}
