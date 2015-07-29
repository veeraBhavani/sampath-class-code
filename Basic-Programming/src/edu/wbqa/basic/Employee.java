package edu.wbqa.basic;

public class Employee {

	public int id;
	public String name;
	public double salary = 5000;
	public final String ssn;

	public Employee()
	{
		this.ssn = "555-55-5555";
	}
	
	public Employee(int id) {
		this.id = id;
		//database
		//select name, salary from employee where id = id
		this.name = "WBL";
		this.salary = 5000.00;
		this.ssn = "555-55-5555";
	}

	public Employee(int id, String name, double salary) {
		this(id);
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setId(int myID) {
		id = myID;
	}

	public void hike() {
		salary = salary + 1000;
	}

	public String getDetails() {
		return name + " - " + salary;
	}
	
	public boolean equals(Object o)
	{
		Employee e = (Employee)o;
		if(e.id == this.id)
		{
			return true;
		}
		return false;
	}

	public String toString()
	{
		return name;
	}
	
}
