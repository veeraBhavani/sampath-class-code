package edu.wbqa.basic;

public class VariablesExample {
	
	public static void main(String[] args) {
		
		ScopeExample sc = new ScopeExample();

		
		sc.firstMethod();
		sc.secondMethod(15);
		
		System.out.println(sc.i);
	}

}
