package edu.wbqa.ft;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.htmlunit.*;

public class Automation101 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://whiteboxqa.com");
		Thread.sleep(5000);

		driver.findElement(By.cssSelector(".bt_login[href='contact.php']"))
				.click();
		driver.findElement(By.name("fullname")).sendKeys("Test");
		driver.findElement(By.name("email")).sendKeys("whiteboxqa@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("555-555-5555");
		driver.findElement(By.name("message")).sendKeys("Hello!!!");
		driver.findElement(By.name("Send")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());

		driver.close();
		// driver.quit();

	}

}
