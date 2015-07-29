package edu.wbqa.entities.usages;

import edu.wbqa.entities.Account;

public class PassByValue {

	public static void main(String[] args) {
		
		/*Account a2 = null;
		a2.withdraw(100);*/
		
		
		
		/*int c = add(1, 2);
		System.out.println(c);*/
		/*int a = 10;
		doSomething(a);
		System.out.println(a);*/

		Account a = new Account();
		doSomething(a);
		System.out.println(a.getAccountBalance());
	}
	
	public static void doSomething(Account a) {
		a.deposit(10);
		a = null;
	}

	public static void doSomething(int a) {
		a= 20;
	}

	public static int add(int a, int b) {
		return a + b;
	}

}
