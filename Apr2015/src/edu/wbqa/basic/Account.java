package edu.wbqa.basic;

public class Account {

	private int accountNumber = 10;
	private static double accountBalance;
	public final String ssn;
	public AccountType accountType;
	private static double interestRate;

	public Account() {
		this(101);
		accountBalance = 25;
	}

	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
		this.ssn = "";
		// goto database
		// select * account where accountnumber = ?
		// this.accountBalance =
	}

	public static void setInterestRate(double rate) {
		interestRate = rate;
	}

	public double getAccountBalance() {
		return accountBalance + (accountBalance * interestRate);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void withdraw(double amount) {
		accountBalance -= amount;
	}

	public void deposit(double amount) {
		accountBalance += amount;
	}

}
