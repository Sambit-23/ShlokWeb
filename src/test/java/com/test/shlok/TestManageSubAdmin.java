package com.test.shlok;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.generics.shlok.BaseTest;
import com.pages.shlok.HomePage;
import com.pages.shlok.Login;
import com.pages.shlok.ManageSubadmin;

@Listeners(com.generics.shlok.Screenshot.class)
public class TestManageSubAdmin extends BaseTest
{
	@Test
	public void dataSubmit() throws Throwable
	{
		Login log=new Login(driver);
		log.loginmethod();
		Thread.sleep(2000);
		HomePage home = new HomePage(driver);
		home.manageSubAdminOpt();
		ManageSubadmin sub = new ManageSubadmin(driver);
		sub.createSubAdmin();
		sub.pageUpScroll(driver);
		sub.checkAddedName(driver);
	}
	
}
