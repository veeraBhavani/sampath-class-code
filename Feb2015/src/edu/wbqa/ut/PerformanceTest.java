package edu.wbqa.ut;

import com.clarkware.junitperf.*;
import junit.framework.*;

public class PerformanceTest {

	public static void main(String[] args) {

		TimedTest tt = new TimedTest(new LargestTest("testPositiveNumbers"),
				10);

	}

}
