package com.cb.base;

import java.io.*;
import java.net.*;

public class Service {
	
	 public static String callRestServiceGet(String url) throws MalformedURLException, IOException{
	        URL adminServiceRestUrl = new URL(url);
	        HttpURLConnection connection =  (HttpURLConnection) adminServiceRestUrl.openConnection();
	        connection.setRequestMethod("GET");
	        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.117 Safari/537.36");
	        //connection.setRequestProperty("Accept", "application/json");
	      
	        if (connection.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ connection.getResponseCode());
			}
	        return connection.getResponseMessage();
	        //InputStream json = connection.getInputStream();
	       // return json;
	    }

}
