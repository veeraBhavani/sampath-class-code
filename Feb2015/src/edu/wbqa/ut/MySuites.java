package edu.wbqa.ut;

import junit.framework.*;

public class MySuites {

	public static Test getPositiveSuite() {
		TestSuite ts = new TestSuite();
		ts.addTest(new LargestTest("testPositiveNumbers"));
		ts.addTest(new LargestTest("testSameNumbers"));
		ts.addTest(new LargestTest("testOneNumbers"));
		ts.addTest(new FactorialTest("testPositiveNumber"));

		return ts;

	}

}
