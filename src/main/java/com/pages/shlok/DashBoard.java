package com.pages.shlok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.shlok.BaseTest;

public class DashBoard extends BaseTest
{
	@FindBy(id = "branchCount")
	private WebElement branchCountLink;
	
	@FindBy(xpath = "//h3[@id='subAdminCount']")
	private WebElement subAdminCountLink;
	
	public DashBoard(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void subAdminCount()
	{
		
	}
}
