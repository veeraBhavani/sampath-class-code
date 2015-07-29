package edu.wbqa.basic;

public class Test6 extends Object {

	public static void main(String[] args) {

		Employee e = new Employee();

		Manager m = new Manager();

		Employee e1 = new Employee();
		Employee e2 = e1;
		
		System.out.println(e1.toString());
		
		/*System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

		if (e1.equals(e2)) {
			System.out.println("Employees are equal");
		}

		String s1 = new String("abc");
		String s2 = new String("abc");

		if (s1.equals(s2)) {
			System.out.println("Strings are equal");
		}*/

	}

	public static String doSomething() {
		return "abc";
	}

}
