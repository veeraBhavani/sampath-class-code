package edu.wbqa.ut;

import junit.framework.*;

public class LargestTest extends TestCase {
	
	int i = 0;
	
	public LargestTest(String method)
	{
		super(method);
	}
	
	public void setup()
	{
		i =10;
	}

	public void testPositiveNumbers() {
		int actual = Largest.getLargest(new int[] { 1, 2, 3, 4, 5 });
		assertEquals(5, actual);
		System.out.println("");
	}
	
	public void teardown()
	{
		i = 0;
	}
	
	public void testDuplicateNumbers() {
		int actual = Largest.getLargest(new int[] { 5, 5, 5 });
		assertEquals(5, actual);
	}
	
	public void testSingleNumbers() {
		int actual = Largest.getLargest(new int[] { 5 });
		assertEquals(5, actual);
	}
	
	public void testZeroNumbers() {
		int actual = Largest.getLargest(new int[] { 0 });
		assertEquals(0, actual);
	}
	
	public void testNegativesNumbers() {
		int actual = Largest.getLargest(new int[] { -1, -2, -3 });
		assertEquals(-1, actual);
	}

	public void testNullNumbers()
	{
		try
		{
			Largest.getLargest(null);
			fail();			
		}
		catch(Exception ex)
		{
			assertTrue(true);
		}
	}

}
