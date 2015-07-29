package edu.wbqa.basic;

public class ValueTypes {

	public static void main(String[] args) {

		/*int i = 2;
		int j = 3;

		i = j;

		System.out.println(i);
		System.out.println(j);

		j = 5;

		System.out.println(i);
		System.out.println(j);
*/		
		
		Account a1 = new Account();
		Account a2 = null;
		a2 = a1;
		
		a1.setAccountNumber(101);

	}

	public static void goHere() {

	}

}
