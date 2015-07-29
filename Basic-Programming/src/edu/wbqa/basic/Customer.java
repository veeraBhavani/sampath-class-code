package edu.wbqa.basic;

public class Customer {
	
	public int customerID;
	public double balance = 10.0;
	public String name;
	public String ssn;
	public Address homeAddress;
	public Address officeAddress;
	
	public Customer()
	{
		customerID = 1;
		name = "";
	}
	
	public String getSSN()
	{
		return ssn;
	}

}
