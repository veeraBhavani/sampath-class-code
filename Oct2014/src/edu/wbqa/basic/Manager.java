package edu.wbqa.basic;

public class Manager extends Employee {

	public String department;

	public Manager() {
		super();
	}
	
	public Manager(int i) {
		super(i);
	}

	public void printDetails() {
		super.printDetails();
		System.out.println(department);
	}

}
