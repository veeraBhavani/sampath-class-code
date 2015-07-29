package com.macys.common;

import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.*;
import org.apache.commons.httpclient.params.HttpMethodParams;

public class BaseAPI {
	
	public HttpClient client;
	
	public BaseAPI()
	{
		client = new HttpClient();

	}

}
