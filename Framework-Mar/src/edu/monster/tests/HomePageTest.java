package edu.monster.tests;

import org.testng.annotations.*;
import org.openqa.selenium.*;

import edu.monster.pages.*;

public class HomePageTest extends BaseTest {
	
	@BeforeSuite
	public void setup() {
		
	}

	@Test(dataprovider="")
	public void testValidSearchWithKeyword(String title, String keyword, String location)
	{
		HomePage page = new HomePage(driver);
		page.searchJobs(title, keyword, location);
	}
	
}
