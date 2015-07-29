package edu.wbqa.ut;

import junit.framework.*;
import junit.textui.*;

public class MyRunner {
	
	public static void main(String[] args) {
		TestRunner runner = new TestRunner();
		LargestTest test1 = new LargestTest("testPositiveNumbers");
		LargestTest test2 = new LargestTest("testDuplicateNumbers");
		
		TestSuite ts = new TestSuite();
		ts.addTest(test1);
		ts.addTest(test2);
		
		runner.run(ts);
		
	}

}
