package com.pages.shlok;

import java.io.IOException;
import org.openqa.selenium.By;
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
	public void loginmethodNegative1(WebDriver driver) throws IOException
	{
		usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(Logindata, 2, 0));
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(Logindata, 2, 1));
		loginButton.click();
		WebElement error=driver.findElement(By.xpath("(//div[.='Username and password were incorrect'])[3]"));
		String errormessage = error.getText();
		if (errormessage.equals("Username and password were incorrect"))
		{
			System.out.println("Text is Matching");
		}
		else
		{
			System.out.println("Text is Not Matching");
		}
	}
	public void loginmethodNegative2(WebDriver driver) throws IOException
	{
		usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(Logindata, 3, 0));
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(Logindata, 3, 1));
		loginButton.click();
		WebElement error=driver.findElement(By.xpath("(//div[.='Username and password were incorrect'])[3]"));
		String errormessage = error.getText();
		if (errormessage.equals("Username and password were incorrect"))
		{
			System.out.println("Text is Matching");
		}
		else
		{
			System.out.println("Text is Not Matching");
		}
		
	}	
	public void clearTextfield()
	{
			usernameTextfield.clear();
			passwordTextfield.clear();
	}
}

