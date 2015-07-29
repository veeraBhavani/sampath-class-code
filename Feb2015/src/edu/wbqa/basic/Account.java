package edu.wbqa.basic;

import java.io.File;

/**
 * 
 * @author Sampath
 * @see This is my Account class written on 02/25/2015
 * @version 1.1
 * 
 */
public class Account {

	protected int accountNumber = 1;
	protected double accountBalance;
	protected AccountType accountType; // checking, saving, studentchecking
	public int a = 5;
	public static final double PI = 3.1414; 
	public final String SSN;
	
	public Account() {
		accountBalance = 1000;
		accountBalance = 25;
		SSN = "";
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public double getAccountBalance() {
		switch (accountType) {
		case Checking:
			accountBalance -= 5;
			break;
		case Saving:
			accountBalance += 5;
			break;
		case StudentChecking:
			break;
		default:
			break;
		}
		return accountBalance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	public void doSomething(int b)
	{
		int a = 10;
		this.a = a;
	}

	public void withdraw(int amount) {
		accountBalance -= amount;
	}

	public void deposit(int amount) {
		accountBalance += amount;
	}

}
