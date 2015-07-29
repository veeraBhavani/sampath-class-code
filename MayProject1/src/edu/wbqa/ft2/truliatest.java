package edu.wbqa.ft2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import edu.wbqa.ft1.truliahomepage;

/// please type in chat window so that i would know that
//all of u are present

public class truliatest {
	WebDriver  driver;
	
	@BeforeTest
	public void openbrowser()
	{
		WebDriver driver  = new FirefoxDriver();
		driver.get("");
	}
	@Test
	public void checksubmit()
	{
		truliahomepage tr = new truliahomepage(driver);
	}

	@AfterTest
	public void closebrowser()
	{
		if(driver != null)
			driver.close();
		
	}
}
