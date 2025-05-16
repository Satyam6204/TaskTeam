package com.nt.sbeans;

public class BankApplication {
	
	private BankMainBranch bank;
	

	public BankApplication(BankMainBranch bank) {
		this.bank=bank;
	}

	public void deposit(double amount)throws Exception{
		bank.deposit(amount);
	}
	
	public void withdraw(double amount)throws Exception{
		bank.withdraw(amount);
	}
	
	public void viewBalance()throws Exception{
		bank.viewBalance();
	}
	
	
	
	

}
