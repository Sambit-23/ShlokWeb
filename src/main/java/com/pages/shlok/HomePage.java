package com.pages.shlok;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath ="(//a[@class='nav-link'])[5]")
	private WebElement manageroleLink;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void manageroleopt()
	{
		manageroleLink.click();
	}
}
