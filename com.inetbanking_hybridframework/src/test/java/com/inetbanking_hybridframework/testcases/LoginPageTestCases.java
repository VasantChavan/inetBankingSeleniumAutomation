package com.inetbanking_hybridframework.testcases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inetbanking_hybridframework.testbase.TestBase;

@Listeners(com.inetbanking_hybridframework.utility.ExtentReportManager.class)
public class LoginPageTestCases extends TestBase {

	@Test(priority = 1)
	public void validateLoginPageTitle() {
		 String expTitle="Guru99 Bank Home Page";
		 String actTitle =driver.getTitle();

		//Assert.assertEquals(driver.getTitle(), configDataProvider.seachKey("lpTitle"));
		
		Assert.assertEquals(actTitle,expTitle);
	}

	@Test(priority = 2)
	public void validateLoginFunctionality() {
		//LoginPage lp = new LoginPage(driver);

//		lp.setUserName("mngr587631");
//		lp.setPassword("dEmugEs");

//		lp.setUserName(configDataProvider.getUserName());
//		lp.setPassword(configDataProvider.getPassword());
//
//		hm =lp.clickOnLoginBtn();

		// String expTitle="Guru99 Bank Manager HomePage";
		// String actTitle=driver.getTitle();
		
		//Helper.handleAlert(driver);
		System.out.println(configDataProvider.seachKey("hmTitle"));

		Assert.assertEquals(driver.getTitle(), configDataProvider.seachKey("hmTitle"));

	}

}
