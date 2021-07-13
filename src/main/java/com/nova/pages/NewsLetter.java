package com.nova.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nova.test.base.BaseClass;

public class NewsLetter extends BaseClass{
	
	@FindBy(xpath="//span[contains(text(),'List')]")
	WebElement backList;
	
	@FindBy(xpath="//a")
	WebElement Partners;
	
	public NewsLetter() {
		PageFactory.initElements(driver,this); 
	}
	
	public void clickOnBackListButton() {
		backList.click();
	}
	public void clickOnPartnerLink() {
		Partners.click();
	}
	

}
