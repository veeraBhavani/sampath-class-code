package edu.wbqa.basic;

public class AbstractionTesting {

	public static void main(String[] args) {

		Vehicle v = new Car();
		
		Flyer f = new Aeroplane();
		System.out.println(v.getGallonsConsumed());
	}

	public static void registration(Vehicle v) {

	}

}
