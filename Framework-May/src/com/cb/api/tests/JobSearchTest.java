package com.cb.api.tests;

import static org.testng.Assert.*;
import org.testng.annotations.*;

import com.cb.api.*;
import com.cb.utils.*;

public class JobSearchTest {
	
	@DataProvider(name="jobsearch")
	public Object[][] getJobData()
	{
		return new Object[][]{{"JN008","selenium",365}};
	}
	
	@Test(groups="api", dataProvider="jobsearch")
	public void testJobSearchResultsCount(String category, String keyword, int countExpected) throws Exception
	{
		JobSearch js = new JobSearch();
		String response = js.searchJobs(category, keyword);
		int count = Integer.parseInt(XMLUtils.getElementValueFromXML(response, "TotalCount"));
		assertEquals(count, countExpected);
	}
	
	@Test
	public void testJobSearchResultsContains(String category, String keyword)
	{
		
	}

}
