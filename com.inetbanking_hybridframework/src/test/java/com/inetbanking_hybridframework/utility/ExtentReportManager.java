package com.inetbanking_hybridframework.utility;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {
	
	
	public ExtentSparkReporter extentSparkReporter;
	public ExtentReports extentReports;
	public ExtentTest extentTest;
	
	String extentReportName;

	public void onStart(ITestContext context) {
		
		String timeStamp = new SimpleDateFormat("yyyy_MM_dd_hh_MM_ss").format(new Date());
		extentReportName =timeStamp+"_extent-report";

		extentSparkReporter= new ExtentSparkReporter("./Reports/"+extentReportName+".html");
		
		extentSparkReporter.config().setDocumentTitle("InetBanking Automation Test Report");
		extentSparkReporter.config().setReportName(" Functional Test Report");
		extentSparkReporter.config().setTheme(Theme.STANDARD);
		
		extentReports = new ExtentReports();
		extentReports.attachReporter(extentSparkReporter);
		
		extentReports.setSystemInfo("OS", "Window");
		extentReports.setSystemInfo("Environment", "QA");
		extentReports.setSystemInfo("Tester", "Harhsa");
		extentReports.setSystemInfo("Browser Name", "Chrome");
		extentReports.setSystemInfo("Computer Name", "Local Host");
		
	}

	public void onTestSuccess(ITestResult result) {

		extentTest= extentReports.createTest(result.getName());
		extentTest.log(Status.PASS, "Test Case PASSED is "+result.getName());
	}

	public void onTestFailure(ITestResult result) {

		extentTest= extentReports.createTest(result.getName());
		extentTest.log(Status.FAIL, "Test Case FAILED is "+result.getName());
		extentTest.log(Status.FAIL, "Test Case FAILED is "+result.getThrowable());
	}

	public void onTestSkipped(ITestResult result) {

		extentTest= extentReports.createTest(result.getName());
		extentTest.log(Status.SKIP, "Test Case SKIPPED is "+result.getName());
	}

	public void onFinish(ITestContext context) {

		extentReports.flush();
	}

}
