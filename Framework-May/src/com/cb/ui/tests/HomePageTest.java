package com.cb.ui.tests;

import com.cb.base.*;
import com.cb.pages.*;
import com.cb.utils.*;
import java.util.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class HomePageTest extends BaseTest {

	HomePage hp = null;

	@BeforeClass
	public void beforeClass() {
		hp = new HomePage(this.driver);
		hp.domainUrl = this.config.baseURL;
	}

	@Test
	public void testRegistrationBox() {
		hp.openHomePage();
		Assert.assertTrue(hp.checkCBAccountRegistration());
	}

	@DataProvider(name = "findjobs")
	public Object[][] getJobsData() throws Exception {
		List<Object> dataSet = CSVUtil.getData("mycsv.csv");
		Object[][] myArray = new Object[dataSet.size()][];
		int i = 0;
		for (Object o : dataSet) {
			myArray[i] = (Object[]) o;
			i++;
		}
		return myArray;
	}

	@Test(dataProvider = "findjobs")
	public void testFindJobs(String keyword, String location, String category) {
		hp.findJobs(keyword, location, category);
	}

}
