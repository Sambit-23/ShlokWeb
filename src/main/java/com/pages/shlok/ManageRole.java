package com.pages.shlok;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
	private WebElement manageNewsletterCheckbox;
	
	@FindBy(xpath = "(//input[@value='21'])[1]") //Transport module
	private WebElement manageTransportCheckbox;

	@FindBy(xpath = "(//input[@value='13'])[1]") //Merchandise module 
	private WebElement manageStoreCheckbox;
	
	@FindBy(xpath = "//button[@class='btn btn-success addRole']")
	private WebElement saveButton;
	
	public ManageRole(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Compulsoryfield(WebDriver driver) throws Exception
	{
		SelectbyVisibleText(branchnameDropdown,"Southdale Branch");
		rolenameTextfield.sendKeys(ExcelLibrary.getcellvalue(Sheet_name1, 1, 0));
		manageRoleCheckbox.click();
		manageSubadminCheckbox.click();
		manageClassSectionCheckbox.click();
	}
	public void AccountModule()
	{
		manageFeeCheckbox.click();
		fundraiserCheckbox.click();
	}
	public void TimetableModule()
	{
		manageClassTimetableCheckbox.click();
	}
	public void educationalModule()
	{
		manageBranchCheckbox.click();
		manageStudentCheckbox.click();
		manageSubjectCheckbox.click();
		manageTeacherCheckbox.click();
		manageAttendanceCheckbox.click();
		manageExamCheckbox.click();
		manageProtocolCheckbox.click();
		manageNotificationCheckbox.click();
		digitalLibraryCheckbox.click();
		permissionFormsCheckbox.click();	
	}
	public void NewsandEventModule()
	{
		manageEventCheckbox.click();
		manageGalleryCheckbox.click();
		manageAchievementCheckbox.click();
		manageRepresentativesCheckbox.click();
		manageHolidaysCheckbox.click();
		manageNewsletterCheckbox.click();
	}
	public void TransportModule()
	{
		manageTransportCheckbox.click();
	}
	public void MerchandiseModule() 
	{
		manageStoreCheckbox.click();
	}
	public void saveMethod()
	{
		saveButton.click();
	}
	public void uncheckAll()
	{
		manageRoleCheckbox.click();
		manageSubadminCheckbox.click();
		manageClassSectionCheckbox.click();
		manageFeeCheckbox.click();
		fundraiserCheckbox.click();
		manageBranchCheckbox.click();
		manageStudentCheckbox.click();
		manageSubjectCheckbox.click();
		manageTeacherCheckbox.click();
		manageAttendanceCheckbox.click();
		manageExamCheckbox.click();
		manageProtocolCheckbox.click();
		manageNotificationCheckbox.click();
		digitalLibraryCheckbox.click();
		permissionFormsCheckbox.click();	
	}
}
