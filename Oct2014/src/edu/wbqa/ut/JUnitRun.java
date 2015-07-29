package edu.wbqa.ut;

import junit.framework.*;
import junit.textui.*;

public class JUnitRun {

	public static void main(String[] args) {

		TestRunner runner = new TestRunner();
		runner.run(WordCountTest.getSuite());

	}

}
