package edu.wbqa.basic;

public class Composition {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		Address a1 = new Address();
		a1.setAddress1("6500 Dublin Blvd");
		a1.setAddress2("Ste 214");
		a1.setCity("Dublin");
		a1.setState("CA");
		a1.setZip(94568);
		
		e1.workAddress = a1;
		
		e1.homeAddress = new Address();
		e1.homeAddress.setAddress1("6501 Dublin Blvd");
		e1.homeAddress.setAddress2("Ste 214");
		e1.homeAddress.setCity("Dublin");
		e1.homeAddress.setState("CA");
		e1.homeAddress.setZip(94568);
		
		e1.homeAddress = new Address();
		e1.homeAddress.setAddress1("6501 Dublin Blvd");
		e1.homeAddress.setAddress2("Ste 214");
		e1.homeAddress.setCity("Dublin");
		e1.homeAddress.setState("CA");
		e1.homeAddress.setZip(94568);
		
		e1 = null;
		e2 = null;
		e3 = null;
		
		System.gc();
		
		
		
		
	}

}
