package com.cb.utils;

import com.csvreader.*;

import java.io.*;
import java.util.*;

public class CSVUtil {
	
	public static List<Object> getData(String csvFileName) throws Exception
	{
		List<Object> myArray = new ArrayList<Object>();
		CsvReader products = new CsvReader("mycsv.csv");
		products.readHeaders();
		
		while (products.readRecord())
		{
			String[] items = new String[3];
			items[0] = products.get("Keyword");
			items[1] = products.get("Location");
			items[2] = products.get("Category");
			myArray.add(items);
		}
		products.close();
		return myArray;
	}

}
