package edu.wbqa.basic;

public class Test7 {

	public static void main(String[] args) {

		int i = 10;
		int[] myArray = new int[1];
		
		Integer myInt = new Integer(10);
		
		
		int k = myInt.intValue();

		for (int j = 1; j < 1000; j++) {
			myArray[0] = myInt.intValue();
		}

	}

}
