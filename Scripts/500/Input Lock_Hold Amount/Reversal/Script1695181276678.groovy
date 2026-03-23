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

WebUI.waitForElementPresent(findTestObject('Object Repository/Teller Screen/selectUTM'), 60)

WebUI.click(findTestObject('Object Repository/Teller Screen/selectUTM'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Teller Screen/Account and Deposit/Teller Menu', [('TellerMenu') : 'Account and Deposit']), 
    3)

WebUI.click(findTestObject('Object Repository/Teller Screen/Account and Deposit/Teller Menu', [('TellerMenu') : 'Account and Deposit']))

WebUI.waitForElementPresent(findTestObject('Object Repository/Teller Screen/Account and Deposit/Teller SubMenu', [('TellerSubMenu') : 'Find Account']), 
    10)

WebUI.click(findTestObject('Object Repository/Teller Screen/Account and Deposit/Teller SubMenu', [('TellerSubMenu') : 'Find Account']))

WebUI.switchToWindowIndex(4)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Service Manager Screen/Account and Deposit/Find/inputArrangementID'), ACCOUNT_NUMBER)

WebUI.click(findTestObject('Service Manager Screen/Account and Deposit/Find/btn_Find'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Service Manager Screen/Account and Deposit/Find/img_overview'))

WebUI.delay(2)

WebUI.switchToWindowIndex(5)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Service Manager Screen/Account and Deposit/Find/a_Locked Funds'))

WebUI.click(findTestObject('Teller Screen/Input Lock_Hold Funds/btn_Reverse a deal'))

WebUI.delay(3)

WebUI.closeWindowIndex(4)

WebUI.switchToWindowIndex(3)

