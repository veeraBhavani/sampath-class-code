package edu.wbqa.ut2;

import org.testng.*;
import org.testng.annotations.*;
import org.testng.Assert;

import edu.wbqa.ut.Largest;

public class LargestTest {
	
	@BeforeSuite
	public void a()
	{
		
	}
	
	@DataProvider(name="employee")
	public Object[][] dataMethod()
	{
		return new Object[][]{{"A", "1"}, {"B", "2"}, {"C", "2"}};
	}
	
	@Test(dataProvider="employee")
	public void testSomething(String name, String id)
	{
		System.out.println(name + ":" + id);
	}
	
	
	@Test(enabled=false,description="",groups="positive,functional")
	public void positiveNumbers() {
		int actual = Largest.getLargest(new int[] { 1, 2, 3, 4, 5 });
		Assert.assertEquals(5, actual);
	}
	
	@Test(enabled=false,singleThreaded=false, invocationCount=5,groups="negative", dependsOnMethods="positiveNumbers")
	public void testDuplicateNumbers() {
		int actual = Largest.getLargest(new int[] { 5, 5, 5 });
		Assert.assertEquals(5, actual);
	}
	
	@Test(enabled=false,expectedExceptions=NullPointerException.class)
	public void testNullNumbers()
	{
		Largest.getLargest(null);
		
	}
	

}
