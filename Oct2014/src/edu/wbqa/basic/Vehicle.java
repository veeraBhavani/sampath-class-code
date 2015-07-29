package edu.wbqa.basic;

public abstract class Vehicle {

	public String VIN;
	public double mpg;
	public double odoMeterReading;
	public String make;

	public abstract double getOdoMeterReading();
	public abstract double getMPG();
	
	public double getGallonsConsumed()
	{
		return getOdoMeterReading() / getMPG();
	}

}
