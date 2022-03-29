package com.test.shlok;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.generics.shlok.BaseTest;
import com.pages.shlok.HomePage;
import com.pages.shlok.LoginPage;
import com.pages.shlok.ManageRole;

@Listeners(com.generics.shlok.Listener.class)
public class TestManageRole2 extends BaseTest
{
	@Test
	public void submit() throws Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		
		HomePage home = new HomePage(driver);
		home.manageroleOpt();
		
		ManageRole manage = new ManageRole(driver);
		manage.Compulsoryfield(driver);
		manage.AccountModule();
		manage.TimetableModule();
		manage.educationalModule();
		manage.NewsandEventModule();
		manage.TransportModule();
		manage.MerchandiseModule();
		Thread.sleep(1000);
		manage.uncheckAll();
	}
}
