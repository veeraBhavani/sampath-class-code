package edu.wbqa.entities;

/**
 * @author Sampath
 * @see this is first entity class we wrote
 * @version 1.1
 * @category business classes
 * 
 */
public class Account {
	// single line comment
	// this is another single line comment
	/*
	 * this is multi line comment multi line comment
	 */
	private int accountNumber;
	private double accountBalance;
	public AccountType accountType;

	public Account() {
		accountBalance = 25;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		double balance = 0.0;
		switch (accountType) {
		case SAVING:
			balance = accountBalance + (accountBalance * 0.04);
			break;
		case CHECKING:
			balance = accountBalance;
			break;
		default:
			balance = accountBalance;
			break;
		}
		return balance;
	}

	public void withdraw(int amount) {
		if (amount > 0) {
			accountBalance -= amount;
		}
	}

	public void deposit(int amount) {
		accountBalance += amount;
	}

}
