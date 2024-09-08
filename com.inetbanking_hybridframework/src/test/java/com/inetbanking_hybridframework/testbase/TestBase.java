package com.inetbanking_hybridframework.testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.inetbanking_hybridframework.pageobjects.HomePage;
import com.inetbanking_hybridframework.pageobjects.LoginPage;
import com.inetbanking_hybridframework.utility.ConfigDataProvider;

public class TestBase {

	public static WebDriver driver;
	public static ConfigDataProvider configDataProvider;
	public static LoginPage lp;
	public static HomePage hm;
	
	@BeforeSuite
	public void init()
	{
		configDataProvider=new ConfigDataProvider("config");
		
		
	}
	
	@BeforeClass
	public void initialisePageObjects()
	{
		lp= new LoginPage(driver);
		lp.setUserName(configDataProvider.getUserName());
		lp.setPassword(configDataProvider.getPassword());
		hm=lp.clickOnLoginBtn();
	}

	@BeforeTest
	@Parameters("brName")
	public void setup(@Optional("Chrome")String brName) {
		
		if(brName.equals("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(brName.equals("Firefox"))
		{
			driver= new FirefoxDriver();
		}
		else if(brName.equals("Edge"))
		{
			driver= new EdgeDriver();
		}
			
		//driver.get("https://demo.guru99.com/v4/");
		driver.get(configDataProvider.getAppURL());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
