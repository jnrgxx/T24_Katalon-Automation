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

WebUI.waitForElementPresent(findTestObject('Object Repository/Teller Screen/selectUTM'), 60)

WebUI.click(findTestObject('Object Repository/Teller Screen/selectUTM'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Teller Screen/Account and Deposit/Teller Menu', [('TellerMenu') : 'Peso TD Transactions']), 
    3)

WebUI.click(findTestObject('Object Repository/Teller Screen/Account and Deposit/Teller Menu', [('TellerMenu') : 'Peso TD Transactions']))

WebUI.waitForElementPresent(findTestObject('Object Repository/Teller Screen/Account and Deposit/Teller SubMenu', [('TellerSubMenu') : 'Peso TD Cash Deposit']), 
    10)

WebUI.click(findTestObject('Object Repository/Teller Screen/Account and Deposit/Teller SubMenu', [('TellerSubMenu') : 'Peso TD Cash Deposit']))

WebUI.switchToWindowIndex(4)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Teller Screen/Cash Deposit/inputAccountNo'), ACCOUNT_NUMBER)

WebUI.click(findTestObject('Object Repository/Teller Screen/Account and Deposit/ProductCatalog/AccountCreation/Img_Validate'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Cash Deposit/inputAmount'), AMOUNT)


WebUI.click(findTestObject('Object Repository/Teller Screen/Account and Deposit/ProductCatalog/AccountCreation/Img_Validate'))
WebUI.click(findTestObject('Object Repository/Teller Screen/Account and Deposit/ProductCatalog/AccountCreation/Img_Commit'))

WebUI.delay(5)

WebUI.closeWindowIndex(4)

WebUI.switchToWindowIndex(3)