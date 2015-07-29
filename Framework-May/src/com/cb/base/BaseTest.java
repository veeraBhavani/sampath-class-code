package com.cb.base;



import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.htmlunit.*;

import com.cb.config.*;
import com.cb.config.Configuration;

public class BaseTest {
	
	public com.cb.config.Configuration config;
	public WebDriver driver;	
	
	@BeforeSuite
	public void beforeSuite() throws Exception
	{
		config = Configuration.getConfigurations();
		if(config.browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(config.browser.equals("ie"))
		{
			driver = new InternetExplorerDriver();
		}
		if(config.browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		if(config.browser.equals("htmlunit"))
		{
			driver = new HtmlUnitDriver();
		}
		else 
		{
			driver = new FirefoxDriver();
		}
	}
	
	@AfterMethod
	public void cleanup()
	{
		if(config.takeScreenShots)
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			//ts.getScreenshotAs(arg0)
		}
	}

}
