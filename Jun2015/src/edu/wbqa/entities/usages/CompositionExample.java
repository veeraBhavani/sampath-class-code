package edu.wbqa.entities.usages;

import edu.wbqa.entities.*;

public class CompositionExample {

	public static void main(String[] args) {
		Account a = new Account();
		Customer c = new Customer();
		c.homeAddress = new Address("6500 Dublin Blvd", "", "94568");
		c.id = 10;
		c.name = new String("customer1");
		System.out.println(c.homeAddress.getAddress());
		c.accounts = new Account[2];
		c.accounts[0] = a;
		c.accounts[1] = new Account();

		// Address a = new Address("6500 Dublin Blvd", "", "94568");
	}
}
