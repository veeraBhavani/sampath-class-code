package edu.whiteboxqa.sel1;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Script1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://whiteboxqa.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testScript2() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Contact")).click();
    driver.findElement(By.name("fullname")).clear();
    driver.findElement(By.name("fullname")).sendKeys("Hello");
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("Sampath.Velupula@gmail.com");
    driver.findElement(By.name("phone")).clear();
    driver.findElement(By.name("phone")).sendKeys("555-555-5555");
    driver.findElement(By.name("fullname")).clear();
    driver.findElement(By.name("fullname")).sendKeys("Sampath Velupula");
    driver.findElement(By.id("message")).clear();
    driver.findElement(By.id("message")).sendKeys("Hello, How are you?");
    driver.findElement(By.name("Send")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
