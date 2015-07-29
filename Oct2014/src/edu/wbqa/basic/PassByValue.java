package edu.wbqa.basic;

public class PassByValue {

	public static void main(String[] args) {
		
		

		Account a = new Account();
		a.setAccountNumber(101);
		doSomething(a);
		
		System.out.println(a.getAccountNumber());
		
		int i = 10;
		doSomething(i);		
		System.out.println(i);
	}

	
	public static void doSomething(Account b)
	{
		b.setAccountNumber(102);
		b = null;
	}
	
	
	public static void doSomething(int j) {
		j = j + 10;
	}

}
