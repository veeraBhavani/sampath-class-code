package edu.wbqa.basic;

public class Address {

	public String address1;
	public String address2;
	public String city;
	public String state;
	public String zip;

	public String getAddress() {
		return address1 + "\n" + address2;
	}

}
