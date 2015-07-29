package com.whiteboxqa.oop4;

public class StaticsExample1 {

	public static void main(String[] args) {
		//SavingAccount.
		SavingAccount.changeInterestRate(0.7);

		SavingAccount s1 = new SavingAccount();
		s1.accountNumber = 211;
		s1.accountBalance = 500;

		/*
		 * s1.interestRate = 0.7; System.out.println(s1.interestRate);
		 */

		SavingAccount s2 = new SavingAccount();
		s2.accountNumber = 212;
		s2.accountBalance = 500;
		/* System.out.println(s2.interestRate); */

	}

}
