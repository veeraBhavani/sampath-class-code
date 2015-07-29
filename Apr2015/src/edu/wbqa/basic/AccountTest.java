package edu.wbqa.basic;

public class AccountTest {

	int tempAmount = 10;

	public static void main(String[] args) {

		
		Account a1 = new Account();
		Account a2 = new Account();
		Account a3 = new Account(24368974);

		a1.withdraw(10.0);
		System.out.println(a1.getAccountBalance());

	}

}
