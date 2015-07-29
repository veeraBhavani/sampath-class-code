package com.cb.pages;

import org.openqa.selenium.*;

import com.cb.base.*;
import com.cb.utils.*;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public void openHomePage()
	{
		driver.get(domainUrl);
	}
	
	public boolean checkCBAccountRegistration()
	{
		return (driver.findElements(By.id("QSBInfoBox")).size() > 0);
	}
	
	
	public void findJobs(String keyword, String location, String category) throws Exception
	{
		driver.findElement(By.id("s_rawwords")).sendKeys(keyword);
		driver.findElement(By.id("s_freeloc")).sendKeys(location);
		driver.findElement(By.xpath("//select[]/option[8]")).click();
		driver.findElement(Loc.getLocator("cb.homepage.submit")).click();
		
	}

}
