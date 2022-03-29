
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) throws Exception 
	{
		//String email = "mperry2323@mail.com";
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://shlokqa.surebotdev.com/");
		d.manage().window().maximize();
		d.findElement(By.id("Email")).sendKeys("superadmin@gmail.com");
		d.findElement(By.id("Password")).sendKeys("admin@123");
		d.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);

		d.findElement(By.xpath("(//a[@class='nav-link'])[6]")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)d;
		//WebElement ele=d.findElement(By.xpath("//div[@class=' table-responsive']"));
		js.executeScript("window.scrollBy(0,800)");
		js.executeScript("document.querySelector(scroll).scrollLeft=1000");
		Thread.sleep(1000);
//		Thread.sleep(1000);
//		JavascriptExecutor js1 = (JavascriptExecutor)d;
//		js1.executeScript("window.scrollBy(2000,0)");
		WebElement element = d.findElement(By.xpath("//td[.='mperry2323@mail.com']/..//span[@class='onoffswitch-inner']"));
		
		element.click();
//		WebElement br=d.findElement(By.xpath("(//input[@name='image'])[1]"));
//		br.sendKeys("D:\\Shlok Docs\\Teacher Details\\Teacher\\MzE5NzYuanBn.jpg");
//	
//		WebDriverWait wait= new WebDriverWait(d, 15);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//i[@class='fa fa-edit'])[1]")));
//		WebElement scroll = d.findElement(By.xpath("(//i[@class='fa fa-edit'])[1]"));
//		Thread.sleep(3000);
//		
//		JavascriptExecutor js = (JavascriptExecutor)d;
//		js.executeScript("window.scrollBy(0,2000)");
//		
//		List <WebElement> list =d.findElements(By.xpath("//tbody[@id='list-list1']"));
//		System.out.println(list.size());
//		//for ()
//		String name = list.get(0).getText();
//		System.out.println(name);
//		WebElement el =d.findElement(By.xpath("//a[.='Next']"));
//		for (int j=0; j<10; j++)
//		{
//			for (int i=0; j>=i; i++)
//			{
//				System.out.println(list.get(j).getText());
//				el.click();
//			}
//		}
}
}