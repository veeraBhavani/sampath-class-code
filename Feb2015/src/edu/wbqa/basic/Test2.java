package edu.wbqa.basic;

public class Test2 {

	public static void main(String[] args) {

		int i = 10;

		Account a1 = null;

		Account a2 = new Account();

		Account a3 = a2;

		a2.deposit(200);

		a2 = a1;

		a3 = null;
		System.gc();
	}

	public static void test1() {
		int i = 20;
	}

}
