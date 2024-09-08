package com.inetbanking_hybridframework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//a[text()='Manager']")
	WebElement managerLink;
	
	@FindBy(xpath = "//a[text()='New Customer']")
	WebElement newCustomerLink;
	
	@FindBy(xpath = "//a[text()='Edit Customer']")
	WebElement editCustomerLink;
	
	@FindBy(xpath = "//a[text()='Delete Customer']")
	WebElement deleteCustomerLink;
	
	@FindBy(xpath = "//a[text()='New Account']")
	WebElement newAccountLink;
	
	@FindBy(xpath = "//a[text()='Edit Account']")
	WebElement editAccountLink;
	
	@FindBy(xpath = "//a[text()='Delete Account']")
	WebElement deleteAccountLink;
	
	
	@FindBy(xpath = "//a[text()='Log out']")
	WebElement logoutLink;

	
	
	public void clickOnLogoutLink()
	{
		logoutLink.click();
	}
	
	
	public ManagerPage clickOnManagerLink()
	{
		managerLink.click();
		return new ManagerPage(driver);
	}
	
	
	public NewCustomerPage clickOnNewCustomer()
	{
		newCustomerLink.click();
		return new NewCustomerPage(driver);
	}
	
	public EditCustomerPage clickOnEditCustomer()
	{
		newCustomerLink.click();
		return new EditCustomerPage(driver);
	}
	
	public DeleteCustomerPage clickOnDeleteCustomer()
	{
		newCustomerLink.click();
		return new DeleteCustomerPage(driver);
	}
	
	public NewAccountPage clickOnNewAccount()
	{
		newCustomerLink.click();
		return new NewAccountPage(driver);
	}
	
	public EditAccountPage clickOnEditAccount()
	{
		newCustomerLink.click();
		return new EditAccountPage(driver);
	}
	
	public DeleteAccountPage clickOnDeleteAccount()
	{
		newCustomerLink.click();
		return new DeleteAccountPage(driver);
	}
	
	
	
}
