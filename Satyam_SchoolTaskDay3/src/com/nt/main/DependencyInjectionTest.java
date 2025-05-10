package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.StaffRoom;

public class DependencyInjectionTest {

	public static void main(String[] args) throws InterruptedException {
		
		Thread.sleep(3000);
		System.out.println("IOC container Created(1)");
		
		ClassPathXmlApplicationContext ctx=
				new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		StaffRoom sf= ctx.getBean("Tl", StaffRoom.class);
		Thread.sleep(3000);
		System.out.println("getBean Executed and StaffRoom object Created use .class Class(6)");
		
		Thread.sleep(3000);
		System.out.println("Going accessData Method For data fatching this method From StaffRoom class(7)");
		 sf.accessData();
		ctx.close();

	}

}
