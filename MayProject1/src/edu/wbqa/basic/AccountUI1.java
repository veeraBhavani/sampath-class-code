package edu.wbqa.basic;

public class AccountUI1 {

	public static void main(String[] args) {

		Account a = new Account();			
		
		

		a.deposit(100);
		System.out.println(a.getAccountBalance());

		Account b = new Account();
		b.withdraw(100);

	}

}
