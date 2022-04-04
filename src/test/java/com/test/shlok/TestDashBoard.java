package com.test.shlok;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.shlok.BaseTest;
import com.pages.shlok.DashBoard;
import com.pages.shlok.HomePage;
import com.pages.shlok.LoginPage;

public class TestDashBoard extends BaseTest
{
	@Test
	public void testdb() throws Exception
	{

		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		
		DashBoard db = new DashBoard(driver);
		db.subAdminCount();
	}
}
