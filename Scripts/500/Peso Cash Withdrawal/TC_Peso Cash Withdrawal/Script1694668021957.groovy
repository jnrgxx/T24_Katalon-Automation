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

WebUI.waitForElementPresent(findTestObject('Object Repository/Teller Screen/Account and Deposit/Teller Menu', [('TellerMenu') : 'Peso Cash Withdrawal']), 
    3)

WebUI.click(findTestObject('Object Repository/Teller Screen/Account and Deposit/Teller Menu', [('TellerMenu') : 'Peso Cash Withdrawal']))

WebUI.waitForElementPresent(findTestObject('Object Repository/Teller Screen/Account and Deposit/Teller SubMenu', [('TellerSubMenu') : 'Peso Cash Withdrawal']), 
    10)

WebUI.click(findTestObject('Object Repository/Teller Screen/Account and Deposit/Teller SubMenu', [('TellerSubMenu') : 'Peso Cash Withdrawal']))

WebUI.switchToWindowIndex(4)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Teller Screen/Peso Cash Withdrawal/input_Account No'), ACCOUNT_NUMBER)

WebUI.click(findTestObject('Object Repository/Teller Screen/Account and Deposit/ProductCatalog/AccountCreation/Img_Validate'))

WebUI.delay(2)

WebUI.setText(findTestObject('Teller Screen/Peso Cash Withdrawal/input_Amount'), AMOUNT)

WebUI.click(findTestObject('Object Repository/Teller Screen/Account and Deposit/ProductCatalog/AccountCreation/Img_Validate'))

WebUI.click(findTestObject('Object Repository/Teller Screen/Account and Deposit/ProductCatalog/AccountCreation/Img_Commit'))

WebUI.delay(3)

WebUI.closeWindowIndex(4)

WebUI.switchToWindowIndex(3)

