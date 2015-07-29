package edu.wbqa.basic;

public class Wrappers {

	public static void main(String[] args) {

		int i = 10;
		Integer j = new Integer(i);
		int k = j.intValue();
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		String s = "123";
		
		try
		{
			int s1 = Integer.parseInt(s);
		}
		catch(Exception ex)
		{
			
		}
		
		//Character c = 
		
		
		
		
		int[] ints = new int[1];
		ints[0] = j.intValue();

		/*for (int k = 0; k < 10000000; k++) {
			ints[0] = i;
		}*/

	}

}
