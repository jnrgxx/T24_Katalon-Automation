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

WebUI.callTestCase(findTestCase('500/TC_Teller_Screen'), [('TELLER_MENU') : 'Customer', ('TELLER_SUB_MENU') : 'Amend Customer'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer IND/Amend Customer/input_CIF'), CIF)

WebUI.click(findTestObject('Teller Screen/Customer/Amend Customer IND/Amend Customer/btn_Find'))

WebUI.click(findTestObject('Teller Screen/Customer/Amend Customer IND/Amend Customer/Btn_Amend'))

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer CORP/Customer Tab/input_Business Name'), BUSINESS_NAME)

WebUI.delay(1)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer CORP/Customer Tab/input_Business Short Name'), BUSINESS_SHORTNAME)

WebUI.delay(1)

String CIF = WebUI.getText(findTestObject('Teller Screen/Customer/Amend Customer IND/Customer_Tab/CIF'))

String MNEMONIC = 'C' + CIF

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer CORP/Customer Tab/input_Mnemonic'), MNEMONIC)

WebUI.delay(1)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer CORP/Customer Tab/input_Registration Date'), REGISTRATION_DATE)

WebUI.delay(1)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer CORP/Customer Tab/input_Nationality'), NATIONALITY)

WebUI.delay(1)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer CORP/Customer Tab/input_Customer Sector'), CUSTOMER_SECTOR)

WebUI.delay(1)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer CORP/Customer Tab/input_Credit Risk Rating'), CREDIT_RISK_RATING)

WebUI.verifyElementClickable(findTestObject('Teller Screen/Customer/Amend Customer CORP/Customer Tab/radiobtn_CUSTOMER.RISK - Normal'))

WebUI.click(findTestObject('Teller Screen/Customer/Amend Customer CORP/Customer Tab/radiobtn_CUSTOMER.RISK - Normal'))

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer CORP/Customer Tab/input_Risk Code'), RISK_CODE)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer CORP/Customer Tab/input_Nature of Business'), NATURE_OF_BUSINESS)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer CORP/Customer Tab/input_SIC Code'), SIC_CODE)

//Set Address Tab Information
// Business Address
WebUI.click(findTestObject('Teller Screen/Customer/Amend Customer CORP/Address Tab/span_Address'))

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer CORP/Address Tab/input_HouseUnit no.Bldg NameSubd Name.1'), 
    BUSINESS_ADDRESS1)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer CORP/Address Tab/input_HouseUnit no.Bldg NameSubd Name.2'), 
    BUSINESS_ADDRESS2)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer CORP/Address Tab/input_Province'), BUSINESS_PROVINCE)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer CORP/Address Tab/input_ZIP Code'), BUSINESS_ZIP_CODE)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer CORP/Address Tab/input_Country'), BUSINESS_COUNTRY)

// Principal Address
WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer CORP/Address Tab/input_HouseUnit NoBldg NameSubd Name_PERM.ADDRESS'), 
    PERMANENT_ADDRESS1)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer CORP/Address Tab/input_HouseUnit NoBldg NameSubd Name_PERM.CITY'), 
    PERMANENT_ADDRESS2)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer CORP/Address Tab/input_PERM.PROVINCE'), PERMANENT_PROVINCE)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer CORP/Address Tab/input_PERM.ZIP.CODE'), PERMANENT_ZIP_CODE)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer CORP/Address Tab/input_PERM.COUNTRY'), PERMANENT_COUNTRY)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer CORP/Address Tab/input_Mobile Number'), MOBILE_NUMBER)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer CORP/Address Tab/input_Business Email'), BUSINESS_EMAIL)

// Set ID Documents Tab Information
WebUI.click(findTestObject('Teller Screen/Customer/Amend Customer CORP/ID Document Tab/span_ID Documents'))

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer CORP/ID Document Tab/input_TIN'), TIN)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer CORP/ID Document Tab/input_Document No'), DOCUMENT_NO)

WebUI.selectOptionByLabel(findTestObject('Teller Screen/Customer/Amend Customer CORP/ID Document Tab/Dropdown - IDs Presented'), 
    DOCUMENT_PRESENTED, true)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer CORP/ID Document Tab/input_Issue Date'), 
    ISSUE_DATE)

// Set Communication Tab Information
WebUI.click(findTestObject('Teller Screen/Customer/Amend Customer CORP/Communication Details Tab/span_Communication Details'))

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer CORP/Communication Details Tab/input_Introduced By'), 
    INTRODUCED_BY)

WebUI.click(findTestObject('Teller Screen/Customer/Amend Customer CORP/Financial Tab/span_Financial Details'))

WebUI.selectOptionByLabel(findTestObject('Teller Screen/Customer/Amend Customer CORP/Financial Tab/Dropdown - Source of Funds'), 
    SOURCE_OF_FUNDS, true)

WebUI.click(findTestObject('Teller Screen/Customer/Amend Customer IND/Amend Customer/btn_Validate'))

WebUI.click(findTestObject('Teller Screen/Customer/Amend Customer IND/Amend Customer/btn_CommitDeal'))

WebUI.click(findTestObject('Teller Screen/Customer/Amend Customer IND/Amend Customer/a_Accept Overrides'))

String trans_details = WebUI.getText(findTestObject('Teller Screen/Customer/Amend Customer IND/Amend Customer/td_Txn Complete'))

String txn_complete = trans_details

String[] CustomerNo = txn_complete.split(' ')

println(CustomerNo[2])

String xlsPath = 'Test Data\\Amend Customer CORP.xlsx'

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

