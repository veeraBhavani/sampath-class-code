package edu.wbqa.ut;

import junit.framework.*;

public class LargestTest extends TestCase {
	
	public void testPositiveNumbers()
	{
		int[] numbers = {1,2,3,60};
		int largest = Largest.getLargest(numbers);
		assertEquals(60, largest);
	}
	
	public void testNegativeNumbers()
	{
		int[] numbers = {-1,-2,-3};
		int largest = Largest.getLargest(numbers);
		assertEquals(-1, largest);
	}
	
	public void testDuplicateNumbers()
	{
		int[] numbers = {1,1,1};
		int largest = Largest.getLargest(numbers);
		assertEquals(1, largest);
	}

}
