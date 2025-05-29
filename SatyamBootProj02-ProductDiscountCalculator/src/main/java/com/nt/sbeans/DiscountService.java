package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("pdp")
public class DiscountService {
	
	public double getDiscount(double price, double persentage) {
		double result =0.0;
		
		if(price>=0 && persentage>=0) {
			
			double discount = (price * persentage)/100;
			 result = price -discount;
			
		
			
		}else {
			System.out.println("Please Enter Correct Price and persentage");
		}
		
		return result;
		
	}
	
	

}
