package edu.wbqa.basic;

public class InheritanceExample3 {

	public static void main(String[] args) {

		Employee e = new Employee();
		Employee e1 = new Employee(120);
		e.employeeName = "Something";
		e.salary = 1000.00;
		e.printDetails();

		Manager m = new Manager();
		m.employeeName = "Something Manager";
		m.salary = 5000.00;
		m.department = "IT";
		m.printDetails();

		Employee em = m;
		em.printDetails();
	}

	public static void performanceReview(Employee e) {
		e.printDetails();
	}

}
