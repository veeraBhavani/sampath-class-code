package edu.wbqa.basic;

public class ScopeExample {

	public int i = 10;

	public void dothis(int i) {
		this.i = this.i + 10;
		dothisNext(i);
	}

	public void dothisNext(int j) {
		int i = 10;
		this.i = i + j;
	}

	public static void main(String[] args)
	{
		ScopeExample se = new ScopeExample();
		se.dothis(5);
		System.out.println(se.i);
	}
	
}
