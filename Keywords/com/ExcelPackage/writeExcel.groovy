package com.ExcelPackage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords;

public class writeExcel {

	public FileInputStream fis = null
	public XSSFWorkbook workbook = null
	public XSSFSheet sheet = null

	@Keyword
	public int getRowCount(String xlsPath, String xlsWorkSheet) {
		fis = new FileInputStream(xlsPath)
		workbook = new XSSFWorkbook(fis)
		sheet = workbook.getSheet(xlsWorkSheet)
		int rowCount = sheet.getLastRowNum()+1
		fis.close()
		return rowCount
	}

	@Keyword
	public void writeToExcel (String xlsPath, String xlsWorkSheet, String xlsAddress, String xlsValue) throws IOException{
		fis = new FileInputStream(xlsPath)
		workbook = new XSSFWorkbook(fis)
		sheet = workbook.getSheet(xlsWorkSheet)
		ExcelKeywords.setValueToCellByAddress(sheet, xlsAddress, xlsValue)
		FileOutputStream fos = new FileOutputStream(xlsPath)
		workbook.write(fos)
		fis.close()
		fos.close()
	}
}
