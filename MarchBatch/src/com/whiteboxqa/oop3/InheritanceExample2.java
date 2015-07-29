package com.whiteboxqa.oop3;

public class InheritanceExample2 {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1);
		e1.employeeName = "Faisal";
		e1.salary = 5000;
		hikeSalary(e1);		
		System.out.println(e1.salary);
		
		Employee e2 = new Manager(2);
		e2.employeeName = "Bahia";
		e2.salary = 5500;
		hikeSalary(e2);
		
		System.out.println(e2.salary);
		
		
		
	}
	
	
	public static void hikeSalary(Employee e)
	{
		if(e instanceof Manager)
		{
			Manager m = (Manager)e;
			m.salary += 2000;
		}
		else
		{
			e.salary += 1000;
		}
		
	}


}
