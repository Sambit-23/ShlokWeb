package com.test.shlok;

import org.testng.annotations.Test;

import com.generics.shlok.BaseTest;

import com.pages.shlok.Login;
import com.pages.shlok.ManageSubadmin;

public class TestManageSubAdmin extends BaseTest
{
	@Test
	public void dataSubmit() throws Throwable
	{
		Login log=new Login(driver);
		log.loginmethod();
		Thread.sleep(2000);
		//HomePage home = new HomePage(driver);
		//home.ma
		ManageSubadmin sub = new ManageSubadmin(driver);
		sub.createSubAdmin();
		sub.pageUpScroll(driver);
		sub.checkAddedName();
	}
	
	

}
