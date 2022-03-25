package com.pages.shlok;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.shlok.AutoConstant;
import com.generics.shlok.BasePage;

public class HomePage extends BasePage implements AutoConstant
{
	@FindBy(xpath="(//a[@class='nav-link'])[4]")
	private WebElement creatBranchLink;
	
	@FindBy(xpath ="(//a[@class='nav-link'])[5]")
	private WebElement manageroleLink;
	
	@FindBy(xpath="(//a[@class='nav-link'])[6]")
	private WebElement manageSubadminLink;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void creatBranchOpt()
	{
		creatBranchLink.click();
		
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
