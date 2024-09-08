package com.inetbanking_hybridframework.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking_hybridframework.pageobjects.HomePage;
import com.inetbanking_hybridframework.pageobjects.LoginPage;
import com.inetbanking_hybridframework.testbase.TestBase;
import com.inetbanking_hybridframework.utility.Helper;

public class HomePageTestCases extends TestBase
{
	
	@Test
	public void logoutFunctionality()
	{
//		LoginPage lp = new LoginPage(driver);
//		lp.setUserName(configDataProvider.getUserName());
//		lp.setPassword(configDataProvider.getPassword());
//
//		HomePage hm = lp.clickOnLoginBtn();
		Helper.handleAlert(driver);

		Assert.assertEquals(driver.getTitle(), configDataProvider.seachKey("hmTitle"));
		
		hm.clickOnLogoutLink();
		
		Helper.handleAlert(driver);
		
		System.out.println(driver.getTitle());
		
	}
	
	

}
