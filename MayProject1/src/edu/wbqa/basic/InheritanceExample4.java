package edu.wbqa.basic;

public class InheritanceExample4 {

	public static void main(String[] args) {

		Account a = null;
		a.withdraw(200); // Null Pointer Exception
		Employee e1 = new Employee();
		System.out.println(e1.getDetails());		
		Manager e2 = new Manager();
		System.out.println(e2.getDetails());
		Employee e3 = e2;
		System.out.println(e3.getDetails());		
		
		Manager e4 = (Manager) e3; // Invalid cast exception
		
		
		
		

	}

}
