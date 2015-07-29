package com.macys.utils;

import java.util.*;
import java.io.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.htmlunit.*;

import javax.print.DocFlavor.STRING;

public class Config {

	private static HashMap<String, String> configurations;

	public static void populateConfigurations() throws Exception {
		configurations = new HashMap<String, String>();
		Properties props = new Properties();
		props.load(new FileReader(new File("")));

		for (Object key : props.keySet()) {
			String value = props.get(key).toString();
			configurations.put((String) key, value);
		}
	}

	public static boolean isScreenShotsEnabled() {
		return configurations.get("screenshot").equals("y");
	}

	public static WebDriver getDriver() {
		if (configurations.get("browser").equals("firefox")) {
			return new FirefoxDriver();
		}
		else if (configurations.get("browser").equals("chrome")) {
			return new ChromeDriver();
		}
		return new HtmlUnitDriver();
	}

}
