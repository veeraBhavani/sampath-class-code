package edu.wbqa.entities;

public class Employee extends Object {

	public int employeeId;
	public double salary;
	public String name;
	private int specialID;
	

	public double getSalary() {
		return salary;
	}

	public void incrementSalary(double incr) {
		salary = salary + incr;
	}

	public String getDetails() {
		return name + ":" + salary;
	}

}
