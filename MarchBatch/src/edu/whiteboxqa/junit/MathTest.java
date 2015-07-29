package edu.whiteboxqa.junit;

import junit.framework.*;

//Test Class for Normal Java class - Math - Math Test
public class MathTest extends TestCase {

	public MathTest(String name) {
		super(name);
	}

	public void setUp() {
		System.out.println("Begin Test");
	}

	// test methods are test cases.
	public void testPostiveNumbers() {
		int[] numbers = { 1, 2, 3, 4 };
		assertEquals(4, Math.largest(numbers));
	}

	public void testNegativeNumbers() {
		int[] numbers = { -1, -2, -3 };
		assertEquals(-1, Math.largest(numbers));
	}

	public void testMixNumbers() {
		int[] numbers = { 1, 0, -1 };
		assertEquals(1, Math.largest(numbers));
	}

	public void testSingleNumber() {
		int[] numbers = { 1 };
		assertEquals(1, Math.largest(numbers));
	}

	public void testDuplicateNumbers() {
		int[] numbers = { 5, 5, 5 };
		assertEquals(5, Math.largest(numbers));
	}

	public void testUnOrderedNumbers() {
		int[] numbers = { 0, 9, 8 };
		assertEquals(9, Math.largest(numbers));
	}

	public void testNoNumbers() {
		int[] numbers = null;
		try {
			int largest = Math.largest(numbers);
			fail();
		} catch (Exception ex) {
			assertTrue(true);
		}
	}

	public void tearDown() {
		System.out.println("End Test");
	}

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTest(new MathTest("testPostiveNumbers"));
		suite.addTest(new MathTest("testNegativeNumbers"));
		return suite;
	}

}
