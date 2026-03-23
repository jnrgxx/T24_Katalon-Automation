package com.utilities

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.assertj.core.internal.Conditions
import org.openqa.selenium.Keys

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.SelectorMethod
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class dynamicXPATH {

	@Keyword
	def clickTo(TestObject testObject, String xpath) {
		TestObject to = testObject;
		to.setSelectorValue(SelectorMethod.XPATH, xpath)
		WebUI.click(to);
	}

	@Keyword
	def waitFor(TestObject testObject, String xpath, Number timeOut) {
		TestObject to = testObject;
		to.setSelectorValue(SelectorMethod.XPATH, xpath)
		WebUI.waitForElementPresent(to, timeOut);
	}

	@Keyword
	def click(String path) {
		TestObject to = new TestObject();
		to.setSelectorValue(SelectorMethod.XPATH, path);
		to.setSelectorMethod(SelectorMethod.XPATH);
		WebUI.click(to);
	}

	@Keyword
	def enter(String path) {
		TestObject to = new TestObject();
		to.setSelectorValue(SelectorMethod.XPATH, path);
		to.setSelectorMethod(SelectorMethod.XPATH);
		WebUI.sendKeys(to, Keys.chord(Keys.ENTER));
	}

	@Keyword
	def testObjectXPATH(String xpath) {
		TestObject testObject = new TestObject();
		testObject.setSelectorValue(SelectorMethod.XPATH, xpath);
		testObject.setSelectorMethod(SelectorMethod.XPATH);
		return testObject;
	}
}
