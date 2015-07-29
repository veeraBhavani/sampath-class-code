package edu.wbqa.basic;

public abstract class Vehicle {

	public String vin;

	public abstract double getMPG();

	public abstract double getOdometerReading();
		
	public double gallonsConsumed()
	{
		return getMPG() * getOdometerReading();
	}
}
