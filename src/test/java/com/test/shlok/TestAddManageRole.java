package com.test.shlok;

import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.generics.shlok.BaseTest;
import com.pages.shlok.HomePage;
import com.pages.shlok.LoginPage;
import com.pages.shlok.ManageRole;
@Listeners(com.generics.shlok.Listener.class)
public class TestAddManageRole extends BaseTest
{
	@Test(priority=1)
	public void positiveTC() throws IOException, Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		
		HomePage home = new HomePage(driver);
		home.manageroleOpt();
		
		ManageRole  role = new ManageRole(driver);
		role.creatRoleWithValidData();		
	}
	@Test(priority=2)
	public void negativeTC_1() throws IOException, Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		
		HomePage home = new HomePage(driver);
		home.manageroleOpt();
		
		ManageRole  role = new ManageRole(driver);
		role.createRoleWithoutAnyModule();
	}
	@Test(priority=3)
	public void negativeTC_2() throws IOException, Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		
		HomePage home = new HomePage(driver);
		home.manageroleOpt();
		
		ManageRole  role = new ManageRole(driver);
		role.createRoleWithoutSelectingBranch();
	}
	@Test(priority=4)
	public void negativeTC_3() throws IOException, Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		
		HomePage home = new HomePage(driver);
		home.manageroleOpt();
		
		ManageRole  role = new ManageRole(driver);
		role.createRoleWithoutSelectingRole();
	}
	
}
