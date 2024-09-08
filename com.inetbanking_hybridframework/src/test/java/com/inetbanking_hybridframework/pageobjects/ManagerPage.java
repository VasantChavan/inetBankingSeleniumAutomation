package com.inetbanking_hybridframework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ManagerPage {

	WebDriver driver;

	public ManagerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//marquee[@class='heading3']")
	@CacheLookup
	WebElement manageralPageWelcomeMsg;
	
	
	@FindBy(how=How.XPATH,using = "//tr[@class='heading3']/td")
	WebElement managerID;
	
	
	
	public String fetchManagerWelcomeTextMsg()
	{
		return manageralPageWelcomeMsg.getText();		
	}
	
	public String fetchManagerID()
	{
		return managerID.getText();
	}
}
