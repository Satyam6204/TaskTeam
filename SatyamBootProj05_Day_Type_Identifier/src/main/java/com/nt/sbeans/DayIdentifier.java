package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("df")
public class DayIdentifier {
	
	public String DayChecker(String day) {
		 	
			return switch(day) {
			
			case "monday" -> "WorkDay";
			case "tuesday" -> "WorkDay";
			case "wednesday" -> "Workday";
			case "thrusday" -> "Workday";
			case "friday" -> "WorkDay";
			case "saturday" -> "WeekEnd😎";
			case "sunday" -> "WeekEnd🥰";
			default -> throw new IllegalArgumentException("Invalid input");
			
			};
			
	}

}
