package com.nova.test.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nova.pages.EditPage;
import com.nova.pages.Homepage;
import com.nova.pages.LoginPage;
import com.nova.test.base.BaseClass;

public class EditInfoTest extends BaseClass{
	Homepage homepage;
	LoginPage loginPage;
	EditPage editPage;
	@BeforeMethod
	public void setup() {
		initialization();
		homepage=new Homepage();
		loginPage=new LoginPage();
		editPage=new EditPage();
		loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.accountDetails();
	}
	
	@Test
	public void EnterDetailsTest() throws IOException
	{
		
		editPage.EnterDetails();
	}
	
	@AfterMethod
	public void release() {
		driver.quit();
	}
	
}
