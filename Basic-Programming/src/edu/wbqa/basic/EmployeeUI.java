package edu.wbqa.basic;

public class EmployeeUI {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setId(10);
		System.out.println(e1.getId());
		System.out.println(e1.getSalary());
		e1.hike();
		System.out.println(e1.getSalary());
		
	}

}
