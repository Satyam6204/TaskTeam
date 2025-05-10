package com.nt.sbeans;

import java.time.LocalDate;

public class ProductDiscount {

	private LocalDate date;
	
	
	//Constructor
	public ProductDiscount() {
		System.out.println("ProductDiscount.ProductDiscount()");
	}

	//setter method
	public void setDate(LocalDate date) {
		System.out.println("ProductDiscount.setDate()");
		this.date = date;
	}
	
	int dis10per= 10;
	int dis20per=20;
	
	//b.logic method
	public String DiscountMethod(double price) {
		
		int day  = date.getDayOfWeek().getValue();
		
		System.out.println("Today is"+" \t\t:"+day+"Day");
		
		if(day<=5) {
			
			return "Today weekDay so You Get 10% Discount "+"FinalAmount::>\t"+(price-(price*dis10per)/100);
			
		}else {
			return"Today WeekEnd Day so You Get 20% Discount::>"+"FinalAmount::>\t"+(price-(price*dis20per)/100);
		}
		
		
		
	}
	
	
	
	
	
	

}
