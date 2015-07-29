package edu.wbqa.basic;

import javax.swing.JPanel;

public class StudentExample {
	
	public static void main(String[] args) {
		
		//System.out.println("Hello World!");
		
		Student s1 = new Student();
		s1.batch = "March";
		s1.course1gpa = 3.0;
		s1.course2gpa = 4.0;
		s1.course3gpa = 5.0;		
		s1.setAge(23);
		double d = s1.getTotalGPA();
		System.out.println(d);
		
		Student s2 = new Student();
		
				
	}

}
