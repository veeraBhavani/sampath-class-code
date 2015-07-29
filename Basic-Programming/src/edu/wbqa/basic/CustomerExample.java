package edu.wbqa.basic;

public class CustomerExample {

	public static void main(String[] args) {
		
		int i = 10;		
		Customer c = new Customer();
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();		
		String ssn = c.getSSN();		
		System.out.println(c.balance);
		System.out.println(c.getSSN());
		
		
		Student s = null;		
		s = new Student();
		s = null;
		s = new Student();
		Student s1 = s;
		s1.studentID = 100;
		s = null;
		
		//System.out.println(s.studentID);

	}

}
