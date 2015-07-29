package edu.monster.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import java.util.*;

public abstract class BaseTest {

	public final WebDriver driver;

	public BaseTest() {
		String browser = "firefox";
		if(browser.equals("firefox"))
		{
			driver =  new FirefoxDriver();
		}
		else if(browser.equals("chrome"))
		{
			driver =  new FirefoxDriver();
		}
		else
		{
			driver =  new FirefoxDriver();
		}
	}

}
