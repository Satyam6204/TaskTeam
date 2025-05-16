
/*
 * 💻 Programming Question: Bank Application Using Spring Dependency Injection
_____________________________________________________________________________
📝 Problem Statement:
----------------------
You are required to build a banking system using Java and Spring Framework where users can interact with different
banks (like SBI and ICICI) to perform basic operations such as deposit, withdraw, and view balance.
The solution should use Spring Bean configuration (XML-based) to inject the bank implementation dynamically into a central application.
------------------------------------------------------------------------------------------------
🎯 Requirements
----------------------
[Create a package as com.BankApplication.requirement]
[inside this package create the below component.    ]

1. Define Interface: 
=====================
Create a common interface BankMainBranch containing the following abstract methods:
void deposite(double amount) throws InvalidInputException;
void withdraw(double amount) throws InsufficientBalanceException, InvalidInputException;
void viewBalance() throws InsufficientBalanceException;
-----------------------------------------------------------------------------------------------
[Create a package as com.nit.exception]
[inside this package create the below component]

2. Custom Exceptions:
======================
Create two custom checked exceptions:

InvalidInputException: For invalid amounts (e.g., negative or too large).

InsufficientBalanceException: For withdrawal attempts exceeding the current balance.
------------------------------------------------------------------------------------------------
[Create a package as com.nit.exception]
[inside this package create the below component]

3. Implementations:
=======================
Implement the BankMainBranch interface in two classes:

SBIBankApplication
|- Having the fileds as
   |- private static String bankName;
   |- private static String bankAddress;
   |- private static String IFSC_Code;
      [ THESE fields should be initialize with the setter ]

   |- private int currentBalance;
      [ THIS currentBalance should be initialize through deposite method only]

ICICIApplication
   |- private static String bankName;
   |- private static String bankAddress;
   |- private static String IFSC_Code;
      [ THESE fields should be initialize with the setter ]

   |- private int currentBalance;
      [ THIS currentBalance should be initialize through deposite method only]


Each bank should:
-----------------
Rule 1: Restrict deposits to amounts up to 50,000 INR.
Rule 2: Allow withdrawals only if the current balance is sufficient.
 
> Create Deposite Method having the parameter as amount 
  |- Apply the Rule 1 and Rule 2 logic inside this method 
  |- IF THE LOGIC WILL NOT WORK THROUGH EXCEPTION AS InvalidInputException

> Create Withdraw Method having the parameter as amount 
  |- Apply the logic as user can't withdraw 0 and negative as amount 
     and can't withdraw the amount more than the current balance 
  |- IF THE LOGIC WILL NOT WORK THROUGH EXCEPTION AS InsufficientBalanceException
---------------------------------------------------------------------------------------------------
4. Spring Bean Configuration:
-----------------------------
Use an XML configuration file (applicationContext.xml) to define:

One BankApplication bean that depends on a specific BankMainBranch bean.

Beans for both SBIBankApplication and ICICIBankApplication implementations.
Inject all the fields through setter injection inside the bean. 

Inject BankMainBranch into BankApplication via a constructor injection .
---------------------------------------------------------------------------------------------------
5. Main Application:
==============================
Create a class BankUser that:

> Reads user input via Scanner.
> Loads Spring beans from the XML file using XmlBeanFactory.

Allows the user to:
---------------------
> Deposit money
> Withdraw money
> View balance

Ensure proper exception handling and clear user prompts for each operation.
---------------------------------------------------------------------------------------------------
📁 Directory Structure (Suggestion):
com.nit.exception
  └── InvalidInputException.java
  └── InsufficientBalanceException.java

com.nit.requirement
  └── BankMainBranch.java

com.nit.beans
  └── SBIBankApplication.java
  └── ICICI.java

com.nit.implementation
  └── BankApplication.java

com.nit.autowireTest
  └── BankUser.java

com/nit/commons
  └── applicationContext.xml
------------------------------------------------------------------------------------------------------
🔁 Sample Interaction:
Sample Output syntax
__________________________________
Enter the bank choice application
For deposite press deposite
For withdraw press withdraw
For view Balance press view

> deposite
Enter the amount you want to deposite
> 10000
(Amount deposited successfully)

> viewBalance

Message from SBI
10000.0

 * 
 * */
package com.nt.main;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.BankApplication;

public class Test {

	public static void main(String[] args) throws Exception {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::Bank Application:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		ClassPathXmlApplicationContext ctx=
				new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		System.out.println("Type your bank name : SBI or ICIC only for these two Bank Service Now");
		System.out.print("Bank Name:\t");
		 
		String name =sc.next().toLowerCase();
			
			if(name.equals("sbi")) {
				BankApplication bank = ctx.getBean("banksbi",BankApplication.class);
				
			System.out.println("Welcome TO SBI Bank::::::::::🎇");
			
			System.out.println(":::::::::::::::::::::Service Option::::::::::::::::::::::::::::;;");
		
			
			
    while(true) {
				
			System.out.println("""
				  Option 1 for Deposit Money
				  Option 2 for Withdraw Money
				  Option 3 for View Balance	
					""");
			
			int opt= sc.nextInt();
			
			switch(opt) {
			case 1:{
				System.out.print("Enter Amount for Deposit\t:");
				double amt =sc.nextDouble();
				bank.deposit(amt);
			}
			break;
			case 2:{
				System.out.print("Enter Amount for Withdraw\t:");
				double amt =sc.nextDouble();
				bank.withdraw(amt);
			}
			break;
			case 3:{
				bank.viewBalance();
			}
			break;
			default:{
				System.out.println("Enter Valid Option");
			}
			
			}
			}
    
			}
			else if(name.equals("icic")) {
				BankApplication bank= ctx.getBean("bankicic",BankApplication.class);
				System.out.println("Welcome TO ICIC Bank::::::::::🎇");
				
				System.out.println(":::::::::::::::::::::Service Option::::::::::::::::::::::::::::;;");
				while(true) {
				System.out.println("""
					  Option 1 for Deposit Money
					  Option 2 for Withdraw Money
					  Option 3 for View Balance	
						""");
				
				int opt= sc.nextInt();
				
				switch(opt) {
				case 1:{
					System.out.print("Enter Amount for Deposit\t:");
					double amt =sc.nextDouble();
					bank.deposit(amt);
				}
				break;
				case 2:{
					System.out.print("Enter Amount for Withdraw\t:");
					double amt =sc.nextDouble();
					bank.withdraw(amt);
				}
				break;
				case 3:{
					bank.viewBalance();
				}
				break;
				default:{
						System.out.println("Chose Any one Service");
					}
				}
     		}			
		}
	}
}


