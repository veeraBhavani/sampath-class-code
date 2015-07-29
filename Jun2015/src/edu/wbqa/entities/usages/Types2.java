package edu.wbqa.entities.usages;

import edu.wbqa.entities.*;

public class Types2 {

	public static void main(String[] args) {

		Account a1;
		Account a2;
		Account a3;

		a1 = new Account();
		a1.setAccountNumber(101);
		a1.deposit(500);

		a2 = new Account();
		a2.setAccountNumber(102);
		a2.deposit(1500);

		a3 = a1;

		a1 = null;
		a1 = new Account();
		a1.setAccountNumber(103);
		a1.deposit(2500);

		a2 = null;
		a2 = a3;
		a1 = a2;

		System.out.println(a1.getAccountNumber());
		System.out.println(a2.getAccountNumber());
		System.out.println(a3.getAccountNumber());
	}

}
