package edu.whiteboxqa.junit;

import junit.framework.*;
import junit.textui.*;

public class Runner {

	public static void main(String[] args) {
		
		TestRunner myRunner = new TestRunner();
		Test test = MathTest.suite();
		myRunner.run(test);

	}

}
