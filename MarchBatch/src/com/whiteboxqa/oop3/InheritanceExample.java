package com.whiteboxqa.oop3;

public class InheritanceExample {
	
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.employeeID = 101;
		e.employeeName = "Faisal";
		e.salary = 5000;
		
		System.out.println(e.getDetails());
		
		Manager m = new Manager();
		m.employeeID = 102;
		m.employeeName = "Bahia";
		m.salary = 5500;
		m.department = "IT";
		
		System.out.println(m.getDetails());
		
		Employee e1 = m;
		
		System.out.println(e1.getDetails());
		
	}
	

}
