package edu.whiteboxqa.junit;

public class Math {

	public static int largest(int[] numbers) {
		int i = Integer.MIN_VALUE;
		for (int num : numbers) {
			if (num > i) {
				i = num;
			}
		}
		return i;
	}
}
