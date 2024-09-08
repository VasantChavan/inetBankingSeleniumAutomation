package com.inetbanking_hybridframework.utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class Helper {

	
	
	public static void handleAlert(WebDriver driver)
	{
		if(isAlertPreset(driver))
		{
			Alert alert =driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
		}
		else
		{
			System.out.println("Alert is not present on the webpage");
		}
	}
	
	public static boolean isAlertPreset(WebDriver driver)
	{
		
		try {
			driver.switchTo().alert();
			
			return true;
			
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
			return false;
		}
		
		
	}
}
