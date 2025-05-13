package com.nt.sbeans;

public class OrderCake implements Cake {
	
	private String shape;
	private String flavour;
	private double qty;
	private double price;
	private String message;
	
	

	public OrderCake(String shape,String flavour, double qty) {
		this.shape=shape;
		this.flavour= flavour;
		this.qty=qty;
		this.price= qty*400;
	}

	public OrderCake(String shape,String flavour, double qty, String message) {
		this.shape=shape;
		this.flavour=flavour;
		this.qty=qty;
		this.price=qty*400;
		this.message = message;
          
	}
	
	@Override
	public void showCake() {
		if(message==null || message.isEmpty()) {
			System.out.println( "Shape\t:"+shape+"\t"+"flavour\t:"+flavour+"\t"+"qty\t:"+qty+"\t"+"price\t:"+price);
		}else {
			System.out.println( "Shape\t:"+shape+"\t"+"flavour\t:"+flavour+"\t"+"qty\t:"+qty+"\t"+"price\t:"+price+"\t"+"Message\t:"+message);
		}
	}

	
	

}