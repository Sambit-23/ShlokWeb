package com.test.shlok;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.shlok.BaseTest;
import com.pages.shlok.HomePage;
import com.pages.shlok.Login;
import com.pages.shlok.ManageRole;

public class Test1 extends BaseTest
{
	@Test(priority=1)
	public void submit() throws IOException, Exception
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
	}
	
	
}
