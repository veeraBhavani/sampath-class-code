package edu.wbqa.basic;

public class Employee {

	protected int employeeId;
	protected String employeeName;
	protected double salary;
	protected Address homeAddress;
	protected Address workAddress;

	public void hikeSalary(int pct) {
		salary = salary + (salary * pct * 0.01);
	}

	public double getSalary() {
		return salary;
	}

	public String getDetails() {
		return this.employeeName + '-' + salary + '-'
				+ this.homeAddress.getAddress();
	}
	
	public String toString()
	{
		return employeeName;
	}

	public boolean equals(Object o) {
		boolean ret = false;
		if (o instanceof Employee) {
			Employee e = (Employee) o;
			if (e.employeeId == this.employeeId) {
				ret = true;
			}
		}
		return ret;
	}
	
	public final void doSomething()
	{
		////
	}

}
