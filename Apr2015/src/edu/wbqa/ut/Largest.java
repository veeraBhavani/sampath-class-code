package edu.wbqa.ut;

public class Largest {

	public static int getLargest(int[] numbers) {
		int retValue = Integer.MIN_VALUE;

		for (int number : numbers) {
			if (number >= retValue)
				retValue = number;
		}

		return retValue;
	}

}
