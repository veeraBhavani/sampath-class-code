package edu.wbqa.basic;

public class CompositionExample {

	public static void main(String[] args) {
		
		Address a = new Address();
		
		Employee e = new Employee();
		e.empAddress = a;
		System.out.println(e.empAddress.zip);
		
		int[] ints = new int[5];
		
		Employee[] emps = new Employee[2];
		emps[0] = e;
		emps[1] = e;
		//	String[] total = new String[a.length + b.len]
		
		// (src, srcPos, dest, destPos, length);
		
		
	}
	
}
