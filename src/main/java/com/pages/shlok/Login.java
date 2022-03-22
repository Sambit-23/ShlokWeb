package com.pages.shlok;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.shlok.AutoConstant;
import com.generics.shlok.ExcelLibrary;

public class Login implements AutoConstant
{
	@FindBy(id="Email")
	private WebElement usernameTextfield;
	
	@FindBy(id="Password")
	private WebElement passwordTextfield;
	
	@FindBy(xpath="//i[@id='togglePassword']")
	private WebElement passwordvisibilityIcon;
	
	@FindBy(xpath ="//button[@type='submit']")
	private WebElement loginButton;
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	 public void loginmethod() throws IOException
	 {
		 usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(Logindata, 1, 0));
		 passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(Logindata, 1, 1));
		 loginButton.click();
	 }
}
