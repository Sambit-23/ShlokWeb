package com.test.shlok;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.generics.shlok.BaseTest;
import com.pages.shlok.HomePage;
import com.pages.shlok.LoginPage;
import com.pages.shlok.ManageSubadmin;

@Listeners(com.generics.shlok.Screenshot.class)
public class TestManageSubAdmin extends BaseTest
{
	@Test(groups = "Smoke")
	public void login() throws Throwable
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		log.fetchTitle(driver);

	}
	
	@Test(groups = "Smoke",priority = 1)
	public  void homepage() throws Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		HomePage home = new HomePage(driver);
		home.manageSubAdminOpt();
		home.fetchTitle(driver);
	}
	
	@Test(groups = "Smoke",priority = 2)
	public void  submitPositiveData() throws Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		HomePage home = new HomePage(driver);
		home.manageSubAdminOpt();
		ManageSubadmin sub = new ManageSubadmin(driver);
		sub.createSubAdminandCheck();
	}
//	@Test(groups="Smoke", priority = 3)
//	public void submitDataWithInvalidEmail() throws Exception
//	{
//		LoginPage log=new LoginPage(driver);
//		log.loginmethod();
//		Thread.sleep(2000);
//		HomePage home = new HomePage(driver);
//		home.manageSubAdminOpt();
//		ManageSubadmin sub = new ManageSubadmin(driver);
//		sub.createSubAdminWithInvalidEmail();
//		
//	}
//	
//	@Test(groups="Smoke", priority = 4)
//	public void submitDataWithInvalidContactNo() throws Exception
//	{
//		LoginPage log=new LoginPage(driver);
//		log.loginmethod();
//		Thread.sleep(2000);
//		HomePage home = new HomePage(driver);
//		home.manageSubAdminOpt();
//		ManageSubadmin sub = new ManageSubadmin(driver);
//		sub.createSubAdminWithInvalidContactNo();
//	}
//	
//	@Test(groups="Smoke", priority = 5)
//	public void submitDataWithInvalidPassword() throws Exception
//	{
//		LoginPage log=new LoginPage(driver);
//		log.loginmethod();
//		Thread.sleep(2000);
//		HomePage home = new HomePage(driver);
//		home.manageSubAdminOpt();
//		ManageSubadmin sub = new ManageSubadmin(driver);
//		sub.createSubAdminWithInvalidPass();
//	}
//	
//	@Test(groups="Smoke", priority = 6)
//	public void submitDataWithInvalidImageFormat() throws Exception
//	{
//		LoginPage log=new LoginPage(driver);
//		log.loginmethod();
//		Thread.sleep(2000);
//		HomePage home = new HomePage(driver);
//		home.manageSubAdminOpt();
//		ManageSubadmin sub = new ManageSubadmin(driver);
//		sub.createSubAdminWithInvalidImageFormat();
	//}
	
}
