package edu.wbqa.ft;

import static org.testng.AssertJUnit.*;

import java.io.File;
import java.io.FileReader;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import com.csvreader.*;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver.Navigation;

public class ContactPage {

	@Test
	public void contactSubmission() throws Exception {
		
		
		CsvReader csv =  new CsvReader(new FileReader(new File("")));
		
		
		/*FirefoxProfile fp = new FirefoxProfile("");
		WebDriver driver = new FirefoxDriver(fp);*/
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("font-size", "");
		WebDriver driver = new FirefoxDriver(cap);
		
		Actions a = new Actions(driver);
		//a.dragAndDrop(source, target)
		
		
		String guid = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		
		for(String handle : windowHandles)
		{
			driver.switchTo().window(handle);
			if(driver.getTitle().contains("webinar"))
			{
				
			}
		}
		
		
		
		driver.findElement(By.id("")).click();
		//driver.switchTo().alert().
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	
		TakesScreenshot ts = (TakesScreenshot)driver;
		//ts.getScreenshotAs(arg0)
		
		/*JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("<script> alert( </script>", "");
*/		
		
		/*WebDriverWait wait	= new WebDriverWait(driver, 10, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("")));
		wait.ignoring(NoSuchElementException.class);
		wait.pollingEvery(duration, unit)
		*/
		
		
		
		
		driver.get("http://whiteboxqa.com/contact.php");
		driver.findElement(By.cssSelector("input[name='fullname']")).sendKeys(
				"WBQA");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys(
				"somone@someemail.com");
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys(
				"555-555-5555");
		driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys(
				"Hello");
		driver.findElement(By.cssSelector("input[name='Send']")).click();
		String message = driver
				.findElement(By.cssSelector("font[color='red']")).getText();
		assertTrue(message.contains("Thank you"));
		driver.quit();
	}

	@Test
	public void clearSubmission() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://whiteboxqa.com/contact.php");
		driver.findElement(By.cssSelector("input[name='fullname']")).sendKeys(
				"WBQA");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys(
				"somone@someemail.com");
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys(
				"555-555-5555");
		driver.findElement(By.cssSelector("textarea[name='message']"))
				.sendKeys("Hello");
		driver.findElement(By.cssSelector("input[name='Clear']")).click();
		assertTrue(true);
		driver.quit();
	}

}
