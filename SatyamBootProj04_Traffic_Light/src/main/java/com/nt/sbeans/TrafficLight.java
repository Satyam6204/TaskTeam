package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("tl")
public class TrafficLight {
	
	public String Action(String color) {
		
		return switch(color.toLowerCase()) {
		case "red" ->  "STOP";
		case "yellow" -> "WAIT";
		case "green" -> "GO";
		default ->	throw new IllegalArgumentException("invalid Option "+color);
		};
	}
}
