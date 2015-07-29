package edu.wbqa.basic;

public class InheritanceExample1 {

	public static void main(String[] args) {
		
		Manager m = new Manager();
		m.id = 101;
		m.name = "WBQA";
		m.setSalary(1000);
		
		System.out.println(m.getDetails());

	}

}
