package edu.wbqa.ut;

import junit.framework.*;

public class FactorialTest extends TestCase {

	public void testValid() {
		assertEquals(6, Factorial.getFactorial(3));
	}

	public void testValidOne() {
		assertEquals(1, Factorial.getFactorial(1));
	}
	
	public void testValidZero() {
		assertEquals(0, Factorial.getFactorial(0));
	}
	
	public void testValidTen() {
		assertEquals(3628800, Factorial.getFactorial(10));
	}
}
