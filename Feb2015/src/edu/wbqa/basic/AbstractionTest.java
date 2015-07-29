package edu.wbqa.basic;

public class AbstractionTest {

	public static void main(String[] args) {

		Flyer f = new Aeroplane();
	
	}

	public void doSomething(Vehicle v) {
		System.out.println(v.getGallonsConsumed());
	}

}
