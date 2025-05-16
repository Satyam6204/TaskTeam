package com.nt.sbeans;

import com.nt.exception.InsufficientBalanceException;
import com.nt.exception.InvalidInputException;

public interface BankMainBranch {
	 
	void deposit(double amount)throws InvalidInputException;
	void withdraw(double amount)throws  InsufficientBalanceException,InvalidInputException;
	void viewBalance()throws InsufficientBalanceException;

}
