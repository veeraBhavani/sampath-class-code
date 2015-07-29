package com.whiteboxqa.oop3;

public class Manager extends Employee {

	public String department;

	public Manager(int i) {
		super(i);
	}

	public Manager(int i, String name) {
		this(i);
	}

	public String getDetails() {
		return super.getDetails() + ":" + department;
	}

}
