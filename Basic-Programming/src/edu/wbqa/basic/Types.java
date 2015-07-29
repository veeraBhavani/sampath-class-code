package edu.wbqa.basic;

/**
 * @version 1.0
 * @author Sampath
 * @see This is a very good class written by me.
 */
public class Types {

	public static void main(String[] args) {

		int i = 10;
		int j = 20;
		i = j;
		System.out.println(i);
		System.out.println(j);
		j = 30;
		System.out.println(i + ":" + j);

		Student s1 = new Student();
		s1.studentID = 1001;
		Student s2 = new Student();
		s2.studentID = 1002;

		s1 = s2;		
		System.out.println(s1.studentID + ":" + s2.studentID);
		s2.studentID = 1003;
		System.out.println(s1.studentID + ":" + s2.studentID);
		
		s1 = null;
		System.out.println(s2.studentID);
		s1 = new Student();
	}

}
