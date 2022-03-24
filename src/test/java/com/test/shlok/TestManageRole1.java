package com.test.shlok;

import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.generics.shlok.BaseTest;
import com.pages.shlok.HomePage;
import com.pages.shlok.Login;
import com.pages.shlok.ManageRole;
import com.pages.shlok.ManageSubadmin;

@Listeners(com.generics.shlok.Screenshot.class)
public class TestManageRole1 extends BaseTest
{
	@Test(groups={"Smoke","Regression"})
	public void submit() throws IOException, Exception
	{
		
		Login log=new Login(driver);
		log.loginmethod();
		Thread.sleep(2000);
		
		HomePage home = new HomePage(driver);
		home.manageroleOpt();
		
		ManageRole manage = new ManageRole(driver);
		manage.Compulsoryfield(driver);
		manage.AccountModule();
		manage.pageUpScroll(driver);
		manage.TimetableModule();
		manage.educationalModule();
		manage.NewsandEventModule();
		manage.TransportModule();
		manage.MerchandiseModule();
		manage.saveMethod();
		manage.pageUpScroll(driver);
		manage.viewRolePage();
		manage.editEducationalModule();
		manage.saveChangeMethod();
	//	ManageSubadmin sub= new ManageSubadmin()
		
		
	}
	
	
}
