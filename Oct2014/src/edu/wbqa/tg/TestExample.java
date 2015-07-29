package edu.wbqa.tg;

import java.io.File;
import java.io.FileWriter;
import java.util.concurrent.TimeUnit;

import org.testng.*;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.htmlunit.*;

public class TestExample {

	public WebDriver driver = null;

	@BeforeMethod
	public void doThisBefore() {
		driver = new HtmlUnitDriver();
		driver.get("http://whiteboxqa.com/contact.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().window().setSize(arg0);
	}

	@Test(groups = "functional")
	public void testContact() throws Exception {
		driver.findElement(By.name("fullname")).sendKeys("WHITEBOXQA");
		driver.findElement(By.name("email")).sendKeys("contact@whiteboxqa.com");
		driver.findElement(By.name("phone")).sendKeys("555-555-5555");
		driver.findElement(By.name("message")).sendKeys("Hi");

		if (driver.findElement(By.name("Send")).isEnabled()) {
			driver.findElement(By.name("Send")).click();
		}
		
		System.out.println(driver.getWindowHandle());

		Assert.assertTrue(driver.getPageSource().indexOf(
				"Thank you for contacting us") >= 0);
		
		/*TakesScreenshot ts = (TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileWriter fw = new FileWriter(file);
		fw.write("");*/
		
	
		
	
		//driver.manage().window().
		
		//driver.navigate().
	}

	@AfterMethod
	public void doThisAfter() {
		driver.quit();
	}

}
