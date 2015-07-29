package edu.wbqa.basic;

public class InheritanceExample6 extends Object {

	public static void main(String[] args) {

		int i = 10;
		int j = 10;

		if (i == j) {
			System.out.println("equals");
		}

		Employee e1 = new Employee(101);
		Employee e2 = new Employee(101);
		
		System.out.println(e1.toString());

		
		String s1 = "abc";
		String s2 = "abc";
		
		if(s1.equals(s2))
		{
			System.out.println("String equlas");
		}
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

		if (e1 == e2) {
			System.out.println("equals");
		}

		if (e1.equals(e2)) {
			System.out.println("value equals");
		}
	}

}
