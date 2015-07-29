package com.cb.ui.tests;

import com.cb.base.*;
import com.cb.pages.*;

import org.testng.Assert;
import org.testng.annotations.*;

import com.cb.pages.*;

public class JobSearchTest extends BaseTest {

	JobSearch js = null;
	
	@BeforeClass
	public void beforeClass()
	{
		js = new JobSearch(this.driver);
		js.domainUrl = this.config.baseURL;
	}
	
	
}
