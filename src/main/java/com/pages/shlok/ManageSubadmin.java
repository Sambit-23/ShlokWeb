package com.pages.shlok;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.shlok.AutoConstant;
import com.generics.shlok.BasePage;
import com.generics.shlok.ExcelLibrary;

public class ManageSubadmin extends BasePage implements AutoConstant
{
	@FindBy(xpath="(//a[@class='nav-link'])[6]")
	private WebElement manageSubadminLink;
	
	@FindBy(id="Branch_IDe")
	private WebElement branchNameDropdown;
	
	@FindBy(id="Main_Role_ID")
	private WebElement selectAccessRightDropdown;
	
	@FindBy(id="Role_ID")
	private WebElement selectRoleDropdown;
	
	@FindBy(id="Contact_Email")
	private WebElement contactEmailTextfield;
	
	@FindBy(id="User_Contact_Name")
	private WebElement nameTextfield;
	
	@FindBy(id="Password")
	private WebElement passwordTextfield;
	
	@FindBy(id="Contact_Phone")
	private WebElement contactNumberTextfield;
	
	@FindBy(id="uploadStudentImage")
	private WebElement chooseImageFileLink;
	
	@FindBy(xpath = "//button[@class='btn btn-success btn-add-admin']")
	private WebElement createButton;
	
	@FindBy(xpath="//input[@class='form-control form-control-sm']")
	private WebElement searchTextfield;
	
	@FindBy(xpath="//td[.='event@gmail.com']/..//span[@class='onoffswitch-inner']")
	private WebElement activationToggleButton;
	
	@FindBy(xpath="//td[.='event@gmail.com']/..//i[@class='fa fa-edit']")
	private WebElement editButton;
	
	@FindBy(id="Branch_IDs")
	private WebElement editBranchNameDropdown;
	
	@FindBy(id = "Main_editRole_ID")
	private WebElement editSelectAccessRightDropdown;
	
	@FindBy(id = "editRole_ID")
	private WebElement editSelectRoleDropdown;
	
	@FindBy(id = "Contact_Email1")
	private WebElement editContactEmailTextfield;
	
	@FindBy(id = "User_Contact_Name1")
	private WebElement editUserNameTextfield;
	
	@FindBy(id = "Contact_Phone1")
	private WebElement editContactNumberTextfield;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement updateButton;
	
	@FindBy(xpath = "//button[@id='closemodal']")
	private WebElement closeEditSubadminButton;

	public ManageSubadmin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createSubAdmin() throws Exception
	{
		manageSubadminLink.click();
		SelectbyVisibleText(branchNameDropdown,ExcelLibrary.getcellvalue(BranchName, 1, 0));
		SelectbyVisibleText(selectAccessRightDropdown, ExcelLibrary.getcellvalue(AccessRights, 1, 0));
		SelectbyVisibleText(selectRoleDropdown, ExcelLibrary.getcellvalue(ManageRole, 1, 1));
		contactEmailTextfield.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 1, 2));
		nameTextfield.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 1, 1));
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 1, 4));
		contactNumberTextfield.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 1, 3));
		String ImagePath = ExcelLibrary.getcellvalue(SubAdminDetails, 1, 5);
		fileUpload(ImagePath);
		createButton.click();
	  }
	
//	public String checkAddedName() throws IOException
	//{
	//	String email =searchTextfield.getAttribute(ExcelLibrary.getcellvalue(SubAdminDetails, 1, 2));
		//if (email.equals(email))
		
	//}
	
}
