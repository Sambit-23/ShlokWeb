package com.test.shlok;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.generics.shlok.BaseTest;
import com.pages.shlok.Login;

@Listeners(com.generics.shlok.Screenshot.class)
public class LoginNegativeScenario extends BaseTest 
{
	@Test
	public void loginWithNegativeScenario() throws IOException 
	{
		Login log = new Login(driver);
		log.loginmethodNegative1(driver);
		log.loginmethodNegative2(driver);
	}

}
