package com.wbqa.example;

import java.util.HashSet;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

public class Test2 {

	public static void main(String[] args) {

		int pageNumber = 1;
		String keyword = "qa";
		boolean gotoNextPage = true;

		HashSet<String> urls = new HashSet<String>();

		WebDriver driver = new FirefoxDriver();

		while(gotoNextPage)
		{
			String url = "http://jobsearch.monster.com/search/" + keyword
					+ "+IT-Software-Development_54?pg=" + pageNumber
					+ "&sort=dt.rv.di";
			driver.get(url);
			for (WebElement element : driver.findElements(By
					.className("jobTitleContainer"))) {
				urls.add(element.findElement(By.tagName("a")).getAttribute("href"));
			}
			
			if(!driver.findElement(By.xpath("//a[@rel='Next'")).isEnabled())
			{
				gotoNextPage = false;
			}
			pageNumber++;
		}


	}

}
