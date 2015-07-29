package edu.wbqa.basic;

public class Employee extends Object {

	public int id;
	public String name;
	private double salary;
	public Address empAddress;

	public Employee() {

	}

	public Employee(int id) {
		this.id = id;
		// jdbc
		// select* from employee where id = this.id
		// this.name = name from db
		// this.salary = salary
	}

	public Employee(String email) {
		// select * from empEmails where email =
		// id
		// jdbc
		this(10);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	private double getBonus() {
		int id = 10;
		this.id = id;
		int pct = 10;
		return salary / pct;
	}

	public double getTotalSalary() {
		return salary + getBonus();
	}

	public String getDetails() {
		return this.name + ":" + this.salary;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Employee) {
			Employee e = (Employee) obj;
			if (this.id == e.id) {
				return true;
			}

		}
		return false;
	}
	
	public String toString()
	{
		return this.id + ":" + this.name;
	}

}
