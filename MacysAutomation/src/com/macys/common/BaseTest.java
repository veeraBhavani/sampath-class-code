package com.macys.common;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.macys.utils.*;

public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() throws Exception
	{
		Config.populateConfigurations();
		Loc.populateConfigurations();
		driver = Config.getDriver();
	}

}
