package edu.wbqa.entities;

public class Manager extends Employee {

	public String department;
	public int id;

	public String getDetails() {
		return super.getDetails() + ":" + department;
	}

	@Override
	public boolean equals(Object m) {
		if (m instanceof Manager) {
			Manager m1 = (Manager) m;
			if (m1.id == this.id)
				return true;
		}

		return false;

	}
}
