package edu.wbqa.ut;

public class MyTest {

	public static void main(String[] args) {

		
		int[] numbers = {1,2,3,60};
		int actual = Largest.getLargest(numbers);
		if(actual == 60)
		{
			System.out.println("test Passed");
		}
		

	}

}
