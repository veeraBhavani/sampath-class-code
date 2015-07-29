package edu.wbqa.ut;

public class MyTest {

	public static void main(String[] args) {

		int[] numbers = new int[] { 1, 2, 3, 4, 5 };
		int actual = Largest.getLargest(numbers);
		if (actual == 5) {
			System.out.println("Test Case 1 Passed");
		}

		numbers = new int[] { 5, 4, 3, 2, 1 };
		actual = Largest.getLargest(numbers);
		if (actual == 5) {
			System.out.println("Test Case 2 Passed");
		}
		
		numbers = new int[] { 5, 5, 5 };
		actual = Largest.getLargest(numbers);
		if (actual == 5) {
			System.out.println("Test Case 3 Passed");
		}
		
		numbers = new int[] { 5 };
		actual = Largest.getLargest(numbers);
		if (actual == 5) {
			System.out.println("Test Case 4 Passed");
		}
		
		numbers = new int[] { 0 };
		actual = Largest.getLargest(numbers);
		if (actual == 0) {
			System.out.println("Test Case 5 Passed");
		}

	}

}
