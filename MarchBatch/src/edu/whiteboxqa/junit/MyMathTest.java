package edu.whiteboxqa.junit;

public class MyMathTest {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4};

		int largest = Math.largest(numbers);
		
		if(largest == 4)
		{
			System.out.println("test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}

	}

}
