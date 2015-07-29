package edu.wbqa.ut;

import java.util.*;
import junit.framework.*;

public class WordCountTest extends TestCase {

	public void testPositiveCase() {
		HashMap<String, String> words = Largest.getWordCounts("This This This");
		assertEquals(1, words.size());
	}

	public void testExceptionCase() {
		try {
			HashMap<String, String> words = Largest.getWordCounts(null);
			fail();
		} catch (Exception ex) {
			assertTrue(true);
		}
	}

	public void testPositiveOneCase() {
		HashMap<String, String> words = Largest.getWordCounts("This");
		assertEquals(1, words.size());
		assertTrue(words.keySet().contains("This"));
	}

	public static Test getSuite() {
		TestSuite ts = new TestSuite();
		ts.addTest(new WordCountTest());
		return ts;
	}

}
