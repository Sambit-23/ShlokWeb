package com.pages.shlok;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.shlok.AutoConstant;
import com.generics.shlok.ExcelLibrary;

public class CreatBranch implements AutoConstant
{
	@FindBy(id="Branch_Name")
	private WebElement branchNameTextfield;
	
	@FindBy(id="Short_Code")
	private WebElement branchNameShortCodeTextfield;
	
	@FindBy(xpath="//button[@class='btn btn-success btn-add-Notice']")
	private WebElement addBranchButton;
	
	@FindBy(xpath="//h4[.='Global International School - GIS ']/..//i[@class='fa fa-edit']")
	private WebElement editBranchTextfield;
	
	@FindBy(id="Branch_Short_Code1")
	private WebElement editbranchNameShortCodeTextfield;
	
	@FindBy(xpath="//button[.=' Save ']")
	private WebElement saveButton;
	
	public CreatBranch(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addBranchMethod() throws Exception											// NEED TO UPDATE WITH SPLIT BY METHOD.
	{
		branchNameTextfield.sendKeys(ExcelLibrary.getcellvalue(BranchName, 3, 0));
		branchNameShortCodeTextfield.sendKeys(ExcelLibrary.getcellvalue(BranchName, 3, 1));
		addBranchButton.click();
	}
	public void editBranchMethod() throws Exception
	{
		editBranchTextfield.sendKeys(ExcelLibrary.getcellvalue(BranchName, 2, 0));
		editbranchNameShortCodeTextfield.sendKeys(ExcelLibrary.getcellvalue(BranchName, 2, 1));
		saveButton.click();
	}
	
	
}
