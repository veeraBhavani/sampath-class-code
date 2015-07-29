package edu.wbqa.ut;

import junit.framework.*;

public class LargestTest extends TestCase {

	public LargestTest() {

	}

	public LargestTest(String name) {
		super(name);
	}

	public void setUp() {

	}

	public void testPositiveNumbers() {
		assertEquals(4, Largest.getLargest(new int[] { 1, 2, 3, 4 }));
	}

	public void testNegativeNumbers() {
		assertEquals(-1, Largest.getLargest(new int[] { -1, -2, -3, -4 }));
	}

	public void testSameNumbers() {
		assertEquals(1, Largest.getLargest(new int[] { 1, 1, 1 }));
	}

	public void testPositiveNegativeNumbers() {
		assertEquals(4, Largest.getLargest(new int[] { -1, -2, 3, 4 }));
	}

	public void testZeroNumbers() {
		assertEquals(0, Largest.getLargest(new int[] { 0, -1, -2 }));
	}

	public void testOneNumbers() {
		assertEquals(1, Largest.getLargest(new int[] { 1 }));
	}

	public void testException() {
		try {
			Largest.getLargest(null);
			fail();
		} catch (NullPointerException ex) {
			assertTrue(true);
		} catch (Exception e) {
			fail();
		}
	}

	public void tearDown() {

	}
}
