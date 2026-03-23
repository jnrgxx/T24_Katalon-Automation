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

WebUI.callTestCase(findTestCase('500/TC_Teller_Screen'), [('TELLER_MENU') : 'Customer', ('TELLER_SUB_MENU') : 'Customer Creation - Corporate'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

// Set Basic Details Tab Information
WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer CORP/BasicDetailsTab/input_BussinessName'), 
    BUSINESS_NAME)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer CORP/BasicDetailsTab/input_BusinessShortName'), 
    BUSINESS_SHORTNAME)

WebUI.delay(1)

String CIF = WebUI.getText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer CORP/BasicDetailsTab/CIF'))

String MNEMONIC = 'C' + CIF

WebUI.setText(findTestObject('Teller Screen/Customer/Create Customer CORP/BasicDetailsTab/input_Mnemonic'), MNEMONIC)

WebUI.delay(1)

WebUI.setText(findTestObject('Teller Screen/Customer/Create Customer CORP/BasicDetailsTab/input_Registration Date'), REGISTRATION_DATE)

WebUI.delay(1)

WebUI.setText(findTestObject('Teller Screen/Customer/Create Customer CORP/BasicDetailsTab/input_Nationality'), NATIONALITY)

WebUI.delay(1)

WebUI.setText(findTestObject('Teller Screen/Customer/Create Customer CORP/BasicDetailsTab/input_Customer Sector'), CUSTOMER_SECTOR)

WebUI.delay(1)

WebUI.setText(findTestObject('Teller Screen/Customer/Create Customer CORP/BasicDetailsTab/input_Credit Risk Rating'), CREDIT_RISK_RATING)

WebUI.verifyElementClickable(findTestObject('Object Repository/Teller Screen/Customer/Create Customer CORP/BasicDetailsTab/radiobtn_NormalRisk'))

WebUI.click(findTestObject('Object Repository/Teller Screen/Customer/Create Customer CORP/BasicDetailsTab/radiobtn_NormalRisk'))

WebUI.setText(findTestObject('Teller Screen/Customer/Create Customer CORP/BasicDetailsTab/input_Risk Code'), RISK_CODE)

WebUI.setText(findTestObject('Teller Screen/Customer/Create Customer CORP/BasicDetailsTab/input_Nature of Business'), NATURE_OF_BUSINESS)

WebUI.setText(findTestObject('Teller Screen/Customer/Create Customer CORP/BasicDetailsTab/input_SIC Code'), SIC_CODE)

//Set Address Tab Information
// Business Address
WebUI.click(findTestObject('Object Repository/Teller Screen/Customer/Create Customer CORP/AddressTab/tab_Address'))

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer CORP/AddressTab/inputBusinessAddress1'), 
    BUSINESS_ADDRESS1)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer CORP/AddressTab/inputBusinessAddress2'), 
    BUSINESS_ADDRESS2)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer CORP/AddressTab/inputBusinessProvince'), 
    BUSINESS_PROVINCE)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer CORP/AddressTab/inputBusinessZipCode'), 
    BUSINESS_ZIP_CODE)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer CORP/AddressTab/inputBusinessCountry'), 
    BUSINESS_COUNTRY)

// Principal Address
WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer CORP/AddressTab/inputPermanentAddress1'), 
    PERMANENT_ADDRESS1)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer CORP/AddressTab/inputPermanentAddress2'), 
    PERMANENT_ADDRESS2)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer CORP/AddressTab/inputPermanentProvince'), 
    PERMANENT_PROVINCE)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer CORP/AddressTab/inputPermanentZipCode'), 
    PERMANENT_ZIP_CODE)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer CORP/AddressTab/inputPermanentCountry'), 
    PERMANENT_COUNTRY)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer CORP/AddressTab/inputPermanentCountry'), 
    PERMANENT_COUNTRY)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer CORP/AddressTab/inputMobileNumber'), 
    MOBILE_NUMBER)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer CORP/AddressTab/inputBusinessEmail'), 
    BUSINESS_EMAIL)

// Set ID Documents Tab Information
WebUI.click(findTestObject('Object Repository/Teller Screen/Customer/Create Customer CORP/DocumentTab/tab_ID Documents'))

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer CORP/DocumentTab/inputTIN'), TIN)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer CORP/DocumentTab/inputDocumentNo'), 
    DOCUMENT_NO)

WebUI.selectOptionByLabel(findTestObject('Teller Screen/Customer/Create Customer CORP/DocumentTab/Dropdown - Document Presented'), 
    DOCUMENT_PRESENTED, true)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer CORP/DocumentTab/inputIssueDate'), 
    ISSUE_DATE)

// Set Communication Tab Information
WebUI.click(findTestObject('Object Repository/Teller Screen/Customer/Create Customer CORP/CommsTab/tab_Communication'))

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer CORP/CommsTab/inputIntroduceBy'), 
    INTRODUCED_BY)

WebUI.click(findTestObject('Teller Screen/Customer/Create Customer CORP/FinancialTab/span_Financial Details'))

WebUI.selectOptionByLabel(findTestObject('Teller Screen/Customer/Create Customer CORP/FinancialTab/Dropdown - Source of funds'), 
    SOURCE_OF_FUNDS, true)

WebUI.click(findTestObject('Object Repository/Teller Screen/Customer/Create Customer CORP/Validate_Commit/img_validate_deal'))

WebUI.click(findTestObject('Object Repository/Teller Screen/Customer/Create Customer CORP/Validate_Commit/img_commit_deal'))

WebUI.selectOptionByValue(findTestObject('Teller Screen/Customer/Create Customer CORP/Validate_Commit/select_RECEIVED_1'), 
    'RECEIVED', true)

WebUI.selectOptionByValue(findTestObject('Teller Screen/Customer/Create Customer CORP/Validate_Commit/select_RECEIVED_2'), 
    'RECEIVED', true)

WebUI.selectOptionByValue(findTestObject('Teller Screen/Customer/Create Customer CORP/Validate_Commit/select_RECEIVED_3'), 
    'RECEIVED', true)

WebUI.selectOptionByValue(findTestObject('Teller Screen/Customer/Create Customer CORP/Validate_Commit/select_RECEIVED_4'), 
    'RECEIVED', true)

WebUI.selectOptionByValue(findTestObject('Teller Screen/Customer/Create Customer CORP/Validate_Commit/select_RECEIVED_5'), 
    'RECEIVED', true)

WebUI.verifyElementClickable(findTestObject('Teller Screen/Customer/Create Customer CORP/Validate_Commit/Accept Overrides'))

WebUI.click(findTestObject('Teller Screen/Customer/Create Customer CORP/Validate_Commit/Accept Overrides'))

String trans_details = WebUI.getText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer CORP/Validate_Commit/Transaction_Completed'))

String txn_complete = trans_details

String[] CustomerNo = txn_complete.split(' ')

println(CustomerNo[2])

String xlsPath = 'Test Data\\Customer Creation CORP.xlsx'

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

