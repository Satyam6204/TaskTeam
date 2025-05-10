package com.nt.sbeans;

public class FatchData {
		
	private String city;
	
	private String country;

	public FatchData() {
     System.out.println("FatchData.java :::::::::::::Constructor");
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String ShowInfo() {
		
		String city = this.city;
		
		String add =this.country;
		
		return "City\t\t\t:"+city+"\nCountry\t\t:"+add;
		
	
	}
	
	
	
	

}
