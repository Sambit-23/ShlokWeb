import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://shlokqa.surebotdev.com/");
		d.findElement(By.id("Email")).sendKeys("superadmin@gmail.com");
		d.findElement(By.id("Password")).sendKeys("admin@123");
		d.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("(//a[@class='nav-link'])[5]")).click();
		

	}

}
