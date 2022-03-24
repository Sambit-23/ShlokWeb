package com.test.shlok;

import org.testng.annotations.Test;
import com.generics.shlok.BaseTest;
import com.pages.shlok.HomePage;
import com.pages.shlok.Login;
import com.pages.shlok.ManageRole;

public class TestManageRole2 extends BaseTest
{
	@Test
	public void submit() throws Exception
	{
		
		Login log=new Login(driver);
		log.loginmethod();
		Thread.sleep(2000);
		HomePage home = new HomePage(driver);
		home.manageroleopt();
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
