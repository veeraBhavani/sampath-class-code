package edu.wbqa.basic;

public class ValueTypes {

	public static void main(String[] args) {
		
		int j = 10;		
		int k = 20;		
		j = k;		
		k = 11;		
		System.out.println(j);
		
		Account a1 = new Account();
		
		Account a2 = null;
		
		a2 =  a1;
		
		a1.withdraw(100);
		
		double c = a1.getAccountBalance();
		
	}
	
	
}
