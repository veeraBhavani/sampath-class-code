package edu.wbqa.basic;

public class Types {

	public static void main(String[] args) {

		Account a1 = new Account();

		System.out.println("Account Number: " + a1.getAccountNumber()
				+ " Account Balance:" + a1.getAccountBalance());

		Account a2 = a1;
		
		System.out.println("Account Number: " + a2.getAccountNumber()
				+ " Account Balance:" + a2.getAccountBalance());
		
		a1.deposit(100);
		
		System.out.println("Account Number: " + a2.getAccountNumber()
				+ " Account Balance:" + a2.getAccountBalance());
		
		a2 = null;
		
		System.out.println("Account Number: " + a1.getAccountNumber()
				+ " Account Balance:" + a1.getAccountBalance());
		
		Account a3 = a1;
		
		a1 = null;
		
		a1 = new Account();
		a1.deposit(1000);
		a1.setAccountNumber(11);
		
		a2 = a1;
		
		
		a3 = null;
		
		a1 = null;
		
		a2 = null;
		
		
		
		
		
		
		
		
		int l = 40;
		int k = 30;
		int j = 50;

		l = k + j;

		System.out.println("L:" + l + " K:" + k + " J:" + j);

		l = j;

		System.out.println("L:" + l + " K:" + k + " J:" + j);

		j = 100;

		System.out.println("L:" + l + " K:" + k + " J:" + j);

	}
}
