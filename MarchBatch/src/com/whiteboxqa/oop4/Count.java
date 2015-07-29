package com.whiteboxqa.oop4;

public class Count {

	public int i;
	public static int counter;

	public Count() {
		counter++;
		this.i = counter;
	}

	public static void main(String[] args) {
		Count.counter = 11;
		
		Count c1 = new Count();
		System.out.println(c1.i);
		
		Count c2 = new Count();
		System.out.println(c2.i);

	}

}
