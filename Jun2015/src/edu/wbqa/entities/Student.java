package edu.wbqa.entities;

import java.util.HashMap;

public class Student {

	public int id;
	public String name;
	public String ssn;
	public HashMap<String, Integer> courses;

	public Student(int id) {
		//goto db
		//make jdbc connection
		//select name, ssn, from student where id = 10;
		this.id = id;
		this.name = "";
		this.ssn = "";
	}

	public Student(String ssn) {
		this(0);
	}

}
