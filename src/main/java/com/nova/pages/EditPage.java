package com.nova.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.nova.test.base.BaseClass;

public class EditPage extends BaseClass {

	@FindBy(xpath = "(//div[@class='nova-v-input-body'])[4]")
	WebElement mobNumber;

	@FindBy(xpath = "//div[@role='switch']")
	WebElement officePhoneSwitch;

	public void EnterDetails() throws IOException {
		/*
		 * mobNumber.sendKeys("9916399341"); officePhoneSwitch.click();
		 */

		File file = new File(
				"C:\\Users\\gurushan\\eclipse-workspace\\com.nova.test\\src\\main\\java\\com\\nova\\util\\Data.xlsx");

		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream;
		
			inputStream = new FileInputStream(file);
			// creating workbook instance that refers to .xls file
			HSSFWorkbook wb;
			wb = new HSSFWorkbook(inputStream);
		

		// creating a Sheet object
		HSSFSheet sheet = wb.getSheet("Employee Data");

		// get first row in the sheet

		// get data
		mobNumber.sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());

	}
}
