package edu.wbqa.oop.test;

import edu.wbqa.entities.*;

public class InstancesTest {

	public static void main(String[] args) {

		Employee m = new Manager();
		if(m instanceof Manager)
		{
			Manager em = (Manager)m;
		}

	}

}
