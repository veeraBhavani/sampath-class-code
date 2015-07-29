package edu.wbqa.ft;

import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.htmlunit.*;

public class WBQATest1 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://whiteboxqa.com/contact.php");
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());

		WebElement element = driver.findElement(By.cssSelector("form table"))
				.findElement(By.cssSelector("input[name='fullname']"));

		System.out.println(element.isDisplayed());
		System.out.println(element.isEnabled());
		System.out.println(element.getAttribute("maxlength"));
		System.out.println(element.getTagName());
		element.sendKeys("WBQA");
		System.out.println(element.getText());
		System.out.println(element.getLocation().x + ":" + element.getLocation().y);
		element.clear();
		driver.quit();
	
	}

}
