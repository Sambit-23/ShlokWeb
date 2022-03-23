import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://shlokqa.surebotdev.com/");
		d.manage().window().maximize();
		d.findElement(By.id("Email")).sendKeys("superadmin@gmail.com");
		d.findElement(By.id("Password")).sendKeys("admin@123");
		d.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("(//a[@class='nav-link'])[6]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,2000)");
	//	d.findElement(By.xpath("//h5[.='Principal']//i[@class='fa fa-edit pull-right']")).click();
		
		WebDriverWait wait= new WebDriverWait(d, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//i[@class='fa fa-edit'])[1]")));
		WebElement scroll = d.findElement(By.xpath("(//i[@class='fa fa-edit'])[1]"));
		Thread.sleep(2000);
		
		for (int i=0;i<9;i++)
		{ 
			
			List <WebElement> list =d.findElements(By.xpath("//tbody[@id='list-list1']"));
			System.out.println(list.get(0));
			for (int j =0 ;j<9;j++)
			{
			
			//for (int i =0; i<10;i++)
			//{
			WebElement el =d.findElement(By.xpath("//a[.='Next']"));
			
			System.out.println(list.get(i).getText());
			JavascriptExecutor js1=(JavascriptExecutor)d;
			js1.executeScript("arguments[0].click()", el);
			//el.click();
			}
//			if (list.get(i).get
//			{
//				System.out.println("true");
//			}
				
				
		}
				
	
	    
	//}
}}
