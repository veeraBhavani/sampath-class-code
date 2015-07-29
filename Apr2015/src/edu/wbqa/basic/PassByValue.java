package edu.wbqa.basic;

public class PassByValue {
	
	public static void main(String[] args) {
		Account a = new Account();
		a.deposit(25);
		doSomething(a);
		System.out.println(a.getAccountBalance());
		/*int i = 5;
		doSomething(i);
		System.out.println(i);*/
	}
	
	
	public static void doSomething(Account a)
	{
		a.withdraw(50);
	}
	
	public static void doSomething(int i)
	{
		i = 50;
	}

}
