package com.pages.shlok;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.generics.shlok.AutoConstant;
import com.generics.shlok.BasePage;
import com.generics.shlok.ExcelLibrary;

public class ManageSubadmin extends BasePage implements AutoConstant
{
	
	
	@FindBy(id="Branch_IDe")
	private WebElement branchNameDropdown;
	
	@FindBy(xpath ="//select[@id='Main_Role_ID']")
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
	
	@FindBy(xpath="(//input[@name='image'])[1]")
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
	
	public void createSubAdminandCheck() throws Exception
	{
	
		SelectbyVisibleText(branchNameDropdown,ExcelLibrary.getcellvalue(BranchName, 3, 0));
		SelectbyVisibleText(selectAccessRightDropdown, ExcelLibrary.getcellvalue(AccessRights, 1, 0));
		SelectbyVisibleText(selectRoleDropdown, ExcelLibrary.getcellvalue(ManageRole, 1, 0));
		contactEmailTextfield.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 6, 2));
		nameTextfield.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 1, 1));
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 1, 4));
		contactNumberTextfield.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 6, 3));
		chooseImageFileLink.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 1, 5));
		createButton.click();
		Thread.sleep(1000);
		searchTextfield.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 6, 2));
		String search =searchTextfield.getText();
		
		WebElement list =driver.findElement(By.xpath("(//tbody[@id='list-list1']//td)[4]"));
		String result =list.getText();
		
		SoftAssert asst = new SoftAssert();
		asst.assertEquals(search, result);
		asst.assertAll();
	  }
	
	public void createSubAdminWithInvalidEmail() throws Exception
	{
	
		SelectbyVisibleText(branchNameDropdown,ExcelLibrary.getcellvalue(BranchName, 3, 0));
		SelectbyVisibleText(selectAccessRightDropdown, ExcelLibrary.getcellvalue(AccessRights, 1, 0));
		SelectbyVisibleText(selectRoleDropdown, ExcelLibrary.getcellvalue(ManageRole, 1, 0));
		contactEmailTextfield.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 9, 2));
		nameTextfield.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 1, 1));
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 1, 4));
		contactNumberTextfield.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 6, 3));
		chooseImageFileLink.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 1, 5));
		createButton.click();
		Thread.sleep(1000);
		searchTextfield.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 9, 2));
		String search =searchTextfield.getText();
		WebElement list =driver.findElement(By.xpath("(//tbody[@id='list-list1']//td)[4]"));
		String result =list.getText();
		System.out.println(result);
		SoftAssert asst = new SoftAssert();
		asst.assertEquals(search, result);
		asst.assertAll();
	  }
	public void createSubAdminWithInvalidContactNo() throws Exception
	{
	
		SelectbyVisibleText(branchNameDropdown,ExcelLibrary.getcellvalue(BranchName, 3, 0));
		SelectbyVisibleText(selectAccessRightDropdown, ExcelLibrary.getcellvalue(AccessRights, 1, 0));
		SelectbyVisibleText(selectRoleDropdown, ExcelLibrary.getcellvalue(ManageRole, 1, 0));
		contactEmailTextfield.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 6, 2));
		nameTextfield.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 1, 1));
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 1, 4));
		contactNumberTextfield.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 9, 3));
		chooseImageFileLink.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 1, 5));
		createButton.click();
		Thread.sleep(1000);
		searchTextfield.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 6, 2));
		String search =searchTextfield.getText();
		WebElement list = driver.findElement(By.xpath("(//tbody[@id='list-list1']//td)[4]"));
		String result =list.getText();
		
		SoftAssert asst = new SoftAssert();
		asst.assertEquals(search, result);
		asst.assertAll();
	  }
	public void createSubAdminWithInvalidPass() throws Exception
	{
	
		SelectbyVisibleText(branchNameDropdown,ExcelLibrary.getcellvalue(BranchName, 3, 0));
		SelectbyVisibleText(selectAccessRightDropdown, ExcelLibrary.getcellvalue(AccessRights, 1, 0));
		SelectbyVisibleText(selectRoleDropdown, ExcelLibrary.getcellvalue(ManageRole, 1, 0));
		contactEmailTextfield.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 4, 2));
		nameTextfield.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 1, 1));
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 9, 4));
		contactNumberTextfield.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 4, 3));
		chooseImageFileLink.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 1, 5));
		createButton.click();
		Thread.sleep(1000);
		searchTextfield.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 4, 2));
		String search =searchTextfield.getText();
		WebElement list = driver.findElement(By.xpath("(//tbody[@id='list-list1']//td)[4]"));
		String result =list.getText();
		
		SoftAssert asst = new SoftAssert();
		asst.assertEquals(search, result);
		asst.assertAll();
	  }
	public void createSubAdminWithInvalidImageFormat() throws Exception
	{
	
		SelectbyVisibleText(branchNameDropdown,ExcelLibrary.getcellvalue(BranchName, 3, 0));
		SelectbyVisibleText(selectAccessRightDropdown, ExcelLibrary.getcellvalue(AccessRights, 1, 0));
		SelectbyVisibleText(selectRoleDropdown, ExcelLibrary.getcellvalue(ManageRole, 1, 0));
		contactEmailTextfield.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 3, 2));
		nameTextfield.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 1, 1));
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 9, 4));
		contactNumberTextfield.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 4, 3));
		chooseImageFileLink.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 1, 5));
		createButton.click();
		Thread.sleep(1000);
		searchTextfield.sendKeys(ExcelLibrary.getcellvalue(SubAdminDetails, 3, 2));
		String search =searchTextfield.getText();
		WebElement list = driver.findElement(By.xpath("(//tbody[@id='list-list1']//td)[4]"));
		String result =list.getText();
		
		SoftAssert asst = new SoftAssert();
		asst.assertEquals(search, result);
		asst.assertAll();
	}

}
