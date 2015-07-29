package com.whiteboxqa.oop4;

public class AbstractionExample {
	
	public static void main(String[] args) {
		
		Vehicle v1 = new Car();
		v1.odoMeterReading = 100000;
		v1.mpg = 21;
		
		System.out.println(v1.getGallonsConsumed());
		
		v1.park();
		
		Flyer f = new Aeroplane();
		
		f.fly();
		
	}

}
