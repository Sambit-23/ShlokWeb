package com.generics.shlok;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class BasePage extends ExcelLibrary
{
	public void SelectbyVisibleText(WebElement element, String Text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(Text);
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
	public void pageUpScroll(WebDriver driver) throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//for (int i=0;i<2;i++)
			{
				Thread.sleep(2000);
				js.executeScript("window.scrollBy(900,700)");
			}
	}
	public void ScrollLeft(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].scrollIntoView()",element);
	}
	public void clickjsExecutor(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click()",element);
	}
	public void clearTextfield() throws Exception
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
				
	}
}
