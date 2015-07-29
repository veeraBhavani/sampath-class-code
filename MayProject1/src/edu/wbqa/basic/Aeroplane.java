package edu.wbqa.basic;

import java.beans.Transient;
import java.util.Collection;

import javax.xml.bind.annotation.XmlAttribute;


public class Aeroplane extends Vehicle implements Flyer {

	@Override
	public double mpg() {
		return 200;
	}

	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		
	}

}
