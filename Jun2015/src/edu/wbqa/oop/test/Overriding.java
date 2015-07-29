package edu.wbqa.oop.test;

import edu.wbqa.entities.*;

public class Overriding {

	public static void main(String[] args) {

		Employee e = new Employee();
		e.name = "Quality Analyst";
		e.salary = 1000.00;
		System.out.println(e.getDetails());
		
		Manager m = new Manager();
		m.department = "IT";
		m.name = "Quality Engineer";
		m.salary = 1000.00;
		
		Employee em = m;

		System.out.println(m.getDetails());
		System.out.println(em.getDetails());

	}

}
