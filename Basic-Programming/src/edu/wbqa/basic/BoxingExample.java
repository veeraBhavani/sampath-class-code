package edu.wbqa.basic;

public class BoxingExample {
	
	public static void main(String[] args) {
		
		int i = 10;
		int[] array = new int[1];		
		array[0] = i;
		
		//AutoBoxing
		//Wrapper
		//Byte, Character, Boolean, Short, Long, Double, Float
		
		Integer myInt = new Integer(i);
		array[0] = myInt.intValue();
		int j = myInt.intValue();
		
		String number = "42143214";
		int k = Integer.parseInt(number);
		

		
	}

}
