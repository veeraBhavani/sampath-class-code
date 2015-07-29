package com.whiteboxqa.oop3;

public class AutoBoxing {

	public static void main(String[] args) {

		int[] myArray = new int[1];

		int j = 10;//Wrapper classes for all value types
		
		Integer i = new Integer(j);
		myArray[0] = i.intValue();
		
		int k = i.intValue();
		
		int l = Integer.MAX_VALUE;
		System.out.println(l);
		
		String s = "2367463";
		int m = Integer.parseInt(s);
		System.out.println(m);

/*		for (int i=0;i<3279047309879845L;i++)
			myArray[0] = j;*/
		//Integer, Boolean, Character, Long, Double

	}

}
