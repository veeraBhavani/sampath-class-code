package edu.wbqa.basic;

public class StaticExample2 {

	public int i;
	public static int counter = 0;

	public StaticExample2() {
		counter++;
		i = counter;
	}
	
	public static void main(String[] args) {
		StaticExample2 se1 = new StaticExample2();
		System.out.println(se1.i);
		System.out.println(se1.counter);
		
		StaticExample2 se2 = new StaticExample2();
		System.out.println(se2.i);
		System.out.println(se1.i);
	
		
	}

}
