package edu.whiteboxqa.sel1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.htmlunit.*;

public class Test2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://www.innova-path.com/project/admin/login.php");
		
		
		Navigation nav = driver.navigate();
		nav.to("");

		Options opt = driver.manage();
		opt.timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		
		driver.findElement(By.name("username")).sendKeys("rupaatre@hotmail.com");
		driver.findElement(By.name("password")).sendKeys("chips22");
		driver.findElement(By.className("submit")).click();
		driver.get("http://www.innova-path.com/project/admin/candidateassignmentmgmt.php");
		driver.findElement(By.xpath("//select[@id='assignmentid']/option[2]")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Window window = driver.manage().window();
		
		WebElement element = driver.findElement(By.id("assignment"));
		if(element != null)
		{
			element.sendKeys("This is my answer");
			driver.findElement(By.name("Send")).click();
		}

	}

}
