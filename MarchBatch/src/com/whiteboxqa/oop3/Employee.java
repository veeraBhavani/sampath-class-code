package com.whiteboxqa.oop3;

public class Employee {
	
	public int employeeID;
	public String employeeName;
	public double salary;
	
	public Employee(int i)
	{
		this.employeeID = i;
		//20 lines of logic
	}
	
	public Employee(int i, String name)
	{
		this(i);
		this.employeeName = name;
	}
	
	public String getDetails()
	{
			return employeeName + ":" + salary;
	}
	
	public int add(int i, int j)
	{
		String s = "A" + "B";
		s = "A" + "B" + (2 + 2);
		return i + j; //operator overloading
	}
	
	public int add(int i, int j, int k)
	{
		return i + j + k; //method overloading
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof Employee)
		{
			Employee e = (Employee)o;
			if(this.employeeID == e.employeeID)
			{
				return true;
			}
			return false;
		}
		else
		{
			return false;
		}
			
	}
	
	public String toString()
	{
		return this.employeeName;
	}

}
