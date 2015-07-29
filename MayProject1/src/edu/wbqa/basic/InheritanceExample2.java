package edu.wbqa.basic;

public class InheritanceExample2 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Manager e2 = new Manager();

		Employee e3 = new Manager(); //Implicit casting, up casting
		
		Manager m4 = (Manager)e3; // explicit casting
		
		Employee[] emps = new Employee[2];
		emps[0] = new Employee();
		emps[1] = new Manager();
		
	}
	
	public static void calculateSalary(Manager e)
	{
		
	}

}
