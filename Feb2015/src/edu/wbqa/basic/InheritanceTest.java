package edu.wbqa.basic;

public class InheritanceTest {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		
		Manager m1 = new Manager();

		Employee e2 = m1;
		Manager m2 = (Manager)e2;
		
		
	}

}
