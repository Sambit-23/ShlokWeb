package com.pages.shlok;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.generics.shlok.AutoConstant;
import com.generics.shlok.BasePage;
import com.generics.shlok.ExcelLibrary;

public class ManageRole extends BasePage implements AutoConstant
{
	@FindBy(xpath="//select[@name='branch']")
	private WebElement branchnameDropdown;
	
	@FindBy(xpath ="//input[@placeholder='Enter Role Name']")
	private WebElement rolenameTextfield;
	
	@FindBy(xpath = "(//input[@value='1'])[2]")
	private WebElement manageRoleCheckbox;
	
	@FindBy(xpath = "(//input[@value='2'][1])")
	private WebElement manageSubadminCheckbox;
	
	@FindBy(xpath = "(//input[@value='5'])[1]")
	private WebElement manageClassSectionCheckbox;
	
	@FindBy(xpath = "(//input[@value='11'])[1]") //account module
	private WebElement manageFeeCheckbox;
	
	@FindBy(xpath = "(//input[@value='12'])[1]") //account module
	private WebElement fundraiserCheckbox;
	
	@FindBy(xpath = "(//input[@value='20'])[1]") //timetable module
	private WebElement manageClassTimetableCheckbox;
	
	@FindBy(xpath = "(//input[@value='3'])[1]") //educational module
	private WebElement manageBranchCheckbox;
	
	@FindBy(xpath = "(//input[@value='4'])[1]") //educational module
	private WebElement manageStudentCheckbox;
	
	@FindBy(xpath = "(//input[@value='6'])[1]") //educational module
	private WebElement manageSubjectCheckbox;
	
	@FindBy(xpath = "(//input[@value='7'])[1]") //educational module
	private WebElement manageTeacherCheckbox;
	
	@FindBy(xpath = "(//input[@value='8'])[1]") //educational module
	private WebElement manageAttendanceCheckbox;
	
	@FindBy(xpath = "(//input[@value='9'])[1]") //educational module
	private WebElement manageExamCheckbox;
	
	@FindBy(xpath = "(//input[@value='10'])[1]") //educational module
	private WebElement manageProtocolCheckbox;
	
	@FindBy(xpath = "(//input[@value='22'])[1]") //educational module
	private WebElement manageNotificationCheckbox;
	
	@FindBy(xpath = "(//input[@value='23'])[1]") //educational module
	private WebElement digitalLibraryCheckbox;
	
	@FindBy(xpath = "(//input[@value='24'])[1]") //educational module
	private WebElement permissionFormsCheckbox;
	
	@FindBy(xpath = "(//input[@value='14'])[1]") //News & Event module
	private WebElement manageEventCheckbox;
	
	@FindBy(xpath = "(//input[@value='15'])[1]") //News & Event module
	private WebElement manageGalleryCheckbox;
	
	@FindBy(xpath = "(//input[@value='16'])[1]") //News & Event module
	private WebElement manageAchievementCheckbox;
	
	@FindBy(xpath = "(//input[@value='17'])[1]") //News & Event module
	private WebElement manageRepresentativesCheckbox;
	
	@FindBy(xpath = "(//input[@value='18'])[1]") //News & Event module
	private WebElement manageHolidaysCheckbox;
	
	@FindBy(xpath = "(//input[@value='19'])[1]") //News & Event module
	protected WebElement manageNewsletterCheckbox;
	
	@FindBy(xpath = "(//input[@value='21'])[1]") //Transport module
	private WebElement manageTransportCheckbox;

	@FindBy(xpath = "(//input[@value='13'])[1]") //Merchandise module 
	private WebElement manageStoreCheckbox;
	
	@FindBy(xpath = "//button[@class='btn btn-success addRole']")
	private WebElement addButton;

	@FindBy(xpath ="//i[@class='fa fa-edit pull-right']") //view role
	private WebElement editButton;
	
	@FindBy(xpath = "//input[@id='RoleName']")
	private WebElement editRoleNameTextfield;
	
	@FindBy(xpath = "(//input[@value='1'])[3]")
	private WebElement editManageRoleCheckbox;
	
	@FindBy(xpath = "(//input[@value='2'])[2]")
	private WebElement editManageSubAdminCheckbox;
	
	@FindBy(xpath = "(//input[@value='5'])[2]")
	private WebElement editManageClassSectionCheckbox;
	
	@FindBy(xpath = "(//input[@value='11'])[2]")  // accounts module
	private WebElement editManageFeeCheckbox;
	
	@FindBy(xpath = "(//input[@value='12'])[2]")  // accounts module
	private WebElement editFundraiserCheckbox;
	
	@FindBy(xpath = "(//input[@value='20'])[2]")  // Timetable module
	private WebElement editManageClassTimeTableCheckbox;
	
	@FindBy(xpath = "(//input[@value='3'])[2]")  // educational module
	private WebElement editManageBranchCheckbox;
	
	@FindBy(xpath = "(//input[@value='4'])[2]")  // educational module
	private WebElement editManageStudentCheckbox;
	
	@FindBy(xpath = "(//input[@value='5'])[2]")  // educational module
	private WebElement editManageSubjectCheckbox;
	
	@FindBy(xpath = "(//input[@value='7'])[2]")  // educational module
	private WebElement editManageTeacherCheckbox;
	
	@FindBy(xpath = "(//input[@value='8'])[2]")  // educational module
	private WebElement editManageAttendanceCheckbox;
	
	@FindBy(xpath = "(//input[@value='9'])[2]")  // educational module
	private WebElement editManageExamCheckbox;
	
	@FindBy(xpath = "(//input[@value='10'])[2]")  // educational module
	private WebElement editManageProtocolCheckbox;
	
	@FindBy(xpath = "(//input[@value='22'])[2]")  // educational module
	private WebElement editManageNotificationCheckbox;
	
	@FindBy(xpath = "(//input[@value='23'])[2]")  // educational module
	private WebElement editDigitalLibraryCheckbox;
	
	@FindBy(xpath = "(//input[@value='24'])[2]")  // educational module
	private WebElement editPermissionFormsCheckbox;
	
	@FindBy(xpath = "(//input[@value='14'])[2]")  // News & Event module module
	private WebElement editManageEventCheckbox;
	
	@FindBy(xpath = "(//input[@value='15'])[2]")  // News & Event module module
	private WebElement editManageGalleryCheckbox;
	
	@FindBy(xpath = "(//input[@value='16'])[2]")  // News & Event module module
	private WebElement editManageAchievementCheckbox;
	
	@FindBy(xpath = "(//input[@value='17'])[2]")  // News & Event module module
	private WebElement editManageRepresentativeCheckbox;
	
	@FindBy(xpath = "(//input[@value='18'])[2]")  // News & Event module module
	private WebElement editManageHolidayCheckbox;
	
	@FindBy(xpath = "(//input[@value='19'])[2]")  // News & Event module module
	private WebElement editManageNewsletterCheckbox;
	
	@FindBy(xpath = "(//input[@value='21'])[2]") //Transport module
	private WebElement editManageTransportCheckbox;

	@FindBy(xpath = "(//input[@value='13'])[2]") //Merchandise module 
	private WebElement editManageStoreCheckbox;
	
	@FindBy(xpath = "//button[.='Save Changes']")
	private WebElement saveChangeButton;
	
	@FindBy(xpath = "(//i[@class='fa fa-trash  pull-right'])") //view role
	private WebElement DeleteButton;
	
	public ManageRole(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void creatRoleWithValidData() throws Exception
	{
		SelectbyVisibleText(branchnameDropdown, ExcelLibrary.getcellvalue(BranchName, 2, 0));
		rolenameTextfield.sendKeys(ExcelLibrary.getcellvalue(ManageRole, 2, 0));
		manageRoleCheckbox.click();
		manageSubadminCheckbox.click();
		manageFeeCheckbox.click();
		fundraiserCheckbox.click();
		manageClassTimetableCheckbox.click();
		manageBranchCheckbox.click();
		manageStudentCheckbox.click();
		manageClassSectionCheckbox.click();
		manageSubjectCheckbox.click();
		manageTeacherCheckbox.click();
		manageAttendanceCheckbox.click();
		manageExamCheckbox.click();
		manageProtocolCheckbox.click();
		manageNotificationCheckbox.click();
		digitalLibraryCheckbox.click();
		permissionFormsCheckbox.click();
		manageEventCheckbox.click();
		manageGalleryCheckbox.click();
		manageAchievementCheckbox.click();
		manageRepresentativesCheckbox.click();
		manageHolidaysCheckbox.click();
		manageNewsletterCheckbox.click();
		manageTransportCheckbox.click();
		manageStoreCheckbox.click();
		addButton.click();
		
		Thread.sleep(1000);
		SoftAssert asset = new SoftAssert();
		WebElement el = driver.findElement(By.xpath("//h5[@class='card-header']")); //***
		String details = el.getText();
		Reporter.log(details);
		if (details.contains(ExcelLibrary.getcellvalue(ManageRole, 2, 0)))
		{
		}
		else 
		{
			asset.fail("Test case fail");
			asset.assertAll();
		}
	}
	
	public void editRoleWithoutSelectingModule() throws Exception
	{
		String tempName = "Ram";
		branchnameDropdown.sendKeys(ExcelLibrary.getcellvalue(BranchName, 2, 0));
		rolenameTextfield.sendKeys(tempName);
		manageRoleCheckbox.click();
		manageSubadminCheckbox.click();
		addButton.click();
		Thread.sleep(1000);
		
		branchnameDropdown.sendKeys(ExcelLibrary.getcellvalue(BranchName, 2, 0));
		Thread.sleep(1000);
		List <WebElement> role =driver.findElements(By.xpath("//h5[@class='card-header']"));
		waitforListofWebElement(driver, role);
		String xpath = "";
		for (int i =1; i< role.size();i++)
		{
			String rol = role.get(i).getText();
			
			if(role.get(i).getText().equalsIgnoreCase(tempName));
			{
				xpath = "(//i[@class='fa fa-edit pull-right'])" + "["+ i +"]";
				break ;
			}
		}
		driver.findElement(By.xpath(xpath)).click();
		
		editRoleNameTextfield.clear();
		editRoleNameTextfield.sendKeys(ExcelLibrary.getcellvalue(ManageRole, 4, 0));
		editManageRoleCheckbox.click();
		editManageSubAdminCheckbox.click();
		
		WebElement text = driver.findElement(By.xpath("//button[@type='button']"));
		String Actualtext = text.getText();
		String Expexted = driver.getTitle();
		
		saveChangeButton.click();
		
		SoftAssert as = new SoftAssert();
		as.assertEquals(Actualtext, Expexted);
		as.assertAll();
	}
	
	public void createRoleWithoutAnyModule() throws IOException, Exception
	{
		SelectbyVisibleText(branchnameDropdown, ExcelLibrary.getcellvalue(BranchName, 3, 0));
		rolenameTextfield.sendKeys(ExcelLibrary.getcellvalue(ManageRole, 2, 0));
		addButton.click();
		
		Thread.sleep(1000);
		SoftAssert asset = new SoftAssert();
		WebElement el = driver.findElement(By.xpath("//h5[@class='card-header']")); //***
		String details = el.getText();
		Reporter.log(details);
		if (details.contains(ExcelLibrary.getcellvalue(ManageRole, 2, 0)))
		{
		}
		else 
		{
			asset.fail("Test case fail");
			asset.assertAll();
		}
	}
	public void createRoleWithoutSelectingBranch() throws IOException, Exception
	{
		List<WebElement> act = driver.findElements(By.xpath("//h5[@class='card-header']")); //***
		int Actual = act.size();
		System.out.println(Actual);
		
		rolenameTextfield.sendKeys(ExcelLibrary.getcellvalue(ManageRole, 2, 0));
		manageRoleCheckbox.click();
		manageSubadminCheckbox.click();
		manageFeeCheckbox.click();
		fundraiserCheckbox.click();
		manageClassTimetableCheckbox.click();
		manageBranchCheckbox.click();
		manageStudentCheckbox.click();
		addButton.click();
		List<WebElement> exp = driver.findElements(By.xpath("//h5[@class='card-header']")); //***
		int Expected = exp.size();
		System.out.println(Expected);
		
		SoftAssert as = new SoftAssert();
		as.assertNotEquals(Actual, Expected);
		Reporter.log("Role is Not Added");
		as.assertAll();
	}
	public void createRoleWithoutSelectingRole() throws IOException, Exception
	{
		SelectbyVisibleText(branchnameDropdown, ExcelLibrary.getcellvalue(BranchName, 3, 0));
		Thread.sleep(1000);
		
		List<WebElement> act = driver.findElements(By.xpath("//h5[@class='card-header']")); //***
		int Actual = act.size();
		System.out.println(Actual);
		
		manageRoleCheckbox.click();
		manageSubadminCheckbox.click();
		manageFeeCheckbox.click();
		fundraiserCheckbox.click();
		manageClassTimetableCheckbox.click();
		manageBranchCheckbox.click();
		manageStudentCheckbox.click();
		addButton.click();
		
		List<WebElement> exp = driver.findElements(By.xpath("//h5[@class='card-header']")); //***
		int Expected = exp.size();
		System.out.println(Expected);
		
		SoftAssert as = new SoftAssert();
		as.assertNotEquals(Actual, Expected);
		Reporter.log("Role is Not Added");
		as.assertAll();
	}
	public void editRoleWithValidData() throws Exception
	{
		branchnameDropdown.sendKeys(ExcelLibrary.getcellvalue(BranchName, 2, 0));
		Thread.sleep(1000);
		List <WebElement> role =driver.findElements(By.xpath("//h5[@class='card-header']"));
		waitforListofWebElement(driver, role);
		String xpath = "";
		for (int i =1; i< role.size();i++)
		{
			String rol = role.get(i).getText();
			
			if(role.get(i).getText().equalsIgnoreCase("principal"));
			{
				xpath = "(//i[@class='fa fa-edit pull-right'])" + "["+ i +"]";
				break ;
			}
		}
		driver.findElement(By.xpath(xpath)).click();
		
		editRoleNameTextfield.clear();
		editRoleNameTextfield.sendKeys(ExcelLibrary.getcellvalue(ManageRole, 3, 0));
		editManageRoleCheckbox.click();
		editManageSubAdminCheckbox.click();
		editManageFeeCheckbox.click();
		editFundraiserCheckbox.click();
		editManageClassTimeTableCheckbox.click();
		editManageBranchCheckbox.click();
		editManageStudentCheckbox.click();
		editManageClassSectionCheckbox.click();
		editManageSubjectCheckbox.click();
		editManageTeacherCheckbox.click();
		editManageAttendanceCheckbox.click();
		editManageExamCheckbox.click();
		editManageProtocolCheckbox.click();
		editManageNotificationCheckbox.click();
		editDigitalLibraryCheckbox.click();
		editPermissionFormsCheckbox.click();
		editManageEventCheckbox.click();
		editManageGalleryCheckbox.click();
		editManageAchievementCheckbox.click();
		editManageRepresentativeCheckbox.click();
		editManageHolidayCheckbox.click();
		editManageNewsletterCheckbox.click();
		editManageTransportCheckbox.click();
		editManageStoreCheckbox.click();
		
		WebElement text = driver.findElement(By.xpath("//button[@type='button']"));
		String Actualtext = text.getText();
		
		saveChangeButton.click();
		Thread.sleep(1000);
		String Expexted = driver.getTitle();
		
		SoftAssert as = new SoftAssert();
		as.assertNotEquals(Actualtext, Expexted);
		as.assertAll();
	}
	
	public void editRoleWithoutRoleName() throws Exception
	{
		branchnameDropdown.sendKeys(ExcelLibrary.getcellvalue(BranchName, 2, 0));
		Thread.sleep(1000);
		List <WebElement> role = driver.findElements(By.xpath("//h5[@class='card-header']"));
		waitforListofWebElement(driver, role);
		String xpath = "";
		for (int i = 1; i< role.size();i++)
		{
			String rol = role.get(i).getText();
			if(role.get(i).getText().equalsIgnoreCase("principal"));
			{
				xpath = "(//i[@class='fa fa-edit pull-right'])" + "["+ i +"]";
				break ;
			}
		}
		driver.findElement(By.xpath(xpath)).click();
		
		editRoleNameTextfield.clear();
		editManageRoleCheckbox.click();
		editManageSubAdminCheckbox.click();
		editManageFeeCheckbox.click();
		editFundraiserCheckbox.click();
		editManageClassTimeTableCheckbox.click();
		editManageBranchCheckbox.click();
		editManageStudentCheckbox.click();
		editManageClassSectionCheckbox.click();
		editManageSubjectCheckbox.click();
		editManageTeacherCheckbox.click();
		editManageAttendanceCheckbox.click();
		editManageExamCheckbox.click();
		editManageProtocolCheckbox.click();
		editManageNotificationCheckbox.click();
		editDigitalLibraryCheckbox.click();
		editPermissionFormsCheckbox.click();
		editManageEventCheckbox.click();
		editManageGalleryCheckbox.click();
		editManageAchievementCheckbox.click();
		editManageRepresentativeCheckbox.click();
		editManageHolidayCheckbox.click();
		editManageNewsletterCheckbox.click();
		editManageTransportCheckbox.click();
		editManageStoreCheckbox.click();
		
		WebElement text = driver.findElement(By.xpath("//button[@type='button']"));
		String Actualtext = text.getText();
		String Expexted = driver.getTitle();
		
		saveChangeButton.click();
		
		SoftAssert as = new SoftAssert();
		as.assertEquals(Actualtext, Expexted);
		as.assertAll();
	}
	
	public void deleteRole() throws Exception
	{
		String tempName = "Ram";
		
		branchnameDropdown.sendKeys(ExcelLibrary.getcellvalue(BranchName, 2, 0));
		Thread.sleep(1000);
		List <WebElement> role =driver.findElements(By.xpath("//h5[@class='card-header']"));
		int actual = role.size();
		waitforListofWebElement(driver, role);
		String xpath = "";
		for (int i =1; i< role.size();i++)
		{
			String rol = role.get(i).getText();
			
			if(role.get(i).getText().equalsIgnoreCase(tempName));
			{
				xpath = "(//i[@class='fa fa-trash  pull-right'])" + "["+ i +"]";
				break ;
			}
		}
		driver.findElement(By.xpath(xpath)).click();
		alertOK(driver);
		
		Thread.sleep(1000);
		
		List <WebElement> role2 =driver.findElements(By.xpath("//h5[@class='card-header']"));
		int expected = role2.size();
		
		SoftAssert as = new SoftAssert();
		as.assertNotEquals(actual, expected);
		as.assertAll();	
	}
}
