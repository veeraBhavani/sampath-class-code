package edu.wbqa.basic;

public class AccountStaticTest {
	
	public static void main(String[] args) {
	
		Account.setInterestRate(0.06);
		
		Account a1 = new Account();
		a1.setAccountNumber(101);
		a1.deposit(100);
		System.out.println(a1.getAccountBalance());
				
		Account a2 = new Account();
		a2.setAccountNumber(103);
		a2.deposit(300);
		
		/*Account a = null;
		System.out.println(a.interestRate);*/
		//System.out.println(a.getAccountBalance());
		
	}

}
