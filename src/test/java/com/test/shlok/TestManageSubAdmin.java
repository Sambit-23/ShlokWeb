package com.test.shlok;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import com.generics.shlok.BaseTest;
import com.pages.shlok.HomePage;
import com.pages.shlok.LoginPage;
import com.pages.shlok.ManageSubadmin;

@Listeners(com.generics.shlok.Listener.class)
public class TestManageSubAdmin extends BaseTest
{
	@Test(groups = "Smoke",priority = 1)
	public void login() throws Throwable
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		log.fetchTitle(driver);
	}
	
	@Test(groups = "Smoke",priority = 2)
	public  void homepage() throws Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		HomePage home = new HomePage(driver);
		home.manageSubAdminOpt();
		home.fetchTitle(driver);
	}
	
	@Test(groups = "Smoke",priority = 3)
	public void createSubAdminWithValidData() throws Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		HomePage home = new HomePage(driver);
		home.manageSubAdminOpt();
		Thread.sleep(2000);
		ManageSubadmin sub = new ManageSubadmin(driver);
		sub.createSubAdminandCheck();
		
	}
	@Test(groups="Smoke", priority = 4)
	public void createSubAdminWithInvalidEmail() throws Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		HomePage home = new HomePage(driver);
		home.manageSubAdminOpt();
		ManageSubadmin sub = new ManageSubadmin(driver);
		sub.createSubAdminWithInvalidEmail();
	}
	
	@Test(groups="Smoke", priority = 5)
	public void createSubAdminWithInvalidContactNo() throws Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		HomePage home = new HomePage(driver);
		home.manageSubAdminOpt();
		ManageSubadmin sub = new ManageSubadmin(driver);
		sub.createSubAdminWithInvalidContactNo();
	}
	
	@Test(groups="Smoke", priority = 6)
	public void createSubAdminWithInvalidPassword() throws Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		HomePage home = new HomePage(driver);
		home.manageSubAdminOpt();
		ManageSubadmin sub = new ManageSubadmin(driver);
		sub.createSubAdminWithInvalidPass();
	}
	
	@Test(groups="Smoke", priority = 7)
	public void createSubAdminWithInvalidImageFormat() throws Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		HomePage home = new HomePage(driver);
		home.manageSubAdminOpt();
		ManageSubadmin sub = new ManageSubadmin(driver);
		sub.createSubAdminWithInvalidFileFormat();
	}
	
	@Test(groups = "Smoke",priority =8)
	public void createSubadminWithoutBranch () throws Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		HomePage home = new HomePage(driver);
		home.manageSubAdminOpt();
		Thread.sleep(2000);
		ManageSubadmin sub = new ManageSubadmin(driver);
		sub.createSubAdminWithoutSelectingBranch();
	}
	
	@Test(groups = "Smoke",priority = 9)
	public void createSubadminWithoutAccessRight () throws Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		HomePage home = new HomePage(driver);
		home.manageSubAdminOpt();
		Thread.sleep(2000);
		ManageSubadmin sub = new ManageSubadmin(driver);
		sub.createSubAdminWithoutAccessRight();
	}
	
	@Test(groups = "Smoke",priority =10 )
	public void createSubadminWithoutRole () throws Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		HomePage home = new HomePage(driver);
		home.manageSubAdminOpt();
		Thread.sleep(2000);
		ManageSubadmin sub = new ManageSubadmin(driver);
		sub.createSubAdminWithoutRole();
	}
	
	@Test(groups = "Smoke",priority =11 )
	public void createSubadminWithoutEmailId () throws Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		HomePage home = new HomePage(driver);
		home.manageSubAdminOpt();
		Thread.sleep(2000);
		ManageSubadmin sub = new ManageSubadmin(driver);
		sub.createSubAdminWithoutEmail();
	}

	@Test(groups = "Smoke",priority =12)
	public void createSubadminWithoutName () throws Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		HomePage home = new HomePage(driver);
		home.manageSubAdminOpt();
		Thread.sleep(2000);
		ManageSubadmin sub = new ManageSubadmin(driver);
		sub.createSubAdminWithoutName();
	}
	
	@Test(groups = "Smoke",priority = 13)
	public void createSubadminWithoutContactNumber () throws Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		HomePage home = new HomePage(driver);
		home.manageSubAdminOpt();
		Thread.sleep(2000);
		ManageSubadmin sub = new ManageSubadmin(driver);
		sub.createSubAdminWithoutContactNumber();
	}
	
	@Test(groups = "Smoke",priority = 14)
	public void createSubadminWithoutImageFile () throws Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		HomePage home = new HomePage(driver);
		home.manageSubAdminOpt();
		Thread.sleep(2000);
		ManageSubadmin sub = new ManageSubadmin(driver);
		sub.createSubAdminWithoutImageFile();
	}
	
	@Test(groups = "Smoke",priority = 15 )
	public void viewSubadminDetails() throws Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		HomePage home = new HomePage(driver);
		home.manageSubAdminOpt();
		Thread.sleep(2000);
		ManageSubadmin sub = new ManageSubadmin(driver);
		sub.viewAllSubAdmin();
	}

	@Test(dependsOnMethods ="createSubAdminWithValidData", groups = "smoke")
	public void  editSubadminValidData() throws Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		HomePage home = new HomePage(driver);
		home.manageSubAdminOpt();
		Thread.sleep(2000);
		ManageSubadmin sub = new ManageSubadmin(driver);
		sub.editSubAdminwithValidData();
		
	}
	
	@Test(groups = "Smoke",priority =16)
	public void editSubAdminWithoutRole() throws Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		HomePage home = new HomePage(driver);
		home.manageSubAdminOpt();
		Thread.sleep(2000);
		ManageSubadmin sub = new ManageSubadmin(driver);
		sub.editSubAdminWithoutselectingRole();
	}
	
	@Test(groups = "Smoke",priority =17)
	public void editSubAdminWithoutSelectingAccessRight() throws Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		HomePage home = new HomePage(driver);
		home.manageSubAdminOpt();
		Thread.sleep(2000);
		ManageSubadmin sub = new ManageSubadmin(driver);
		sub.editSubAdminWithoutselectingAccessright();
	}
	
	@Test(groups = "Smoke",priority =18)
	public void editSubAdminDetailsWithoutUserName() throws Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		HomePage home = new HomePage(driver);
		home.manageSubAdminOpt();
		Thread.sleep(2000);
		ManageSubadmin sub = new ManageSubadmin(driver);
		sub.editSubAdminWithoutUserName();
	}
	
	@Test(groups = "Smoke",priority =19)
	public void editSubAdminDetailsActivationToggle() throws Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		HomePage home = new HomePage(driver);
		home.manageSubAdminOpt();
		Thread.sleep(2000);
		ManageSubadmin sub = new ManageSubadmin(driver);
		sub.activatointoggle();
	}
	
	@Test(groups = "Smoke",priority =20)
	public void editSubAdminDetailsDeactivationToggle() throws Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		HomePage home = new HomePage(driver);
		home.manageSubAdminOpt();
		Thread.sleep(2000);
		ManageSubadmin sub = new ManageSubadmin(driver);
		sub.deactivatointoggle();
	}

}
