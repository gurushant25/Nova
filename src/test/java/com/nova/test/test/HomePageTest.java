package com.nova.test.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nova.pages.LoginPage;
import com.nova.pages.Homepage;
import com.nova.test.base.BaseClass;

public class HomePageTest extends BaseClass {
	Homepage homepage;
	LoginPage loginPage;

	@BeforeMethod
	public void setup() {
		initialization();
		homepage = new Homepage();
		loginPage = new LoginPage();
		homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@AfterMethod
	public void release() {
		driver.close();
	}

	@Test
	public void expandLeftCornerTest() throws InterruptedException {
		homepage.expandLeftCorner();
		Thread.sleep(3000);
	}

	@Test
	public void clickOnNews_buttonTest() throws InterruptedException {
		homepage.clickOnNews_button();
		Thread.sleep(3000);
	}

	@Test
	public void qualityMattersTest() {
		homepage.qualityMatters();
	}

	@Test
	public void taskExecuteButtonTest() {
		homepage.taskExecuteButton();
	}

	@Test
	public void clickOn3DotsTest() {
		homepage.clickOn3Dots();
	}

	@Test
	public void clickOnUserGuideTest() {
		homepage.clickOn3Dots();
		homepage.clickOnUserGuide();
		String parentWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String windowHandle : handles) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);

				assert driver.findElement(By.xpath("//label[contains(text(),'Nova2.0 User Guide.pdf')]")).isDisplayed();
				driver.close(); // closing child window
				driver.switchTo().window(parentWindow); // cntrl to parent window
			}
		}

	}
	
	@Test
	public void verifyFeedbackOption()
	{
		homepage.clickOn3Dots();
		homepage.clickOnFeedback();
		
	}
	@Test
	public void taskToExecuteButton() {
		homepage.taskToExecute();

	}

	@Test
	public void starExtraMenuClick(){
		homepage.starExtraMenu();
	}

	@Test
	public void planOptionClick() throws InterruptedException {
		homepage.starExtraMenu();
		homepage.planOption();
		
	}
}
