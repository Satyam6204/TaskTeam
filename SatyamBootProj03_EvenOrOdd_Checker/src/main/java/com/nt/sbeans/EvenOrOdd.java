package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("eo")
public class EvenOrOdd {
	
	public String EOchecker(double num) {
		 if(num==2) {
			 return num+":::Number is Even";
			 
		 }else if(num%2==0) {
				 
			return num+"::Number is Even";
			 
		 }else {
			 return num+"::Number is Odd";
		 }
		
	}
	

}
