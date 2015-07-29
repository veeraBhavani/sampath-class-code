package edu.monster.pages;

import org.openqa.selenium.*;

import edu.monster.basepages.*;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void searchJobs(String title, String keyword, String location)
	{		
		driver.findElement(By.id("tjt")).sendKeys(title);
		driver.findElement(By.id("keywordTrovix")).sendKeys(keyword);
		driver.findElement(By.id("locationTrovix")).sendKeys(location);
		driver.findElement(By.id("submitButtonT")).click();
	}
	
	
	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		
	}

}
