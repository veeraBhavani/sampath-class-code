package edu.wbqa.oop.test;

import edu.wbqa.entities.Manager;

public class Equality {

	public static void main(String[] args) {

		int i = 10;
		int j = 10;
		if (i == j) {
			System.out.println("Value Equals");
		}

		/*Manager m1 = new Manager();
		Manager m2 = m1;
		if (m1 == m2) {
			System.out.println("Reference Equals");
		}*/
		
		Manager m1 = new Manager();
		Manager m2 = new Manager();
		
		if(m1.equals(m2))
		{
			System.out.println("Content Equals");
		}
		
		
		System.out.println(m1.toString());
		
		
		String s1 = "WBQA";
		String s2 = new String("WBQA");
		
		if(s1.equals(s2))
		{
			
		}
	}

}
