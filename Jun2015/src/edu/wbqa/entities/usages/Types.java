package edu.wbqa.entities.usages;

import edu.wbqa.entities.*;

public class Types {

	public static void main(String[] args) {

		int i = 10;
		Account a1 = new Account();
		System.out.println(a1.getAccountNumber());
		System.out.println(a1.getAccountBalance());
		Account a2 = null;
		a2 = a1;
		
		a1.deposit(100);
	
		System.out.println(a2.getAccountBalance());
		// byte, short, int, long
		// float, double
		// boolean, char

		// value types
		// reference types

	}

	public static void doSomething() {

	}

}
