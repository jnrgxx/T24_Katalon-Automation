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

WebUI.callTestCase(findTestCase('500/TC_Teller_Screen'), [('TELLER_MENU') : 'Passbook Printing', ('TELLER_SUB_MENU') : 'Reprint Passbook'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Teller Screen/Passbook Printing/input_AccountNumber'), ACCOUNT_NUMBER)

WebUI.sendKeys(findTestObject('Teller Screen/Passbook Printing/input_AccountNumber'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Teller Screen/Passbook Printing/Reprint Passbook/input_ACCOUNT'), ACCOUNT_NUMBER)

WebUI.setText(findTestObject('Teller Screen/Passbook Printing/Reprint Passbook/input_Start Date'), 
    START_DATE)

WebUI.setText(findTestObject('Teller Screen/Passbook Printing/Reprint Passbook/input_End Date'), END_DATE)

WebUI.click(findTestObject('Teller Screen/Passbook Printing/btn_Commit'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.closeWindowIndex(4)

WebUI.switchToWindowIndex(3)

