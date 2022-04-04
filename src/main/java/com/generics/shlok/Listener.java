package com.generics.shlok;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{
	public void onTestFailure(ITestResult result)
	{
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		TakesScreenshot ts = (TakesScreenshot)BaseTest.driver;
		File srcfile =ts.getScreenshotAs(OutputType.FILE);
		String name=result.getName();
		Date today=Calendar.getInstance().getTime();
		String date=today.toString().replace(":", "-");
		File destfile=new File("./FailedScreenshot/" +name+date+ ".png");
		try {
			FileUtils.copyFile(srcfile, destfile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Reporter.log(result.getMethod().getMethodName()+" is Failed");
		Reporter.log("Test Case is Fail",true);
		
	}
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log(result.getMethod().getMethodName()+" is Passed");
		Reporter.log("Test case is Pass", true);
	}
	public void onTestStrat(ITestResult result)
	{
		Reporter.log(result.getTestClass().getName() +" is Started Successfully");
		Reporter.log("Test is Starting");
	}
	public void onTestSkip(ITestResult result)
	{
		Reporter.log(result.getMethod().getMethodName()+" is Skipped");
		Reporter.log("Test case is Skipped");
	}
	
}
