package com.nt.sbeans;

import com.nt.exception.InsufficientBalanceException;
import com.nt.exception.InvalidInputException;

public class ICICApplication implements BankMainBranch {
	private String Bank_Name;
	private String Bank_Branch;
	private String IFSC;
	private double currentBalance;
	
	public void setBank_Name(String Bank_Name) {
		Bank_Name = Bank_Name;
	}

	public void setBank_Branch(String Bank_Branch) {
		Bank_Branch = Bank_Branch;
	}

	public void setIFSC(String IFSC) {
		IFSC = IFSC;
	}

@Override
public void deposit(double amount)throws InvalidInputException {
	 if(amount >0) {
		 
		   if(amount<=50000) {
			   currentBalance+=amount;
				System.out.println("Successfully Deposit ");
				 System.out.println("Your Balance is : "+currentBalance+" Now");
				 System.out.println("Thanks For Using Our ICIC Bank☺\n");
		   }else {
			   System.err.println("Please Deposit 50k or less\n");
		   }
	 }else {
		 System.err.println("Please Enter Positive Number here Not allow 0 amount or Nagative amount\n");
	 }
}

@Override
public void withdraw(double amount)throws InsufficientBalanceException, InvalidInputException{
	if(amount>0) {
		if(currentBalance>=amount) {
			currentBalance-=amount;
			System.out.println("Withdraw Successfully");
			System.out.println("You Current Balance is :"+currentBalance+"Now\n");
		}else {
		    System.err.println("Insufficient Balance\n");
		}
	}else {
		System.err.println("Please Enter Positive Amount here Not Allow Zero(0) or Nagative amount \n");
	}
}
@Override
public void viewBalance()throws InsufficientBalanceException{
	System.out.println("(ICIC)Your Current Balance is "+currentBalance+"\n");
     }
}
