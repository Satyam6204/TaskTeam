package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.FatchData;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		FatchData fd=ctx.getBean("Person",FatchData.class);
		
		String msg= fd.ShowInfo();
		
		System.out.println(msg);
		
		ctx.close();
		
		System.out.println("DependencyInjectionTest-End::::::::::>");
		

	}

}
