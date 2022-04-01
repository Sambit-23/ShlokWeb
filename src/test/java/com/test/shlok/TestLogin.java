package com.test.shlok;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.generics.shlok.BaseTest;
import com.pages.shlok.LoginPage;

@Listeners(com.generics.shlok.Listener.class)
public class LoginNegativeScenario extends BaseTest 
{
	@Test
	public void loginWithNegativeScenario() throws IOException, Exception 
	{
		LoginPage log = new LoginPage(driver);
		log.loginmethodNegative1(driver);
		Thread.sleep(1000);
		log.clearTextfield();
		log.loginmethodNegative2(driver);
	}

}
