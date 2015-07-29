package edu.wbqa.basic;

public class StaticExample {

	public static void main(String[] args) {
		
		double d = 100 * Math.phi;
		double c = Math.add(d, 100);
		
		System.out.println(Account.getInterestRate());
				
		Account a1 = new Account();
		a1.setAccountNumber(101);
		System.out.println(a1.getInterestRate());
		
		Account a2 = new Account();
		a2.setAccountNumber(102);
		
	}
	
}
