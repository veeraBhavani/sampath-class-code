package edu.wbqa.basic;

public class Car extends Vehicle {

	public int noOfSeats;
	private double mpg;
	private double milesTravelled;

	public Car() {

	}

	public Car(double mpg, double miles) {
		this.mpg = mpg;
		this.milesTravelled = miles;
	}

	@Override
	public double getMilesTravelled() {
		return milesTravelled;
	}

	@Override
	public double getMPG() {
		return mpg;
	}

	public void setMPG(double mpg) {
		this.mpg = mpg;
	}

	public void setMilesTravelled(double milesTravelled) {
		this.milesTravelled = milesTravelled;
	}
}
