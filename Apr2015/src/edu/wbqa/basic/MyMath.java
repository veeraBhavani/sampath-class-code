package edu.wbqa.basic;

public class MyMath {
	
	
	public static final double PI = 3.14;
	
	
	public int add(int a, int b)
	{	
		return a+b;
	}
	
	public double add(double a, double b)
	{
		return a+b;
	}
	
	public int add(int a, int b, int c)
	{
		return add(add(a,b),c);
	}

}
