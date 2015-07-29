package edu.wbqa.basic;

public class Math {
	
	public static final double PHI = 3.14;

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static double add(double a, double b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		
		Math m = new Math();
		m.add(1.0, 2.0);
		
	}

}
