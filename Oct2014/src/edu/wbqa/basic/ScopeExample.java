package edu.wbqa.basic;

public class ScopeExample {

	public int i = 0;

	public void firstMethod() {
		int i = 7;
		int j = 8;
		this.i = i + j;
		secondMethod(i);
	}
	
	public void secondMethod(int j)
	{
		int i = 10;
		this.i = i + j;
	}

}
