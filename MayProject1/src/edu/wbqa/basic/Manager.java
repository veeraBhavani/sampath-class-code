package edu.wbqa.basic;

public class Manager extends Employee {

	public String department;
	
	public Manager()
	{
		this("");		
	}

	public Manager(int id) {
		super(id);
	}
	
	public Manager(String email) {
		super(email);
	}

	public String getDetails() {
		return super.getDetails() + ":" + this.department;
	}

}
