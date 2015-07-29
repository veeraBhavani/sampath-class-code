package edu.wbqa.basic;

public class InheritanceExample3 {
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.name = "E1";
		e.setSalary(1000.00);
		System.out.println(e.getDetails());
		
		Manager m = new Manager();
		m.name = "E2";
		m.department = "IT";
		m.setSalary(2000.00);
		System.out.println(m.getDetails());
		
		Employee e2 = m;
		System.out.println(e2.getDetails());
		
		
	}

}
