package com.nova.test.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nova.pages.Homepage;
import com.nova.pages.LoginPage;
import com.nova.pages.NewsLetter;
import com.nova.test.base.BaseClass;

public class NewsLetterPageTest extends BaseClass {
	NewsLetter newsLetter;
Homepage homePage;
LoginPage loginPage;
	@BeforeMethod
	public void setup() {
		initialization();
		homePage  = new Homepage(); 
		loginPage = new LoginPage();
		newsLetter=new NewsLetter();
		loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		homePage.qualityMatters();
	}
	@Test
	public void clickOnBackListButtonTest() {
		newsLetter.clickOnBackListButton();	
		assertEquals("Commercial Systems Validation Newsletter", driver.findElement(By.xpath("//label[contains(text(),'Commercial Systems Validation Newsletter')]")).getText());
		}
	
	
	@AfterMethod
	public void release() {
		driver.quit();
	}
	
}
