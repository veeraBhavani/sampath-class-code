package edu.wbqa.basic;

public class PassByValue {
	
	public static void main(String[] args) {
		int a = 10;
		doSomething(a);
		System.out.println(a);
		
		Student s = new Student();
		s.studentID = 100;
		doSomething(s);
		System.out.println(s.studentID);		
	}
	
	public static void doSomething(Student s)
	{
		s.studentID = 10001;
		s = null;
	}
	
	public static void doSomething(int a)
	{
		a = 100;
	}
	
	public static int add(int a, int b)
	{
		return a+b;
	}

}
