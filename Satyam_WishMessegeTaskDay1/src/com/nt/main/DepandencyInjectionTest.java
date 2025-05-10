package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DepandencyInjectionTest {
	
	public static void main(String args[]) {
		System.out.println("DepandencyInjectionTest.main()- Start:::::::::::::::::::>");
		
		ClassPathXmlApplicationContext ctx =
				 new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		WishMessageGenerator wm= ctx.getBean("wmg",WishMessageGenerator.class);
		
		String msg =wm.WishMessageMethod("bro");
		
		System.out.println(msg);
		
		ctx.close();
		
		System.out.println("DepandencyInjectionTest.main()-END:::::::::::::::::::::::::::>");
		
		
		
		
	}

}
