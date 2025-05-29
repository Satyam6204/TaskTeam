/*
 * Program02.Spring Boot Core Task: Product Discount Calculator
=======================================

✅ Objective
Build a Spring Boot Core-based console application that:

Accepts product price and discount percentage.

Calculates and prints the final price after discount.

🛠 Task Requirements

1️.Main Application Class

Use @SpringBootApplication.

Launch the app using SpringApplication.run().

2️.DiscountService Class

Annotate it with @Component.

Add a method:
public double applyDiscount(double price, double discountPercentage)
→ returns the discounted price.

3️.Input Handling

Use Scanner to prompt:
Enter original price:
Enter discount percentage:
4️.Output

Print the result:
Final price after discount: $450.0

*/

package com.nt;

import java.io.Closeable;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.DiscountService;

@SpringBootApplication
public class SatyamBootProj02ProductDiscountCalculatorApplication {

	public static void main(String[] args) {
		System.out.println("Program Start ");
		ApplicationContext ctx =SpringApplication.run(SatyamBootProj02ProductDiscountCalculatorApplication.class, args);
		
		DiscountService ds =ctx.getBean("pdp",DiscountService.class);
		
		Scanner sc  = new Scanner(System.in);
		
		boolean running =true;
		
		while(running) {
			
		System.out.print("Enter Price \t\t\t:\s");
		if(!sc.hasNextDouble()) {
			System.out.print("Invalid Input");
			sc.next();
			continue;
		}
		double price = sc.nextInt();
		System.out.println();
		System.out.print("Enter Persentage\t:\s");
		if(!sc.hasNextDouble()) {
			System.out.print("Invalid Input");
			sc.next();
			continue;
		}
		double pre =sc.nextDouble();
		System.out.println();
		
		
		double res = ds.getDiscount(price, pre);
		System.out.println("Product Discount Price😎::::\s"+res);
			
		System.out.println("You want check another Product Discount type Y/N");
		if(!sc.hasNextDouble()) {
			System.out.println("Invalid Input");
			sc.next();
			continue;
		}
		String val = sc.next();
		 if (!val.equalsIgnoreCase("Y")) {
             running = false;
         }

		
		
		}
		
		
		
		sc.close();
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
