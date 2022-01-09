package com.qa.linkedin.test;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.qa.linkedin.base.TestBase;
import com.qa.linkedin.pages.LinkedInLoggedInPage;
import com.qa.linkedin.pages.LinkedinHomePage;
import com.qa.linkedin.pages.SearchResultsPage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

public class SearchDataDrivenTest extends TestBase {

	private Logger log = Logger.getLogger(SearchDataDrivenTest.class);

	LinkedinHomePage Homepg = null;
	LinkedInLoggedInPage lloggedinpg = null;
	SearchResultsPage srPg = null;

	@Test(dataProvider = "dp")
	public void f(Integer n, String s) {
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, };
	}

	@BeforeClass
	public void beforeClass() {
	}

}
