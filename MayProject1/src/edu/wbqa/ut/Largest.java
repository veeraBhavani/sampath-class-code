package edu.wbqa.ut;

public class Largest {

	public static int getLargest(int[] numbers) {
		int i = Integer.MIN_VALUE;
		for (int num : numbers) {
			if (num > i) {
				i = num;
			}
		}
		return i;
	}

}
