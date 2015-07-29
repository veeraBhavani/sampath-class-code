package edu.wbqa.basic;

public class TypesExample {

	public static void main(String args) {
		System.out.println("Hello");
		return;
		}
		
	
	public static void main(String[] args) {

		int i = 0;
		int j = 1;
		i = j;

		i= 2;
		
		j = i;
		
		Account a1 = new Account();
		a1.setAccountNumber(101);
		
		Account a2 = new Account();
		a2.setAccountNumber(102);
		
		a1 = a2;
		
		a2.setAccountNumber(103);
		
		System.out.println(i);

	}
	
	

}
