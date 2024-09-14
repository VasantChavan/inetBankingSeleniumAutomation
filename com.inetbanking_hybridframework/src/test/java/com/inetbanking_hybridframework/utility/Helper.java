package com.inetbanking_hybridframework.utility;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;

import org.openqa.selenium.WebDriver;

public class Helper {

	
	
	
	public static String getTimeStamp()
	{
		return new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss").format(new Date());
	}
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
			//e.printStackTrace();
			System.out.println(e.getMessage());
			return false;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
