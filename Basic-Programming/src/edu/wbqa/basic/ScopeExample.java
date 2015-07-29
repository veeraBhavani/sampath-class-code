package edu.wbqa.basic;

public class ScopeExample {

	public int i;

	public void doSomething1() {
		int i = 10;
		this.i = i + 10;
		doSomething2(i);
	}

	public void doSomething2(int i) {
		int j = 20;
		this.i = i + j;
	}
	
	public static void main(String[] args) {
		
		ScopeExample s = new ScopeExample();
		System.out.println(s.i);
		s.doSomething1();
		System.out.println(s.i);
	}

}
