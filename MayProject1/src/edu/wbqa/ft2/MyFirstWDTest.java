package edu.wbqa.ft2;

import java.io.File;
import java.util.*;
import java.util.concurrent.*;

import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.htmlunit.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class MyFirstWDTest {

	public WebDriver driver;

	@Test
	public void testSomething() throws Exception {
		//driver = new HtmlUnitDriver();
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("whiteboxqa");
		dc.setCapability("javascript", "disabled");
		dc.setCapability("askfordownload", "false");
		
		driver = new FirefoxDriver(dc);
		
		
		FirefoxProfile fp = new FirefoxProfile(new File("C:\\Training\\profile"));
		driver = new FirefoxDriver(fp);
		// driver.navigate().refresh();
		// driver.navigate().

		Options opt = driver.manage();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// driver.manage().deleteCookie();

		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			driver.switchTo().window(handle);
			if (driver.getTitle().contains("Google")) {
				break;
			}
		}

		if (driver.switchTo().alert() != null) {
			driver.switchTo().alert().dismiss();
		}

		driver.get("http://whiteboxqa.com/");
		driver.findElement(By.xpath("//h1/a[2]")).click();
		driver.findElement(By.name("fullname")).sendKeys("WBQA");
		driver.findElement(By.name("email")).sendKeys("wbqa@whiteboxqa.com");
		driver.findElement(By.name("phone")).sendKeys("555-555-5555");
		driver.findElement(By.name("message")).sendKeys("Hello, How are you?");
		driver.findElement(By.name("Clear")).click();
		String pageSource = driver.getPageSource();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		/*
		 * String script = "window.focus();"; JavascriptExecutor js =
		 * (JavascriptExecutor)driver; js.executeAsyncScript(script, null);
		 */

		/*
		 * TakesScreenshot ts = (TakesScreenshot)driver;
		 * ts.getScreenshotAs(arg0)
		 */

		driver.findElement(By.id(""));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		WebDriverWait ww = (WebDriverWait) new WebDriverWait(driver, 60)
						.pollingEvery(10, TimeUnit.SECONDS).until(
						ExpectedConditions.presenceOfElementLocated(By.id("")));

		Assert.assertTrue(pageSource.contains("Contact"));

	}
}
