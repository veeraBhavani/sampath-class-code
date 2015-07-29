package edu.wbqa.ut;

public class Largest {

	public static int getLargest(int[] numbers) {
		int largest = Integer.MIN_VALUE;

		for (int number : numbers) {
			if (number > largest) {
				largest = number;
			}
		}

		return largest;
	}

}
