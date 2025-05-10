package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Library;

public class DependencyInjection {
	
	public static void main(String[] args) {
	
	ClassPathXmlApplicationContext ctx=
			new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	
	Library lb =ctx.getBean("Blib",Library.class);
	
	String msg = lb.LibraryBooks();
	
	System.out.println(msg);
	
	
	}
	

}
