package edu.wbqa.basic;

public class ScopeExample {

	public int i;

	public void firstMethod() {
		int i = 10;
		int j = 5;
		this.i = i + j;
		secondMethod(i);
	}

	public void secondMethod(int j) {
		this.i = 2 + j;
	}

	public static void main(String[] args) {
		ScopeExample se = new ScopeExample();
		se.firstMethod();
		System.out.println(se.i);
	}

}
