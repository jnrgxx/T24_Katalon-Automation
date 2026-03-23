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

WebUI.waitForElementPresent(findTestObject('Object Repository/Teller Screen/Account and Deposit/Teller Menu', [('TellerMenu') : 'Unauthorized Transactions']), 
    3)

WebUI.click(findTestObject('Object Repository/Teller Screen/Account and Deposit/Teller Menu', [('TellerMenu') : 'Unauthorized Transactions']))

WebUI.waitForElementPresent(findTestObject('Object Repository/Teller Screen/Account and Deposit/Teller SubMenu', [('TellerSubMenu') : 'Unauthorized Transactions']), 
    10)

WebUI.click(findTestObject('Object Repository/Teller Screen/Account and Deposit/Teller SubMenu', [('TellerSubMenu') : 'Unauthorized Transactions']))

WebUI.switchToWindowIndex(4)

WebUI.maximizeWindow()

WebUI.switchToFrame(findTestObject('Service Manager Screen/Peso Cash Withdrawal - Unauthorized Inputs/frame_Capture object_TAB100355132600'), 
    2)

WebUI.switchToFrame(findTestObject('Service Manager Screen/Peso Cash Withdrawal - Unauthorized Inputs/frame_concat(id(, , main100355132800, , ))_TAB100355132600_main100355132800'), 
    2)

WebUI.waitForElementPresent(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Find/Tabs', [('TAB') : TAB]), 
    0)

WebUI.click(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Find/Tabs', [('TAB') : TAB]))

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Service Manager Screen/Peso Cash Withdrawal - Unauthorized Inputs/frame_Capture object_TAB100355132600'), 
    2)

WebUI.switchToFrame(findTestObject('Service Manager Screen/Peso Cash Withdrawal - Unauthorized Inputs/frame_2'), 2)

WebUI.waitForElementClickable(findTestObject('Service Manager Screen/Peso Cash Withdrawal - Unauthorized Inputs/img_selection_screen'), 
    10)

WebUI.click(findTestObject('Service Manager Screen/Peso Cash Withdrawal - Unauthorized Inputs/img_selection_screen'))

WebUI.setText(findTestObject('Service Manager Screen/Peso Cash Withdrawal - Unauthorized Inputs/input_ACCT NO_value111'), 
    ACCOUNT_NUMBER)

WebUI.setText(findTestObject('Service Manager Screen/Peso Cash Withdrawal - Unauthorized Inputs/input_AMOUNT_value311'), 
    AMOUNT)

WebUI.click(findTestObject('Service Manager Screen/Peso Cash Withdrawal - Unauthorized Inputs/a_Find'))

WebUI.click(findTestObject('Service Manager Screen/Peso Cash Withdrawal - Unauthorized Inputs/btn_Authorize'))

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Service Manager Screen/Peso Cash Withdrawal - Unauthorized Inputs/frame_concat(id(, , workarea066985070504, , ))_TAB066985070500_workarea066985070504'), 
    2)

WebUI.click(findTestObject('Service Manager Screen/Peso Cash Withdrawal - Unauthorized Inputs/btn_Authorize a deal'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeWindowIndex(4)

WebUI.switchToWindowIndex(3)

