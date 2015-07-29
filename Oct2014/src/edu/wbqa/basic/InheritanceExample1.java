package edu.wbqa.basic;

public class InheritanceExample1 {

	public static void main(String[] args) {
		Employee e = new Employee();

		e.employeeName = "Something";
		e.salary = 10000;

		e.printDetails();

		Manager m = new Manager();
		m.employeeName = "Some Manager";
		m.salary = 7000;

		m.printDetails();
	}

}
