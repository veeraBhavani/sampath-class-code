package edu.wbqa.basic;

public class AbstractExample {
	
	public static void main(String[] args) {
		
		//Vehicle v = new Vehicle();
		
		Car c = new Car();
		c.miles = 100000;
		
		System.out.println(c.getGallonsConsumed());
		
		Aeroplane a1 = new Aeroplane();
		
		Vehicle v = a1;
		
		Flyer f = a1;
		Airport.land(f);
	}

}
