package com.pages.shlok;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;
import com.generics.shlok.AutoConstant;
import com.generics.shlok.BasePage;
import com.generics.shlok.ExcelLibrary;

public class LoginPage extends BasePage implements AutoConstant
{
	@FindBy(id="Email")
	private WebElement usernameTextfield;
	
	@FindBy(id="Password")
	private WebElement passwordTextfield;
	
	@FindBy(xpath="//i[@id='togglePassword']")
	private WebElement passwordvisibilityIcon;
	
	@FindBy(xpath ="//button[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(xpath="//title[.='SHLOK | Admin Dashboard ']")
	private WebElement homepageTitle;
	
	@FindBy(xpath="//a[.='Forgot Password?']")
	private WebElement forgotPassowrdLink;
	
	@FindBy(xpath="//select[@name='language']")
	private WebElement languageDropdown;
	
	@FindBy(xpath="(//div[.='Username and password were incorrect'])[3]")
	private WebElement errorMessageText;
	
	SoftAssert asset = new SoftAssert();
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// with Valid Data   Expected condition failed: waiting for title to be "". Current title: "SHLOK | Admin Dashboard" (tried for 20 second(s) with 2000 milliseconds interval)
	public void loginmethod() throws IOException
	{
		usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(Logindata, 1, 0));
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(Logindata, 1, 1));
		loginButton.click();
		
		String text="SHLOK | Admin Dashboard";
		waitforElement(driver,text);
		driver.findElement(By.id("profilename")).click();;
		String title = driver.getTitle();
		
		asset.assertEquals(title, text, "Title is not match");;
		Reporter.log("Login is Successful");
		asset.assertAll();
		
	}
	public void loginWithInvalidDataAndCheckMessage() throws IOException
	{
		usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(Invalid, 1, 0));
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(Logindata, 2, 1));
		loginButton.click();
		
		String actualErrormessage = errorMessageText.getText();
		String expectedErrormessage = "Username and password were incorrect";
		
		asset.assertEquals(actualErrormessage, expectedErrormessage);
		Reporter.log("Correct Error Message for Unsuccessful Login Is Shown i.e :"+" "+expectedErrormessage);
		asset.assertAll();
	}
	public void loginWithInvalidPW() throws IOException
	{
		usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(Logindata, 3, 0));
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(Invalid, 1, 1));
		loginButton.click();
		
		String expected = "SHLOK | Admin Dashboard";
		
		String title =driver.getTitle();
		
		asset.assertEquals(title, expected);
		Reporter.log("Login is not Successful");
		asset.assertAll();
	}
	public void loginWithInvalidUN() throws IOException
	{
		usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(Invalid, 1, 0));
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(Logindata, 2, 1));
		loginButton.click();
		
		String expected = "SHLOK | Admin Dashboard";
		
		String title =driver.getTitle();
		
		asset.assertEquals(title, expected);
		Reporter.log("Login is not Successful");
		asset.assertAll();
	}
	
	// Blank UN and PW
	
	public void loginWithBlankUNandPW() throws IOException
	{
		
		loginButton.click();
		
		String expected = "SHLOK | Admin Dashboard";
		
		String title =driver.getTitle();
		
		asset.assertEquals(title, expected);
		Reporter.log("LOGIN IS NOT SUCCESSFUL DUE TO BLANK UN and PW");
		asset.assertAll();
	}
	
	//email without @
	
	public void loginWithWrongUN() throws IOException
	{
		usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(Invalid, 2, 0));
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(Logindata, 2, 1));
		loginButton.click();
		
		String expected = "SHLOK | Admin Dashboard";
		
		String title =driver.getTitle();
		
		asset.assertEquals(title, expected);
		Reporter.log("Login is not Successful");
		asset.assertAll();
	}
	public void forgotPassword()
	{
		forgotPassowrdLink.click();
	}
	public void passwordVisiblityMethod()
	{
		passwordvisibilityIcon.click();
	}
	public void selectLanguageMethod() throws Exception
	{
		SelectbyVisibleText(languageDropdown, ExcelLibrary.getcellvalue(Langue, 7, 2));
	}
	
}

