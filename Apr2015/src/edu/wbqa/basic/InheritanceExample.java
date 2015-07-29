package edu.wbqa.basic;

public class InheritanceExample {

	public static void main(String[] args) {

		Employee e = null;		
		Manager m = null;
		
		m = new Manager();
		m.id = 101;
		m.name = "QA";
		m.salary = 5000;
		m.team = "Automation";		
		
		
		e = m;
		
		System.out.println(e.getDetails());

		
		Manager m1 = (Manager)e;
	
	}

}
