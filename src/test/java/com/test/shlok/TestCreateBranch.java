package com.test.shlok;

import org.testng.annotations.Test;
import com.generics.shlok.BaseTest;
import com.pages.shlok.CreatBranch;
import com.pages.shlok.HomePage;
import com.pages.shlok.LoginPage;

public class TestCreateBranch extends BaseTest
{
	@Test
	public void creatbranch() throws Exception
	{
		LoginPage log = new LoginPage(driver);
		log.loginmethod();
		
		HomePage home = new HomePage(driver);
		home.creatBranchOpt();
		
		CreatBranch branch = new CreatBranch(driver);
		branch.addBranchMethod();
	}

}
