package com.cb.base;

import org.openqa.selenium.*;

import java.util.*;
import java.io.*;

public class Loc {
	
	public static By getLocator(String keyword) throws Exception
	{
		By myBy = null;
		
		Properties p = new Properties();
		p.load(new FileReader(new File("uimap.properties")));
		for(Object o : p.keySet())
		{
			String value = p.getProperty((String) o);
			String[] values = value.split("=");
			
			if(values[0].equals("id"))
			{
				return By.id(values[1]);
			}
			return By.id(values[1]);
		}
		
		return myBy;
	}

}
