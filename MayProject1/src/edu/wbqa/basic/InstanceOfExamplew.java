package edu.wbqa.basic;

public class InstanceOfExamplew {
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		doSomething(e);
		
	}
	
	
	public static void doSomething(Object o)
	{
		if(o instanceof Employee)
		{
			
		}
		if(o instanceof Manager)
		{
			
		}
	}

}
