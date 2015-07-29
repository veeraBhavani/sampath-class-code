package edu.wbqa.basic;

public class Compositions {

	public static void main(String[] args) {

		Address a = new Address();
		a.address1 = "6500 Dublin Blvd";
		a.address2 = "#214 A";
		a.city = "Dublin";
		a.state = "CA";
		a.zip = 94568;
		
		//System.out.println(a.getAddress());
		
		Customer c = new Customer();
		c.homeAddress = a;
		
		c.officeAddress = new Address();
		c.officeAddress.address1 = "1600 Amphitheatre Pkwy";
		c.officeAddress.address2 = "";
		c.officeAddress.city = "Mountain View";
		c.officeAddress.state = "CA";
		c.officeAddress.zip = 94043;
		
		System.out.println(c.homeAddress.getAddress());
		System.out.println(c.officeAddress.getAddress());
		
		a = null;
		c = null;
		
		int i = 10;
		int j = 20;
		int k = 30;

		int[] array = { i, j, k };
		//System.out.println(array[2]);
	}

	public static void doSomething(int[] array) {

	}

}
