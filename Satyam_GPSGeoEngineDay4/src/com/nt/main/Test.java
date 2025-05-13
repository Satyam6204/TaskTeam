package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.MapRender;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

		MapRender ige= ctx.getBean("mapRender",MapRender.class);
		
		ige.reader("RedBus", "Hyderabad", "Bus");
		
		ctx.close();
		
	}
 
}
