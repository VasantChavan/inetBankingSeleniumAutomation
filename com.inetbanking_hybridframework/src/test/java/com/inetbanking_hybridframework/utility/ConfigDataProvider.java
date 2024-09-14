package com.inetbanking_hybridframework.utility;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {

	public static Properties prop;

	public ConfigDataProvider(String fname) {
		try {
			FileInputStream fis = new FileInputStream("./Config/" + fname + ".properties");
			prop = new Properties();
			prop.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public String getUserName() {
		return prop.getProperty("uname");
	}

	public String getPassword() {
		return prop.getProperty("upass");
	}

	public String getAppURL() {
		return prop.getProperty("appURL");
	}

	public String seachKey(String key) {
		return prop.getProperty(key);
	}
	
	
//	public static void main(String[] args) {
//		
//		ConfigDataProvider configDataProvider= new ConfigDataProvider("config");
//		System.out.println(configDataProvider.getUserName());
//		System.out.println(configDataProvider.getPassword());
//		System.out.println(configDataProvider.getAppURL());
//		
//		
//		System.out.println(configDataProvider.seachKey("lpTitle"));
//	}
}
