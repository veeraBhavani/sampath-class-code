package com.whiteboxqa.oop3;

public class Equality {

	public static void main(String[] args) {

		int i = 10;
		int j = 10;

		if (i == j) {
			System.out.println("Equals");
		}

		Employee e1 = new Employee(10);
		Employee e2 = new Employee(10);
		e1 = e2;
		if (e1 == e2) {
			System.out.println("Equals");
		}

		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

		if (e1.equals(e2)) {
			System.out.println("Employee Equals");
		}

		String s1 = new String("ABC");
		String s2 = "ABC";

		if (s1.equals(s2)) {
			System.out.println("String Equals");
		}

		System.out.println(e1.toString());
		
	}

}
