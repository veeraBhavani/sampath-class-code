package edu.wbqa.basic;

/**
 * @see This is my first business class.
 * @version 1.0
 * @author Sampath
 * 
 */
public class Account {

	private int accountNumber;
	private double accountBalance;
	public ACCOUNTTYPE accountType;
	public int i;

	public Account() {
		if (accountBalance == 0) {
			accountBalance = 100;
		}
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {

		return accountBalance;
	}

	public void withdraw(int amount) {
		int i = 10;
		this.i = i;
		if (amount > 0) {
			accountBalance = accountBalance - amount;
		}
		System.out.println(i);
	}

	public void deposit(int amount) {
		int i = 10;
		if (amount > 0) {
			accountBalance = accountBalance + amount;
		}

	}

}
