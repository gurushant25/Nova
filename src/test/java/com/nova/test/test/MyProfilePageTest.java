package com.nova.test.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nova.pages.EditPage;
import com.nova.pages.Homepage;
import com.nova.pages.LoginPage;
import com.nova.pages.MyProfilePage;
import com.nova.test.base.BaseClass;

public class MyProfilePageTest extends BaseClass{
	Homepage homepage;
	MyProfilePage myprofilepage;
	LoginPage loginpage;
	@BeforeMethod
	public void setup() {
		initialization();
		homepage=new Homepage();
		myprofilepage=new MyProfilePage();
		loginpage=new LoginPage();
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.accountDetails();
	}
	
	@Test
	
	public void basicInformationTextTest() {
		assertEquals("Basic Information",myprofilepage.basicInformationText());
	}
	
	@Test
	public void cancelButtonTest() {
		myprofilepage.cancelButton();
	}
	
	@Test
	public EditPage editButtonTest() {
		myprofilepage.editButton();
		return new EditPage();
	}
	@AfterMethod
	public void release() {
		driver.quit();
	}

}
