package com.macys.ui.tests;

import static org.testng.AssertJUnit.*;

import org.testng.Assert;
import org.testng.annotations.*;

import com.macys.common.*;
import com.macys.ui.pages.*;
import com.macys.utils.Data;

public class HomePageTest extends BaseTest {
	
	public HomePage hp;
	
	@BeforeClass
	public void beforeClass()
	{
		hp = new HomePage(driver);
	}
	
	@Test
	public void testHeaderLinks()
	{
		assertEquals(hp.getTopNavLinksCount(), 6);
	}
	
	@DataProvider(name="searchdata")
	public Object[][] getSearchData() throws Exception
	{
		return Data.getDataFromSheet("");
	}
	
	@Test(dataProvider="searchdata", groups="functional")
	public void testSearch(String keyword, int count)
	{
		assertEquals(hp.getSearchResultCount(keyword), count);
	}
	
	@AfterClass
	public void afterClass()
	{
		hp = null;
	}

}
