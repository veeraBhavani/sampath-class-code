package edu.wbqa.basic;

public class InheritanceExample5 {

	public static void main(String[] args) {

		Employee[] emps = new Employee[2];
		emps[0] = new Employee();
		emps[0].employeeID = 101;
		emps[0].salary = 5000;

		Manager m = new Manager();
		m.employeeID = 102;
		m.salary = 10000.00;
		m.department = "IT";

		emps[1] = m;

		for (int i = 0; i < emps.length; i++) {
			
			int hikePct = 10;
			if(emps[i] instanceof Manager)
			{
				hikePct = 15;
			}
			emps[i].salary = emps[i].salary + (emps[i].salary * hikePct / 100);
			emps[i].printDetails();
		}
	}

}
