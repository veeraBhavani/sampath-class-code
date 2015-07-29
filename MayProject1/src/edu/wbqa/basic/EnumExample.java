package edu.wbqa.basic;

public class EnumExample {

	public static void main(String[] args) {

		/*
		 * String day = "Monday";
		 * 
		 * if(day.equals("monday")) { System.out.println("Monday"); }
		 */

		Day myDay = Day.Monday;

		switch (myDay) {
		case Friday:
			System.out.println();
		case Thursday:
			System.out.println();
		}

	}

}
