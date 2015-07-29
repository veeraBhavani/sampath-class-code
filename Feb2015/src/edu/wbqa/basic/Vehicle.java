package edu.wbqa.basic;

public abstract class Vehicle {

	public String make;
	public String model;
	public int year;

	public abstract double getMilesTravelled();
	
	public abstract double getMPG();
	
	public double getGallonsConsumed()
	{
		return getMilesTravelled() / getMPG();
	}

}
