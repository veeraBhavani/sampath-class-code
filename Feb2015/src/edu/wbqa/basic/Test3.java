package edu.wbqa.basic;

public class Test3 {

	public static void main(String[] args) {

		int i = 10;
		doSomething(i);
		System.out.println(i);

		Account a = new Account();
		donate(a);
		System.out.println(a.getAccountBalance());
	}

	public static void donate(Account a) {
		a.withdraw(10);
		a = null;
	}

	public static void doSomething(int i) {
		i = 100;
	}

}
