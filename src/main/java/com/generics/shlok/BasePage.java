package com.generics.shlok;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Reporter;

public class BasePage extends ExcelLibrary
{
	public void SelectbyVisibleText(WebElement element, String Text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(Text);
	}
	
	public void SelectbyVisibleint(WebElement element)
	{
		Select sel = new Select(element);
		sel.getFirstSelectedOption();
	}
	
	public void mousehover(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element);
	}
	public void robotTAB() throws AWTException
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}
	public void robotPASTE() throws AWTException
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);			
	}
	
	public void robotENTER() throws AWTException
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void robotArrowDown(WebDriver driver,int number) throws AWTException
	{
		for (int i = 0; i<number ; i++)
		{
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
	}
	public void fileUpload(String path) throws IOException
	{
		StringSelection file = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file,null);
	}
	public void alertOK(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void fetchTitle(WebDriver driver)
	{
		Reporter.log(driver.getTitle());

	}
	public void doubleclick(WebDriver driver, WebElement element)
	{
		Actions ac = new Actions(driver);
		ac.doubleClick(element).perform();
	}
	public void pageUpScroll(WebDriver driver,int times) throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		for (int i=0;i<times;i++)
			{
				Thread.sleep(2000);
				js.executeScript("window.scrollBy(500,500)");
			}
	}
	public void ScrollToView(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].scrollIntoView()",element);
	}
	public void clickjsExecutor(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click()",element);
	}
	public void clearMethod(WebElement element)
	{
		element.clear();
	}
	public void waitforElement(WebDriver driver, String text)
	{
		Wait<WebDriver> wait = new FluentWait <> (driver)	
				.withTimeout(Duration.ofSeconds(20L))
				.pollingEvery(Duration.ofSeconds(2L))
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.titleIs(text));
	}
	public void waitforListofWebElement(WebDriver driver, List<WebElement> element)
	{
		Wait<WebDriver> wait = new FluentWait <> (driver)	
				.withTimeout(Duration.ofSeconds(20L))
				.pollingEvery(Duration.ofSeconds(2L))
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}
}























