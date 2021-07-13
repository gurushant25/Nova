package com.nova.test.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nova.pages.Homepage;
import com.nova.pages.LoginPage;
import com.nova.test.base.BaseClass;

public class LoginPageTest extends BaseClass {
	LoginPage loginPage;
	Homepage homepage;
	

	public LoginPageTest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage=new LoginPage(); 
	}
	@Test
	public void verifyTitleTest() {
		assertEquals(loginPage.verifyTitle(), "Nova");
	}
	@Test
	public Homepage performLogin() {
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		return new Homepage();

	}
	@AfterMethod
	public void release() {
		driver.quit();
	}
	
}