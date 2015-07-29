package edu.wbqa.basic;

public class StaticsExample1 {
	
	public static void main(String[] args) {
		
		Account a = new Account();
		a.withdraw(100);
		double d = a.getInterestRate();
		
		System.out.println(Account.getInterestRate());
		
		//Account.interestRate = 2.0;
		
		/*Account a1 = new Account();
		System.out.println(Account.getInterestRate());

		
		Account a2 = new Account();
		System.out.println(a2.interestRate);
		System.out.println(Account.interestRate);
	*/	
		
	}

}
