package edu.wbqa.basic;

public final class Manager extends Employee {

	public String team;

	public String getDetails() {
		return super.getDetails() + this.team;
	}
}
