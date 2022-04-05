package com.pages.shlok;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.generics.shlok.BasePage;
import com.generics.shlok.BaseTest;
import com.generics.shlok.ExcelLibrary;

public class DashBoard extends BasePage
{
	@FindBy(id = "branchCount")
	private WebElement branchCountLink;
	
	@FindBy(xpath = "//h3[@id='subAdminCount']")
	private WebElement subAdminCountLink;
	
	@FindBy(id = "teacherCount")
	private WebElement teacherCountLink;
	
	@FindBy(id = "studnetCount")
	private WebElement studentCountLink;
	
	@FindBy(xpath = "//select[@id='Branch_ID']")
	private WebElement branchNameDropdown;
	
	@FindBy(xpath = "//div[@id='new-notification']")
	private WebElement NotificationLink;
	
	@FindBy(xpath = "//div[@id='upcomingEvents']")
	private WebElement upcomingEventLink; 
	
	@FindBy (xpath = "//label[@key='Common Module']")
	private WebElement commonModuleDropdown;
	
	@FindBy (xpath = "//label[@key='Account Module']")
	private WebElement accountModuleDropdown;
	
	@FindBy (xpath = "//label[@key='Timetable Module']")
	private WebElement timetableModuleDropdown;
	
	@FindBy (xpath = "//label[@key='Educational Module']")
	private WebElement educationModuleDropdown;
	
	@FindBy (xpath = "//label[@key='News & Events Module']")
	private WebElement newsAndEventModuleDropdown;
	
	@FindBy (xpath = "//label[@key='Transportation Module']")
	private WebElement transportationModuleDropdown;
	
	public DashBoard(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void dashboardCount()
	{
		String branchNo = branchCountLink.getText();
		Reporter.log("The total number of Branch is : "+branchNo);
		String subadminNo = subAdminCountLink.getText();
		Reporter.log("The total number of Sub-Admins are : "+subadminNo);
		String teacherNo = teacherCountLink.getText();
		Reporter.log("The total number of Teachers are : "+teacherNo);
		String studentNo = studentCountLink.getText();
		Reporter.log("The total number of Students are : "+studentNo);
		
	}
	public void selectBranch() throws IOException
	{
		SelectbyVisibleText(branchNameDropdown, ExcelLibrary.getcellvalue(BranchName, 1, 0));
	}
	
	public void recentnotification()
	{
		String notification = NotificationLink.getText();
		Reporter.log(notification);
	}
	
	public void upcomingEvent()
	{
		String upcomingEvent = upcomingEventLink.getText();
		Reporter.log(upcomingEvent);
	}
	
	public void commonModule() throws InterruptedException
	{
		commonModuleDropdown.click();
		
		List <WebElement> element = driver.findElements(By.xpath("(//ul[@class='modules'])[1]"));
		for (int i = 0 ; i<element.size(); i++)
		{
			String el = element.get(i).getText();
			Reporter.log(el);
	
		}
		Thread.sleep(1000);
		commonModuleDropdown.click();
	}
	
	public void accountModule() throws InterruptedException
	{
		accountModuleDropdown.click();
		
		List<WebElement> element = driver.findElements(By.xpath("(//ul[@class='modules'])[2]"));
		for (int i = 0 ; i<element.size(); i++)
		{
			String el = element.get(i).getText();
			Reporter.log(el);
	
		}
		Thread.sleep(1000);
		accountModuleDropdown.click();
	}
	
	public void timetableModule() throws InterruptedException
	{
		timetableModuleDropdown.click();
		
		List<WebElement> element = driver.findElements(By.xpath("(//ul[@class='modules'])[3]"));
		for (int i = 0 ; i<element.size(); i++)
		{
			String el = element.get(i).getText();
			Reporter.log(el);
	
		}
		Thread.sleep(1000);
		timetableModuleDropdown.click();
	}
	
	public void educationalModule() throws Exception
	{
		educationModuleDropdown.click();
		robotArrowDown(driver, 9);
		List<WebElement> element = driver.findElements(By.xpath("(//ul[@class='modules'])[4]"));
		System.out.println(element.size());
		for (int i = 0 ; i<element.size(); i++)
		{
			String el = element.get(i).getText();
			Reporter.log(el);
	
		}
		Thread.sleep(1000);
		
	}
	
	public void newsAndEventModule() throws Exception
	{
		newsAndEventModuleDropdown.click();
		robotArrowDown(driver, 5);
		List<WebElement> element = driver.findElements(By.xpath("(//ul[@class='modules'])[5]"));
		for (int i = 0 ; i<element.size(); i++)
		{
			String el = element.get(i).getText();
			Reporter.log(el);
	
		}
		Thread.sleep(1000);
		newsAndEventModuleDropdown.click();
	}
	public void transportationModule() throws Exception
	{
		robotArrowDown(driver, 5);
		transportationModuleDropdown.click();
		List<WebElement> element = driver.findElements(By.xpath("(//ul[@class='modules'])[6]"));
		for (int i = 0 ; i<element.size(); i++)
		{
			String el = element.get(i).getText();
			Reporter.log(el);
	
		}
		Thread.sleep(1000);
		transportationModuleDropdown.click();
	}
	
}
























