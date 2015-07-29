package edu.wbqa.basic;

public class Manager extends Employee {
	
	public Manager()
	{
		
	}
	
	public Manager(int id)
	{
		super(id);
	}
	
	public Manager(int id, String name, double salary)
	{
		super(id, name, salary);
	}

	public String department;
	
	public String getDetails() {
		return super.getDetails() + " - " + department;
	}
	
	
}
