package edu.wbqa.basic;

public class MyObject {
	
	Connection c;
	int a;
	int b;
	
	
	public void doSomething()
	{
		
	}
	
	public void finalize()
	{
		if(c != null)
		{
			c.close();
		}
		c = null;
	}

}
