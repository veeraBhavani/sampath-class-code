package edu.wbqa.ut;

import junit.framework.*;

public class FactorialTest extends TestCase {
	
	public FactorialTest()
	{
		
	}

	public FactorialTest(String name) {
		super(name);
	}

	public void testPositiveNumber() {
		assertEquals(120, Factorial.getFactorial(5));
	}

	public void testZeroNumber() {
		assertEquals(0, Factorial.getFactorial(0));
	}

	public void testOneNumber() {
		assertEquals(1, Factorial.getFactorial(1));
	}
}
