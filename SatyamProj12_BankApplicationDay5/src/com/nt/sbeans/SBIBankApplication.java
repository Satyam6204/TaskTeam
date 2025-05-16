package com.nt.sbeans;

import com.nt.exception.InsufficientBalanceException;
import com.nt.exception.InvalidInputException;

public class SBIBankApplication implements BankMainBranch {
	private String Bank_Name;
	private String Bank_Branch;
	private String IFSC;
	private double currentBalance;
	
	public void setBank_Name(String Bank_Name) {
		Bank_Name = Bank_Name;
	}

	public void setBank_Branch(String bank_Branch) {
		Bank_Branch = Bank_Branch;
	}
	
	public void setIFSC(String IFSC) {
		IFSC = IFSC;
	}

	

	@Override
	public void deposit(double amount) throws InvalidInputException {
		
		if(amount>0) {
		
		if(amount<=50000) {
			currentBalance+=amount;
			System.out.println("Successfully Deposit ");
			 System.out.println("Your Balance is : "+currentBalance+" Now");
			 System.out.println("Thanks For Using Our SBI Bank☺");
			 System.out.println();
			
		}else {
			System.err.println("Overload deposit only allow 50k or less ");
			System.out.println();
		}
		}else {
			System.err.println("Not Allow 0 or Nagative amount");
			System.out.println();
		}

	}

	@Override
	public void withdraw(double amount) throws InsufficientBalanceException, InvalidInputException  {
		if(amount>0) {
		if(currentBalance >= amount) {
           
          currentBalance-=amount;
          System.out.println("withdraw Successfull ");
          System.out.println("Your Balance is :"+currentBalance+"Now");
          System.out.println();
          
	     }else {
		 System.err.println("InsufficientBalance");
		 System.out.println();
	 }
		}else {
			System.err.println("Not allow 0 or Nagative Number");
			System.out.println();
		}

	}

	@Override
	public void viewBalance() throws InsufficientBalanceException {

      System.out.println( "Your Current Balance:"+currentBalance);

	}
 
	

}
