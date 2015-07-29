package edu.wbqa.entities.usages;

import edu.wbqa.entities.Account;
import edu.wbqa.entities.AccountType;

public class EnumerationExample {
	
	public static void main(String[] args) {
		
		Account a = new Account();
		a.setAccountNumber(101);
		a.deposit(100);
		a.accountType = AccountType.SAVING;
		
		System.out.println(a.getAccountBalance());
		
	}

}
