package edu.wbqa.basic;

public class Employee extends Object {

	protected int employeeID;
	protected String employeeName;
	protected double salary;
	protected Address resAddress;

	public Employee() {

	}

	public Employee(int i) {
		this.employeeID = i;
	}

	public Employee(double i) {

	}

	public void printDetails() {
		System.out.println(employeeName + " " + salary);
	}
	
	public boolean equals(Object o)
	{
		boolean ret = false;
		
		if(o instanceof Employee)
		{
			Employee e1 = (Employee)o;
			if(e1.employeeID ==  this.employeeID)
			{
				ret = true;
			}
		}
		
		return ret;
	}

}
