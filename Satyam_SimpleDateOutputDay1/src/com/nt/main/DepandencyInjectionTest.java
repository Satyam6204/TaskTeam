package com.nt.main;

import java.time.LocalDate;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.showDate;

public class DepandencyInjectionTest {
    

	public static void main(String[] args) {
		
		System.out.println("DepandencyInjectionTest.main()-(Start:::::::::::::::::::::::::::>)");
		
		//Creating IOC container
		
		FileSystemXmlApplicationContext ctx= 
				 new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		Object obj=ctx.getBean("tdate");
		
		showDate sd =(showDate)obj;
		
		LocalDate msg =sd.WhatDate();
		
		System.out.println("Today date is ::\t"+msg);
		
		ctx.close();
		
		
		System.out.println("DepandencyInjectionTest.main()-(END):::::::::::::::::::::::::>");

	}

}
