package com.macys.common;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.*;
import com.macys.utils.*;

import org.openqa.selenium.*;

public abstract class BasePage {

	public WebDriver driver;
	public Logger log;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isMainHeaderVisible() {
		return driver.findElement(By.id("topnav")).isDisplayed();		
	}

	public int getTopNavLinksCount() {
		return driver.findElements(By.cssSelector("#topnav ul li")).size();
	}

	public List<String> getTopNavLinks() {
		List<String> links = new ArrayList<String>();
		for (WebElement element : driver.findElements(By
				.cssSelector("#topnav ul li a"))) {
			links.add(element.getText());
		}
		log.debug("number of links found" + links.size());
		return links;
	}
	
	
	public void takeScreenShot()
	{
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		//ts.getScreenshotAs(arg0)
	}
}
