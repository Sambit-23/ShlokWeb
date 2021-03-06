package com.generics.shlok;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(com.generics.shlok.Listener.class)
public class BaseTest implements AutoConstant
{
public static WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
	}
	@AfterMethod
	public void Teardown() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.quit();
	}
}
