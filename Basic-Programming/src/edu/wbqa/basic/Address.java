package edu.wbqa.basic;

public class Address {
	
	public String address1;
	public String address2;
	public String city;
	public String state;
	public int zip;
	
	public String getAddress()
	{
		return address1 + " " + address2 + " " + city + " " + state + " " + zip;
	}

}
