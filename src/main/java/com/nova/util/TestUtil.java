package com.nova.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.print.attribute.standard.PrinterState;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.apache.poi.ss.usermodel.Sheet;

import com.nova.test.base.BaseClass;

public class TestUtil extends BaseClass{
	public static long PAGE_LOAD_TIMEOUT = 30;
	public static long IMPLICIT_WAIT = 30;
	
	public static String TESTDATA_SHEET_PATH = "C:/Users/gurushan/eclipse-workspace"
			+ "/CRMAutomationTest/src/main/resources/ContactDetails.xlsx";

	static Workbook book;
	static Sheet sheet;
	
	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}
	
	public void createActionObject() {
		Actions action=new Actions(driver);
	}
	
	public static Object[][] getsheet(String sheetName) {
		FileInputStream file = null;
		try {
		file=new FileInputStream(TESTDATA_SHEET_PATH);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			book=WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sheet = book.getSheet(sheetName);
		
		Object data[][]=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i=0; i<sheet.getLastRowNum();i++) {
			for(int j=0; j<sheet.getRow(0).getLastCellNum();j++) {
				data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
			}
		}
		return data;
	}
	public void takeScreenShotAtTheEnd() throws IOException {
		File scrFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String directory=System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, newFile(directory + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}

	private File newFile(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void runTimeInfo(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
	
	
}