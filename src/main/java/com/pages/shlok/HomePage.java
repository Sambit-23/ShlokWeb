package com.pages.shlok;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath ="(//a[@class='nav-link'])[5]")
	private WebElement manageroleLink;
	
	@FindBy(xpath="(//a[@class='nav-link'])[6]")
	private WebElement manageSubadminLink;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void manageroleOpt()
	{
		manageroleLink.click();
	}
	
	public void manageSubAdminOpt()
	{
		manageSubadminLink.click();
	}
}
