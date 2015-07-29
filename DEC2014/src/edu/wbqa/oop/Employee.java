package edu.wbqa.oop;

import java.util.Date;
import java.io.*;
import java.sql.*;

public class Employee {

	private int employeeID; // variable declaration
	private int age;
	private double salary;
	private String name;
	
	public Employee()
	{
		salary = 5000;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getSalary()
	{
		return salary;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public String getName() {
		return name;
	}

	public void setAge(int a) {
		age = a;
	}

	public void hike(int pct) {
		salary += (salary * pct * .01);
	}



}
