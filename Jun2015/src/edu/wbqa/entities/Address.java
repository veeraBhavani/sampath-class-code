package edu.wbqa.entities;

public class Address {

	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zip;
	private String country;

	public Address(String add1, String add2, String z) {
		address1 = add1;
		address2 = add2;
		zip = z;
		city = "Dublin";
		state = "CA";
		country = "US";
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress() {
		return address1 + ":" + address2 + ":" + city + ":" + state + ":" + zip
				+ ":" + country;
	}

}
