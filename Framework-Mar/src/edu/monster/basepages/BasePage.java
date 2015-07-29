package edu.monster.basepages;

import org.openqa.selenium.*;

public abstract class BasePage {

	public WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public abstract void doSomething();
	
	public int getHeaderLinksCount()
	{
		return driver.findElements(By.cssSelector(".mainNav li")).size();
	}

	public void takeScreenShot()
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
	}
	
}
