package edu.wbqa.basic;

public class TypesExample1 {

	public static void main(String[] args) {

		int i = 10;
		int j = 20;
		i=j;
		j= 10;
		//System.out.println(i);		
		
		Account a = new Account();
		a.deposit(100);
		System.out.println(a.getAccountBalance());
		
		Account b = new Account();
		b.deposit(200);
		System.out.println(b.getAccountBalance());
		
		a = b;
		a.deposit(100);
		
		
		
	}

}
