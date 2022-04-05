package com.test.shlok;

import org.testng.annotations.Test;
import com.generics.shlok.BaseTest;
import com.pages.shlok.DashBoard;
import com.pages.shlok.LoginPage;

public class TestDashBoard extends BaseTest
{
	@Test(priority = 1)
	public void dashBoardCounts() throws Exception
	{

		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		DashBoard dashboard = new DashBoard(driver);
		dashboard.dashboardCount();
	}
	
	@Test(priority = 2)
	public void recentNotification() throws Exception
	{

		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		DashBoard dashboard = new DashBoard(driver);
		dashboard.recentnotification();
	}
	
	@Test(priority = 3)
	public void upcomingEvents() throws Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		DashBoard dashboard = new DashBoard(driver);
		dashboard.upcomingEvent();
	}
	@Test(priority = 4)
	public void fetchModule() throws Exception
	{

		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		DashBoard dashboard = new DashBoard(driver);
		dashboard.commonModule();
		dashboard.accountModule();
		dashboard.timetableModule();
		dashboard.educationalModule();
		dashboard.newsAndEventModule();
		dashboard.transportationModule();
	}
	
	@Test(priority = 5)
	public void selectBranchAndFetchDashboardDetails() throws Exception
	{
		LoginPage log=new LoginPage(driver);
		log.loginmethod();
		Thread.sleep(2000);
		DashBoard dashboard = new DashBoard(driver);
		dashboard.selectBranch();
		dashboard.dashboardCount();
		dashboard.recentnotification();
		dashboard.upcomingEvent();
		dashboard.commonModule();
		dashboard.accountModule();
		dashboard.timetableModule();
		dashboard.educationalModule();
		dashboard.newsAndEventModule();
		dashboard.transportationModule();
	}

}
