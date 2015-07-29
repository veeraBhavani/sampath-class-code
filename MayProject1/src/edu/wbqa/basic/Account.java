package edu.wbqa.basic;

import java.util.*;
import java.lang.*;

import javax.security.auth.login.AccountNotFoundException;

/**
 * @version 1.1
 * @see This is the first class we have wrote
 * @author Sampath
 * 
 */
public class Account {

	private int accountNumber;
	private double accountBalance;
	private String accountType;
	private static double interestRate;
	private static double routingNumber = 0.0004;

	public Account() {
		accountNumber = 101;
		accountBalance = 100;
	}

	public Account(int accountN) {
		this();
		accountBalance = 100;
	}

	static {
		// go to db
		interestRate = 0.0004;
	}

	// This is one line comment
	/*
	 * multi line comment
	 */

	public static double getInterestRate() {
		// goto
		return interestRate;
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

	public void withdraw(double amount) {
		Date d = new Date();
		accountBalance = accountBalance - amount;
	}

	public void deposit(double amount) {
		accountBalance = accountBalance + amount;
	}

	public int add(int a, int b) {
		return a + b;
	}

	public void finalize() {
		// Account a = this;
	}

}
