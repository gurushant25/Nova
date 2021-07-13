package com.nova.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nova.test.base.BaseClass;

public class Homepage extends BaseClass{
	
	NewsLetter newsletter;
	
	Actions action=new Actions(driver);
	
	@FindBy(xpath="//i[@class='iconfont icon-huaban16']")
	WebElement burgerIcon;
	
	@FindBy(xpath="//span[contains(text(),'News')]")
	WebElement newsbutton;
	
	@FindBy(xpath="//span[contains(text(),'Commercial')]")
	WebElement commercialNews;
	
	@FindBy(xpath="//div[@class='pointer']")
	WebElement globePoint;
	
	@FindBy(xpath="//span[contains(text(),'Execute Task')]")
	WebElement executeTask;
	
	@FindBy(xpath = "//div[@Class='user-guid-level user-message-1']")
	WebElement details;
	
	@FindBy(xpath="//i[@class='iconfont icon-huabanfuben59']")
	WebElement threeDots;
	
	@FindBy(xpath="//span[contains(text(),'User Guide ')]")
	WebElement userGuide;
	
	@FindBy(xpath="//span[contains(text(),'Feedback')]")
	WebElement feedback;
	
	@FindBy(xpath="//div[@id='tab-0']")
	WebElement taskToExecute;
	
	@FindBy(xpath="//div[@class='handel-icon iconfont icon-NOVA_iconmanagement-- open']")
	WebElement starExtraMenu;
	
	@FindBy(xpath=" //p[contains(text(),' Config')]")
	WebElement taskConfig;
	
	@FindBy(xpath="  //p[contains(text(),' Execution ')]")
	WebElement taskExecution;
	
	@FindBy(xpath="  //p[contains(text(),'Task Report')]")
	WebElement taskReport;
	
	@FindBy(xpath="  //p[contains(text(),'Dashboard ')]")
	WebElement dashboard;
	
	@FindBy(xpath=" //p[contains(text(),'War Room ')]")
	WebElement warRoom;
	
	@FindBy(xpath="  //p[contains(text(),'Report Cart')]")
	WebElement reportCart;
	
	@FindBy(xpath="  //p[contains(text(),'IUR Bucket ')]")
	WebElement iurMaster;
	
	@FindBy(xpath="  //p[contains(text(),'IUR Bucket ')]")
	WebElement iurBucket;
	
	@FindBy(xpath="  //p[contains(text(),'IUR Build ')]")
	WebElement iurBuild;
	
	@FindBy(xpath="  //p[contains(text(),'IUR Distribution ')]")
	WebElement iurDistribution;
	
	@FindBy(xpath=" //p[contains(text(),'Plan')]")
	WebElement planOption;
	
	
	 //p[contains(text(),'War Room ')]
	
	 
	
	public Homepage() {
		PageFactory.initElements(driver, this); 
	}
	
	public void expandLeftCorner() {
		burgerIcon.click();
		}
	
	public NewsLetter clickOnNews_button() {
		newsbutton.click();
		return new NewsLetter();
	}
	public void qualityMatters() {
		commercialNews.click();
	}
	public void clickOnGlobeButton() {
		globePoint.click();
	}
	public void taskExecuteButton() {
		action.moveToElement(executeTask).click();
	}
	public MyProfilePage accountDetails() {
		details.click();
		return new MyProfilePage();
	}
	
	public void clickOn3Dots() {
		threeDots.click();
	}
	public void clickOnUserGuide() {
		userGuide.click();
	}
	public void clickOnFeedback() {
		feedback.click();
	}
	
	public void taskToExecute() {
		taskToExecute.click();
	}
	
	public void starExtraMenu() {
		starExtraMenu.click();
	}
	
	public void planOption() {
		Actions action=new Actions(driver);
		action.moveToElement(planOption).click();
	}
	
	
}
