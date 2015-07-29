package edu.wbqa.basic;

public class InheritanceExample3 {
	
	public static void main(String[] args) {
		
		Manager m = new Manager();
		m.name = "Test1";
		m.salary  = 2000;
		m.id = 101;
		m.team = "QA";
		
		System.out.println(m.getDetails());
		
		Employee em = m;
		System.out.println(em.getDetails());
		
		
	}

}
