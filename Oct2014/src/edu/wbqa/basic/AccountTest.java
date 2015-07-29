package edu.wbqa.basic;

public class AccountTest {
	
	public static void main(String[] args) {
		
		Account a1 = new Account();
		a1.deposit(100);
		a1.deposit(100);
		
		System.out.println(a1.getAccountBalance());
	}

}
