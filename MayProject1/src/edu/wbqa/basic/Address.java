package edu.wbqa.basic;

public class Address {
	
	public String address1;
	public String city;
	public String state;
	public int zip;
	

	public String getAddress()
	{
		return this.address1 + "/n" + this.city;
	}
	
}
