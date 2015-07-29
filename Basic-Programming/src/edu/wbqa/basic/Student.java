package edu.wbqa.basic;

public class Student {

	public int studentID;
	public String email;
	public String batch;
	public int age;
	public double course1gpa;
	public double course2gpa;
	public double course3gpa;

	public void setAge(int a) {
		age = a;
	}

	public double getTotalGPA() {
		return (course1gpa + course2gpa + course3gpa) / 3;
	}

}
