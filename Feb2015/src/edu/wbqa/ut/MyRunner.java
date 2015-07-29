package edu.wbqa.ut;

import com.clarkware.junitperf.LoadTest;
import com.clarkware.junitperf.TimedTest;

import junit.framework.*;
import junit.textui.*;

public class MyRunner {

	public static void main(String[] args) {
		// Test t = MySuites.getPositiveSuite();

		TimedTest tt = new TimedTest(MySuites.getPositiveSuite(), 10);
		LoadTest lt = new LoadTest(tt, 10, 10);
		TestRunner tr = new TestRunner();
		tr.run(lt);
	}

}
