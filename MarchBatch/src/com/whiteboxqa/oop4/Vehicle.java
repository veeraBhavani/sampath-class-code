package com.whiteboxqa.oop4;

public abstract class Vehicle {

	public double odoMeterReading;
	public double mpg;
	public int noOfWheels;

	public Vehicle() {
		noOfWheels = 4;
	}

	public double getGallonsConsumed() {
		return odoMeterReading / mpg;
	}
	
	public double getOdoMeterReading()
	{
		return odoMeterReading;
	}

	public abstract void park();

}
