
//Que-1
//_________________
//Requirements:
//----------------
//Create an interface Cake with a method:
//void showCake();
//
//
//Implement a class OrderedCake that implements the Cake interface with the following attributes:
//
//> String shape
//> String flavour
//> int qty
//> float price
//> String message (optional)
//
//|- Implement two constructors in OrderedCake:
//
// > One with parameters: shape, flavour, and qty. It should set price = qty * 400.
// > One with parameters: shape, flavour, qty, and message. It should also set price = qty * 400.
//
//|-Implement the showCake() method to:
//
//Print a standard cake message if message is not provided.
//Otherwise, print a message including the custom message.
//
//Configure two beans in application-context.xml:
//------------------------------------------------
//Bean cake1: Uses the 3-argument constructor.
//
//Bean cake2: Uses the 4-argument constructor with a custom message.
//
//In a class CakeMain, load the Spring container using ClassPathXmlApplicationContext, 
//retrieve both beans, and invoke the showCake() method on each.
//
//Expected Output:
//------------------
//A round strawberry Cake Of 1 Kg/Kg's Ready @ Rs.400/-
//A round strawberry Cake Of 4 Kg/Kg's Ready With Message Happy birthday @ Rs.1600/-
//
//💡 Additional Notes:
//> Ensure that all dependency injection is done strictly via constructors.
//  ________________________________________________________________________
//> Follow Spring’s bean configuration syntax in application-context.xml.
//Thank You ChatGPT 

package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Cake;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=
				  new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		Cake c1= ctx.getBean("cake1",Cake.class);
		Cake c2= ctx.getBean("cake2",Cake.class);
		
		 c1.showCake();
		 c2.showCake();
		 
		 ctx.close();
		
		

	}

}
