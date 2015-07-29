package com.whiteboxqa.oop4;

public class SavingAccount {
	
	public int accountNumber;
	public double accountBalance;
	private static double interestRate; //class variables
	//static variables
	
	
	public static void changeInterestRate(double rate)
	{
		interestRate = rate;
		
	}
	
	public double getBalance()
	{
		return this.accountBalance + (accountBalance * interestRate);
	}

}
