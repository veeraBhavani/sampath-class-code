package edu.wbqa.ft1;

import com.thoughtworks.selenium.*;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import java.util.regex.Pattern;

public class MyFirstSeleniumTest {

	public Selenium selenium;

	@BeforeSuite
	public void setup() {
		selenium = new DefaultSelenium("localhost", 4444, "*iexplore",
				"http://whiteboxqa.com");
	}

	@Test
	public void test() throws Exception {
		selenium.windowMaximize();
		selenium.windowFocus();
		selenium.open("/");
		selenium.click("link=Contact");
		selenium.waitForPageToLoad("30000");
		selenium.type("name=fullname", "Sampath Velupula");
		selenium.type("name=email", "Sampath.Velupula@gmail.com");
		selenium.type("name=phone", "555-555-5555");
		selenium.type("id=message", "wekruweupoup");
		selenium.click("name=Clear");
		boolean actual = selenium.isTextPresent("Thank you for contacting");
		assertTrue(actual);
	}

}
