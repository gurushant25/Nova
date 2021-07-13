package com.nova.pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nova.test.base.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(xpath="//input[@type='text']")
	WebElement usernamefield;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement passwordfield;
	
	@FindBy(xpath="//button[@type='button']")
	WebElement loginbtn;
	
	@FindBy(xpath="//*[text()='Nova']")
	WebElement title;
	
	public LoginPage() {
		PageFactory.initElements(driver, this); 
	}
	
	public String verifyTitle() {
		return driver.getTitle();
	}
	
	
	public Homepage login(String uname,String pwd) {
		usernamefield.sendKeys(uname);
		passwordfield.sendKeys(pwd);
		loginbtn.click();
		return new Homepage();
	}
}
