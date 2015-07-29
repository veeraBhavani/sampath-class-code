package edu.wbqa.basic;

public class InheritanceExample3 {
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.id = 10;
		e.name = "WBL";
		e.salary = 5000;
		
		System.out.println(e.getDetails());
		
		Manager m = new Manager();
		m.id = 11;
		m.name = "IP";
		m.salary = 6000;
		m.department = "Manufacturing";
		
		System.out.println(m.getDetails());
		
		Employee e1 = m;
		System.out.println(e1.getDetails());
		
	}

}
