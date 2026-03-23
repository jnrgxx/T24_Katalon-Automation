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

WebUI.callTestCase(findTestCase('500/TC_Teller_Screen'), [('TELLER_MENU') : 'Customer', ('TELLER_SUB_MENU') : 'Customer Creation - Individual (Version 2)'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Teller Screen/Customer/V2/input_Last Name'), LAST_NAME)

WebUI.setText(findTestObject('Teller Screen/Customer/V2/input_First Name'), FIRST_NAME)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Customer Tab/input_Full Name'), 
    FULL_NAME)

WebUI.setText(findTestObject('Teller Screen/Customer/V2/input_Name on Card'), NAME_ON_CARD)

WebUI.setText(findTestObject('Teller Screen/Customer/V2/input_Mobile Number'), MOBILE)

WebUI.setText(findTestObject('Teller Screen/Customer/V2/input_Phone Number'), MOBILE)

WebUI.setText(findTestObject('Teller Screen/Customer/V2/input_Email Address'), EMAIL)

WebUI.setText(findTestObject('Teller Screen/Customer/V2/input_ID Number'), ID_NUMBER)

WebUI.setText(findTestObject('Teller Screen/Customer/V2/input_Issue Date'), ISSUE_DATE)

WebUI.click(findTestObject('Teller Screen/Customer/V2/Valdate'))

WebUI.click(findTestObject('Teller Screen/Customer/V2/commit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Validate_Commit/select_RECEIVEDNOT RECEIVED'), 
    'RECEIVED', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Validate_Commit/select_RECEIVEDNOT RECEIVED_1'), 
    'RECEIVED', true)

WebUI.click(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Validate_Commit/a_Accept Overrides'))

String trans_details = WebUI.getText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer CORP/Validate_Commit/Transaction_Completed'))

String txn_complete = trans_details

String[] CustomerNo = txn_complete.split(' ')

println(CustomerNo[2])

String xlsPath = 'Test Data\\Customer Creation IND.xlsx'

String xlsWorkSheet = 'CIF'

int rowCount = CustomKeywords.'com.ExcelPackage.writeExcel.getRowCount'(xlsPath, xlsWorkSheet)

WebUI.delay(1)

String xlsAddress = 'A' + String.valueOf(rowCount + 1)

CustomKeywords.'com.ExcelPackage.writeExcel.writeToExcel'(xlsPath, xlsWorkSheet, xlsAddress, CustomerNo[2])

WebUI.delay(5)

println('SUCCESS' + trans_details)

WebUI.delay(1)

WebUI.maximizeWindow()

WebUI.waitForPageLoad(2)

WebUI.takeScreenshot(RunConfiguration.getReportFolder() + '\\created_customer_IND.png')

System.out.println('Report saved to - ' + RunConfiguration.getReportFolder())

WebUI.closeWindowIndex(4)

WebUI.switchToWindowIndex(3)

