package edu.wbqa.entities.usages;

import edu.wbqa.entities.*;

public class AccountTest {

	public static void main(String[] args) {

		Account a1 = new Account();
		a1.deposit(50);
		System.out.println(a1.getAccountBalance());

		Account a2 = new Account();

		Account a3 = new Account();

		a1.withdraw(80);
		a2.deposit(20);
		a3.deposit(60);

	}

}
