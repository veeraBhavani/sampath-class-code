package edu.wbqa.basic;

public class EqualityExample {

	public static void main(String[] args) {

		// = assignment
		// == equality

		int i = 10;
		int j = 10;
		/*if (i == j) {
			System.out.println("Both are equal");
		}*/
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		//e1 = e2;
		//Referential Equality
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		if(e1 == e2)
		{
			System.out.println("Both are referential equal");
		}
		
		if(e1.equals(e2))
		{
			System.out.println("Value equals");
		}
		
		System.out.println(e1.toString());

	}

}
