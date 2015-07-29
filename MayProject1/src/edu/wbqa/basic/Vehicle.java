package edu.wbqa.basic;

public abstract class Vehicle {

	public final String VIN = "";
	public String make;
	public String model;
	public int year;
	public double miles;
	
	public Vehicle()
	{
		
	}
	
	public abstract double mpg();
	
	
	public double getGallonsConsumed()
	{
		return miles/mpg();
	}
	
}
