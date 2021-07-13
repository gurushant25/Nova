package com.nova.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nova.test.base.BaseClass;

public class MyProfilePage extends BaseClass {

	@FindBy(xpath ="//h3[contains(text(),'Basic Information')]")
	WebElement basicInformation;
	
	@FindBy(xpath="//div[@title='Cancel']")
	WebElement cancelButton;
	
	@FindBy(xpath="//div[@title='Edit']")
	WebElement editButton;
	
	public MyProfilePage() {
		PageFactory.initElements(driver, this); 
	}

	public String basicInformationText() {
		return basicInformation.getText();
	}
	public void cancelButton() {
		cancelButton.click();
	}
	
	public void editButton() {
		editButton.click();
	}
}
