package com.nt.sbeans;

import com.nt.SatyamBootProj05DayTypeIdentifierApplication;
import org.springframework.stereotype.Component;

@Component("df")
public class DayIdentifier {

    private final SatyamBootProj05DayTypeIdentifierApplication satyamBootProj05DayTypeIdentifierApplication;

    DayIdentifier(SatyamBootProj05DayTypeIdentifierApplication satyamBootProj05DayTypeIdentifierApplication) {
        this.satyamBootProj05DayTypeIdentifierApplication = satyamBootProj05DayTypeIdentifierApplication;
    }
	
	public String DayChecker(String day) {
		if(day==null) {
			 System.out.println("Please enter Week Day name");
		}
		 	
			return switch(day.toLowerCase()) {
			
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
