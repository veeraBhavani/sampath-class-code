package edu.wbqa.basic;

public class Customer {

	public int customerID;
	Address residentialAddress;
	public Address workAddress;
	public Account[] accounts;
	public Connection conn;

	public String getCustomerResidentialAddress() {
		return residentialAddress.address1;
	}

	public void finalize() {
		conn.close();
		conn = null;
	}
}
