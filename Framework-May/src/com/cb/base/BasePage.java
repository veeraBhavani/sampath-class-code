package com.cb.base;

import org.openqa.selenium.*;

public abstract class BasePage {

	public WebDriver driver;
	public String domainUrl;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean checkLogo()
	{
		return (driver.findElements(By.className("desktop-logo")).size() > 0);
	}
	
	public boolean checkGreenContainer()
	{
		return (driver.findElements(By.className("green-container")).size() > 0);
	}
	 
	public int getGreenContainerLinksCount()
	{
		return driver.findElements(By.cssSelector(".green-container a")).size();
	}

}
