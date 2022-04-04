package com.test.shlok;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.generics.shlok.BaseTest;
import com.pages.shlok.HomePage;
import com.pages.shlok.LoginPage;

@Listeners(com.generics.shlok.Listener.class)
public class TestLogin extends BaseTest 
{
	@Test(priority = 1)
	public void positiveTC() throws IOException, Exception 
	{
		LoginPage login = new LoginPage(driver);
		login.loginmethod();
		HomePage home = new HomePage(driver);
		home.logoutMethod();
	}
	@Test(priority=2)
	public void negativeTC_1() throws IOException
	{
		LoginPage login = new LoginPage(driver);
		login.loginWithBlankUNandPW();
	}
	@Test(priority=3)
	public void negativeTC_2() throws IOException
	{
		LoginPage login = new LoginPage(driver);
		login.loginWithInvalidDataAndCheckMessage();
	}
	@Test(priority=4)
	public void negativeTC_3() throws IOException
	{
		LoginPage login = new LoginPage(driver);
		login.loginWithInvalidPW();
	}
	@Test(priority=5)
	public void negativeTC_4() throws IOException
	{
		LoginPage login = new LoginPage(driver);
		login.loginWithInvalidUN();
	}
	@Test(priority=6)
	public void negativeTC_5() throws IOException
	{
		LoginPage login = new LoginPage(driver);
		login.loginWithWrongUN();
	}
}
