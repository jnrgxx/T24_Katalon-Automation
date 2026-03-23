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

WebUI.callTestCase(findTestCase('500/TC_Teller_Screen'), [('TELLER_MENU') : 'Account and Deposit', ('TELLER_SUB_MENU') : 'Find Account'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Find/Tabs', [('TAB') : TAB]), 
    5)

WebUI.click(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Find/Tabs', [('TAB') : TAB]))

WebUI.click(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Find/a_Clear Selection'))

WebUI.setText(findTestObject('Teller Screen/Account and Deposit/Change Primary Owner TD/input_CIF'), CIF)

WebUI.setText(findTestObject('Teller Screen/Account and Deposit/Change Primary Owner TD/input_Arrangement'), ACCOUNT_NUMBER)

WebUI.click(findTestObject('Teller Screen/Account and Deposit/Change Primary Owner TD/a_Find'))

WebUI.click(findTestObject('Teller Screen/Account and Deposit/Change Primary Owner TD/btn_View'))

WebUI.switchToWindowIndex(5)

WebUI.waitForElementPresent(findTestObject('Teller Screen/Account and Deposit/Change Primary Owner TD/Arrangement_New Activity'), 
    5)

WebUI.click(findTestObject('Teller Screen/Account and Deposit/Change Primary Owner TD/Arrangement_New Activity'))

WebUI.switchToWindowIndex(6)

WebUI.click(findTestObject('Teller Screen/Account and Deposit/Change Primary Owner TD/btn_Do Activity today'))

WebUI.setText(findTestObject('Teller Screen/Account and Deposit/Change Primary Owner TD/input_Customer'), NEW_OWNER)

WebUI.click(findTestObject('Teller Screen/Account and Deposit/Change Primary Owner TD/btn_Validate a deal'))

WebUI.click(findTestObject('Teller Screen/Account and Deposit/Change Primary Owner TD/btn_delete owner'))

WebUI.click(findTestObject('Teller Screen/Account and Deposit/Change Primary Owner TD/btn_Commit'))

WebUI.click(findTestObject('Teller Screen/Account and Deposit/Change Primary Owner TD/a_Accept Overrides'))

WebUI.delay(2)

WebUI.closeWindowIndex(6)

WebUI.closeWindowIndex(5)

WebUI.switchToWindowIndex(2)

