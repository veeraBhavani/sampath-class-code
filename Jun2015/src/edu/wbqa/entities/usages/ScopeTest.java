package edu.wbqa.entities.usages;

import edu.wbqa.entities.*;

public class ScopeTest {

	public static void main(String[] args) {

		Account a1 = new Account();
		Account a2 = new Account();

		System.out.println(a1.getAccountNumber());
		a1.deposit(100);
		System.out.println(a2.getAccountNumber());
		a2.deposit(100);
		
		ScopeExample se1 = new ScopeExample();
		
		se1.doSomething();

	}

}
