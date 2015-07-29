package edu.wbqa.ut;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;

public class WBQAContact1 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://whiteboxqa.com");
		driver.findElement(
				By.xpath("//a[@class='bt_login' and @href='contact.php']"))
				.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("var str = arguments[0]; alert(str);", "Hello World");
		Thread.sleep(5000);

		WebDriverWait ww = new WebDriverWait(driver, 60);
		WebElement element = ww.until(ExpectedConditions.visibilityOfElementLocated(driver
				.findElement(By.xpath(""))));

		/*
		 * System.out.println(driver.getWindowHandle());
		 * 
		 * Set<String> handles = driver.getWindowHandles(); for (String handle :
		 * handles) { if (!handle.equals(driver.getWindowHandle())) {
		 * driver.switchTo().window(handle); String title = driver.getTitle();
		 * if (title.equals("")) { // break; }
		 * 
		 * // driver.switchTo(). }
		 * 
		 * }
		 */
		// driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();

	}
}
