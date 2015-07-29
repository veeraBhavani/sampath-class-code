package edu.wbqa.basic;

public class Test4 {
	
	public static void main(String[] args) {
		
		Account a1 = new Account();
		a1.setAccountType(AccountType.Checking);
		a1.setAccountNumber(101);
		a1.deposit(1000);
		
		System.out.println(a1.getAccountBalance());
		
		
	}

}
