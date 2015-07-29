package edu.wbqa.oop.test;

public class AutoBoxing {

	public static void main(String[] args) {

		int i = 10;
		int[] myArray = { 1, 2, 3, 4 };

		Integer myInt = new Integer(i);

		String num = "1234";
		int num1 = Integer.parseInt(num);

		int j = myInt.intValue();

	}

}
