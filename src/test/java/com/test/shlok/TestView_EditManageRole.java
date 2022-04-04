package com.test.shlok;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.generics.shlok.BaseTest;
import com.pages.shlok.HomePage;
import com.pages.shlok.LoginPage;
import com.pages.shlok.ManageRole;

@Listeners(com.generics.shlok.Listener.class)
public class TestView_EditManageRole extends BaseTest
{
	@Test(priority=1)
	public void editWithValidData() throws Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		
		HomePage home = new HomePage(driver);
		home.manageroleOpt();
		
		ManageRole role = new ManageRole(driver);
		role.editRoleWithValidData();
	}
	
	@Test(priority=2)
	public void editWithoutValidRoleName() throws Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		
		HomePage home = new HomePage(driver);
		home.manageroleOpt();
		
		ManageRole role = new ManageRole(driver);
		role.editRoleWithoutRoleName();
	}
	
	@Test(priority=3)
	public void editWithoutSelectingModule() throws Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		
		HomePage home = new HomePage(driver);
		home.manageroleOpt();
		
		ManageRole role = new ManageRole(driver);
		role.editRoleWithoutSelectingModule();
		//role.deleteRole();
	}
	
	@Test(priority=4)
	public void deleteRole() throws Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		
		HomePage home = new HomePage(driver);
		home.manageroleOpt();
		
		ManageRole role = new ManageRole(driver);
		role.deleteRole();
	}
}
