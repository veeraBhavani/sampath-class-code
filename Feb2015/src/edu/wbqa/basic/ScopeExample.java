package edu.wbqa.basic;

public class ScopeExample {

	public int i = 1;

	private void secondMethod(int j) {
		int i = 10;
		this.i = i + j;
	}

	public void firstMethod() {
		int i = 5;
		int j = 10;
		this.i = i + j;
		secondMethod(10);
	}

	public static void main(String[] args) {
		ScopeExample sc = new ScopeExample();
		sc.secondMethod(20);
		System.out.println(sc.i);
	}

}
