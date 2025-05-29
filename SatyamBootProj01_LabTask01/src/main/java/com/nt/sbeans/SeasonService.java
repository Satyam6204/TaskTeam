package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonService {
	
	public String getSeason(int month) {
		
		switch(month) {
		case 12: case 1: case 2:
			  return "Winter Season ❄";
		case 3: case 4: case 5:
			return "Summer Season 🌞";
		case 6: case 7: case 8:
			return "Rainy Season ☔";
		case 9: case 10: case 11:
			return "Spring Season ⛱🌫";
		default:
			return "Invalid Input 😡";
		
		}
	 }
}
		

