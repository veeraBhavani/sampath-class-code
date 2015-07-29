package com.macys.utils;

import com.csvreader.CsvReader;
import java.io.*;

public class Data {
	
	
	public static Object[][] getDataFromSheet(String sheetName) throws Exception
	{
		Object[][] data = new Object[10][];

		CsvReader keywords = new CsvReader(sheetName);
		keywords.readHeaders();
		while (keywords.readRecord())
		{
			String[] items = new String[keywords.getColumnCount()-1];
			items[0] = keywords.get(0);
			items[1] = keywords.get(1);
			data[0] = items;
		}
		
		return data;
	}

}
