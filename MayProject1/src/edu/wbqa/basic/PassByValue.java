package edu.wbqa.basic;

public class PassByValue {

	public static void main(String[] args) {
		int i = 10;
		doSomething(i);
		System.out.println(i);
		
		Account a1 = new Account();
		a1.deposit(200);
		doSomething(a1);
		System.out.println(a1.getAccountBalance());
	}

	public static void doSomething(Account a)
	{
		a.deposit(300);
		a = null;
	}	
	
	public static void doSomething(int j) {
		System.out.println(j);
		j = 100;
	}

}
