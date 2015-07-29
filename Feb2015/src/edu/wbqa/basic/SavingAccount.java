package edu.wbqa.basic;

public class SavingAccount extends Account {
	
	public double minimumBalance = 100;
	private static double interestRate = 0.05;
	
	static {
		//
		interestRate = 0.06;
	}
	
	public static double getInterestRate()
	{
			return interestRate;
	}

}
