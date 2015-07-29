package edu.wbqa.basic;

public class Count {
	
	public int serialNumber;
	public static int counter = 0;

	public Count() {
		counter++;
		serialNumber = counter;
	}

	public static void main(String[] ss) {
		
		Count c1 = new Count();
		System.out.println(c1.serialNumber);
		
		Count c2 = new Count();
		System.out.println(c2.serialNumber);
	}

}
