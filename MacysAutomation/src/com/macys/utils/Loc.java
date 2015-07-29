package com.macys.utils;

import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Properties;
import org.openqa.selenium.*;

public class Loc {

	private static HashMap<String, String> locators;

	public static void populateConfigurations() throws Exception {
		locators = new HashMap<String, String>();
		Properties props = new Properties();
		props.load(new FileReader(new File("")));

		for (Object key : props.keySet()) {
			String value = props.get(key).toString();
			locators.put((String) key, value);
		}
	}

	public static By getLoc(String key) {
		String value = locators.get("key");
		String[] items = value.split("=");
		if (items[0].equals("id")) {
			return By.id(items[1]);
		}
		if (items[0].equals("class")) {
			return By.className(items[1]);
		}
		if (items[0].equals("id")) {
			return By.id(items[1]);
		}
		if (items[0].equals("id")) {
			return By.id(items[1]);
		}
		return By.id(items[1]);
	}

}
