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

WebUI.callTestCase(findTestCase('500/TC_Teller_Screen'), [('TELLER_MENU') : 'Passbook Printing', ('TELLER_SUB_MENU') : 'Passbook Issue'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Teller Screen/Passbook Printing/input_AccountNumber'), ACCOUNT_NUMBER)

WebUI.sendKeys(findTestObject('Teller Screen/Passbook Printing/input_AccountNumber'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Teller Screen/Passbook Printing/input_Passbook device ID'), PSBK_DEVICEID)

WebUI.click(findTestObject('Teller Screen/Passbook Printing/btn_Commit'), FailureHandling.STOP_ON_FAILURE)

String trans_details = WebUI.getText(findTestObject('Teller Screen/Passbook Printing/td_Txn Complete'))

String txn_complete = trans_details

String[] CustomerNo = txn_complete.split(' ')

println(CustomerNo[2])

String xlsPath = 'Test Data\\Passbook.xlsx'

String xlsWorkSheet = 'AccountNumber'

int rowCount = CustomKeywords.'com.ExcelPackage.writeExcel.getRowCount'(xlsPath, xlsWorkSheet)

WebUI.delay(1)

String xlsAddress = 'A' + String.valueOf(rowCount + 1)

CustomKeywords.'com.ExcelPackage.writeExcel.writeToExcel'(xlsPath, xlsWorkSheet, xlsAddress, CustomerNo[2])

WebUI.delay(5)

println('SUCCESS' + trans_details)

WebUI.delay(1)

WebUI.maximizeWindow()

WebUI.waitForPageLoad(2)

WebUI.closeWindowIndex(4)

WebUI.switchToWindowIndex(3)

