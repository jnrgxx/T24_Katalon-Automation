import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.utilities.VariableCollections as VariableCollections
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.ExcelPackage.writeExcel as writeExcel

WebUI.refresh()

WebUI.waitForElementPresent(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Find/Tabs', [('TAB') : TAB]), 
    5)

WebUI.click(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Find/Tabs', [('TAB') : TAB]))

WebUI.click(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Find/a_Clear Selection'))

WebUI.setText(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Find/inputCIF'), CIF)

WebUI.setText(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Find/inputArrangementID'), ACCOUNT_NUMBER)

WebUI.click(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Find/btn_Find'))



	WebUI.delay(2)
	
	WebUI.waitForElementPresent(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Find/img_Overview'), 
    3)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Find/img_Overview'))

WebUI.switchToWindowIndex(5)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Service Manager Screen/Account and Deposit/Find/img_approve_btn'))

WebUI.switchToWindowIndex(6)

WebUI.waitForElementPresent(findTestObject('Service Manager Screen/Account and Deposit/Find/img_authorize_deal'), 5)

WebUI.click(findTestObject('Service Manager Screen/Account and Deposit/Find/img_authorize_deal'))

WebUI.maximizeWindow()

WebUI.waitForPageLoad(2)

WebUI.takeScreenshot(RunConfiguration.getReportFolder() + '\\approve_account_or_deposit.png')

System.out.println('Report saved to - ' + RunConfiguration.getReportFolder())

WebUI.delay(10)

WebUI.closeWindowIndex(6)
WebUI.closeWindowIndex(5)

WebUI.switchToWindowIndex(4)






