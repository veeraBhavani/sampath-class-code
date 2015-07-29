package edu.wbqa.basic;

public class Account {

	public int acctNumber;
	public double acctBalance;
	private static double interestRate = 0.09;
	
	public static double getInterestRate()
	{
		return interestRate;
	}

	public void withdraw(int amount) {
		acctBalance -= amount;
	}

	public void deposit(int amount) {
		acctBalance += amount;
	}

}
