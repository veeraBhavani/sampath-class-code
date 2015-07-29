package edu.wbqa.basic;

public class CompositionExample {

	public static void main(String[] args) {

		Customer c = new Customer();
		System.out.println(c.id);
		System.out.println(c.homeAddress);

		Address a1 = new Address();
		a1.address1 = "6500 Dublin Blvd";
		a1.address2 = "Dublin CA 94568";
		
		c.homeAddress = a1;
		
		c.workAddress = new Address();
		c.workAddress.address1 = "6501 Dublin Blvd";
		c.workAddress.address2 = "Pleasanton CA 94568";
		
		Address a2 = c.workAddress;
		
		c = null;
		a1 = null;
		a2 = null;
		
		System.out.println(a1.getAddress());

	}

}
