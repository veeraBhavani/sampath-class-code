package edu.wbqa.entities.usages;

import edu.wbqa.entities.*;

public class InheritanceTest1 {

	public static void main(String[] args) {
		
		String name = "whiteboxqa";
		System.out.println(name.replaceAll("", ""));
	
		
		System.out.println("Hello World");
		Employee e1 = new Employee();
		Manager m1 = new Manager();
		
		Employee em  = m1;
		Manager me = (Manager)em;
		//Employee em = new Manager();
		
		int i = 10;
		long l = 20;
		
		long k = i;
		int m = (int)k;

	}

}
