package edu.wbqa.ut;

import junit.framework.Test;
import com.thoughtworks.selenium.*;

public class WBQAContact {

	public static void main(String[] args) {

		Selenium selenium = new DefaultSelenium("localhost", 4444, "*googlechrome",
				"http://whiteboxqa.com");

		selenium.open("/");
		selenium.close();
		selenium.type("", "");
		selenium.windowFocus();
		selenium.windowMaximize();
		selenium.setSpeed("5000");
		
		selenium.click("//a[@class='bt_login' and @href='contact.php']");
	}

}
