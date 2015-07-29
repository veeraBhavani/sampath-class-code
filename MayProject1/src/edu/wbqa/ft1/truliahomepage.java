package edu.wbqa.ft1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class truliahomepage {
	WebDriver driver;
	public truliahomepage(WebDriver driver)
{
	this.driver = driver;
	
}
	public String chekstrin()
	{
		driver.findElement(By.xpath("")).click();
		return driver.findElement(By.xpath("")).getText();
		
		
	}
	}
