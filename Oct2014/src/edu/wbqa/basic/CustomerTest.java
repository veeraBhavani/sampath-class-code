package edu.wbqa.basic;

public class CustomerTest {

	public static void main(String[] args) {

		Customer c = new Customer();
		c.customerID = 101;

		c.residentialAddress = new Address();
		c.residentialAddress.address1 = "6500 Dublin Blvd";
		c.residentialAddress.address2 = "Ste 214";
		c.residentialAddress.city = "Dublin";
		
		c.workAddress = c.residentialAddress;
		
		Account a1 = new Account();
		Account a2 = new Account();

		Account[] accounts = new Account[2];
		accounts[0] = new Account();
		accounts[1] = new Account();

		c.accounts = accounts;

	}

}
