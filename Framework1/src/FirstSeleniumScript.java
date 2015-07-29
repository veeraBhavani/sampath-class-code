import com.thoughtworks.selenium.*;

import org.testng.annotations.*;

import static org.testng.Assert.*;

import java.util.regex.Pattern;

public class FirstSeleniumScript extends SeleneseTestNgHelper {

	Selenium selenium;
	
	@BeforeSuite
	public void setUp() {
		selenium = new DefaultSelenium("localhost", 4444, "*firefox",
				"http://whiteboxqa.com");
	}

	@Test
	public void testFirstSeleniumScript() throws Exception {
		selenium.open("/");
		selenium.click("link=Contact");
		selenium.waitForPageToLoad("30000");
		selenium.type("name=fullname", "Whiteboxqa");
		selenium.type("name=email", "whiteboxqa@gmail.com");
		selenium.type("name=phone", "555-555-5555");
		selenium.type("id=message", "Hello");
		selenium.click("name=Send");
		selenium.waitForPageToLoad("30000");
	}
}
