package com.nt;

import java.io.Closeable;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.EvenOrOdd;

@SpringBootApplication
public class SatyamBootProj03EvenOrOddCheckerApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SatyamBootProj03EvenOrOddCheckerApplication.class, args);
		
		EvenOrOdd eod =ctx.getBean("eo",EvenOrOdd.class);
		
		Scanner sc = new Scanner(System.in);
		boolean running = true;
		try {
			while(running) {
			System.out.print("Enter Number For Chceking Number is Even or Odd ::::::::::::\t\t");
			if(!sc.hasNextInt()) {
				System.out.println("Invalid Number");
				sc.next();
				continue;
			}
			int number =sc.nextInt();
			
			String msg = eod.EOchecker(number);
			System.out.println(msg);
			
			System.out.println();
			
			System.out.println("You want To check Another number type Y/N ");
			String againCheck= sc.next();
			
			if(againCheck.equalsIgnoreCase("Y")) {
				running = true;
			}else {
				running = false;
				System.out.println("Thank you for Visit");
			}
			
			
		}
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
		
		
		sc.close();
		((ConfigurableApplicationContext) ctx).close();
		
		
		
	}

}
