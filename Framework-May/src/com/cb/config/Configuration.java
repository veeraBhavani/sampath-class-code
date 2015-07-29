package com.cb.config;

import java.io.*;
import java.util.*;

public class Configuration {

	public String browser;
	public String baseURL;
	public boolean logEnabled;
	public boolean takeScreenShots;
	public String loglevel;

	public static Configuration getConfigurations() throws Exception {
		Configuration c = new Configuration();
		Properties p = new Properties();
		p.load(new FileReader(new File("config.properties")));

		for (Object key : p.keySet()) {
				if(key.toString().equals("browser"))
				{
					c.browser = p.getProperty((String) key);
				}
				c.baseURL = "http://careerbuilder.com";
		}
		return c;
	}

}
