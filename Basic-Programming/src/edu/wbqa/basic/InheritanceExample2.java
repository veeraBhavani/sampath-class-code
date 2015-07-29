package edu.wbqa.basic;

public class InheritanceExample2 {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		//Manager m3 = (Manager)e1;
				
		Manager m1 = new Manager();		
		Employee e2 = m1; //implicit casting
		Manager m2 = (Manager)e2;
		

		
	}

}
