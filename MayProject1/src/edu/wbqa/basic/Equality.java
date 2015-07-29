package edu.wbqa.basic;

public class Equality {

	public static void main(String[] args) throws Exception {

		int i = 10;
		int j = 10;

		if (i == j) {
			System.out.println("Both are equal");
		}
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();

		// e1=e2;
		// referential equality
		if (e1 == e2) {
			System.out.println("Both are Reference equal");
		}

		if (e1.equals(e2)) {
			System.out.println("Both are Value equal");
		}

		e1 = e2;

		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());

	}

}
