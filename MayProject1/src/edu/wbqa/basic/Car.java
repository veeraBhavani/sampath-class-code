package edu.wbqa.basic;

public class Car extends Vehicle {	
	
	public static String autoMallAddress;
	
	public static void main(String[] args) {
		
		Car.autoMallAddress = "1000 Main St. Fremont";
		
		Car c = null;Car c1 = new Car();
		c1.make = "Toyota";
		c1.model = "Camry";
		c1.year = 2014;
		
		Car c2 = new Car();
		c2.make = "Honda";
		c2.model = "Accord";
		c2.year = 2014;	
	}
	
	public double mpg()
	{
		return 20.0;
	}

}
