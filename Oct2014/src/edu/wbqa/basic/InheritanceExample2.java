package edu.wbqa.basic;

public class InheritanceExample2 {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Manager m1 = new Manager();
		Employee e2 = new Manager();
		Manager m2 = (Manager) e2;

		int i = 10;
		long j = i; // implicit casting

		int k = (int) j; // explicit casting
		
		getBonus(e2);

	}
	
	public static void getBonus(Employee e)
	{
		
	}

}
