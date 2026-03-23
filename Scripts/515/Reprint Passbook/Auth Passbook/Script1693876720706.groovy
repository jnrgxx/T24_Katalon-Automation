import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.refresh()

WebUI.callTestCase(findTestCase('500/TC_Teller_Screen'), [('TELLER_MENU') : 'Passbook Printing', ('TELLER_SUB_MENU') : 'Authorize Reprint Passbook'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.waitForElementClickable(findTestObject('Teller Screen/Passbook Printing/Reprint Passbook/bnt_Selection Screen'), 2)

WebUI.click(findTestObject('Teller Screen/Passbook Printing/Reprint Passbook/bnt_Selection Screen'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Teller Screen/Passbook Printing/Reprint Passbook/input_Account No'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Teller Screen/Passbook Printing/Reprint Passbook/input_Account No'), ACCOUNT_NUMBER)

WebUI.setText(findTestObject('Teller Screen/Passbook Printing/Reprint Passbook/input_START.DATE'), START_DATE)

WebUI.setText(findTestObject('Teller Screen/Passbook Printing/Reprint Passbook/input_END.DATE'), END_DATE)

WebUI.click(findTestObject('Teller Screen/Passbook Printing/Reprint Passbook/a_Find'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Teller Screen/Passbook Printing/Reprint Passbook/btn_Authorize'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Teller Screen/Passbook Printing/Reprint Passbook/btn_Authorize a deal'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Teller Screen/Passbook Printing/Reprint Passbook/bnt_Verifies a deal'), FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowIndex(5)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Teller Screen/Passbook Printing/btn_Commit'), FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowIndex(6)

WebUI.maximizeWindow()

WebUI.waitForPageLoad(2)

WebUI.takeFullPageScreenshot('C:\\Users\\ITG01120\\git\\(BAU) T24 Regression Testing\\Screenshots\\Passbook.png')

WebUI.delay(5)

WebUI.closeWindowIndex(6)

WebUI.switchToWindowIndex(5)

WebUI.selectOptionByLabel(findTestObject('Teller Screen/Passbook Printing/Reprint Passbook/select_YESNO'), 'YES', true)

WebUI.click(findTestObject('Teller Screen/Passbook Printing/btn_Commit'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeWindowIndex(5)

WebUI.switchToWindowIndex(3)

