package com.macys.ui.pages;

import org.openqa.selenium.*;
import com.macys.common.*;
import com.macys.ui.*;
import com.macys.utils.*;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void login() {
		if (isMainHeaderVisible()) {
			driver.findElement(By.id("globalMastheadSignIn")).click();
		}
	}

	public boolean isShippingDealVisible() {
		return driver.findElement(By.cssSelector(".macysGlobalNavAdLink a"))
				.getAttribute("href")
				.contains("/m/campaign/free-shipping/free-shipping");
	}

	public void search(String keyword) {
		driver.findElement(Loc.getLoc("m.hp.searchbox")).sendKeys(keyword);
	}

	public int getSearchResultCount(String keyword) {
		search(keyword);
		return Integer.parseInt(driver.findElement(Loc.getLoc("m.hp.searchcount"))
				.getText().trim());
	}

}
