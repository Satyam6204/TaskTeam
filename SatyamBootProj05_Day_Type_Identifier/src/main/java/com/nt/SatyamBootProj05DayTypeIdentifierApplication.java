package com.nt;

import java.io.Closeable;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.DayIdentifier;

@SpringBootApplication
public class SatyamBootProj05DayTypeIdentifierApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(SatyamBootProj05DayTypeIdentifierApplication.class, args);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Day \t:");
		 
		if(sc.hasNext()) {
		
		String name =sc.next();
		
		DayIdentifier cf = ctx.getBean("df",DayIdentifier.class);
		
		String msg = cf.DayChecker(name);
		
		System.out.println(name+" -> "+ msg);

		sc.close();
		((ConfigurableApplicationContext) ctx).close();
		
		
		}
	}

}
