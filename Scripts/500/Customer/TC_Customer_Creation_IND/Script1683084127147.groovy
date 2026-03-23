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

WebUI.callTestCase(findTestCase('500/TC_Teller_Screen'), [('TELLER_MENU') : 'Customer', ('TELLER_SUB_MENU') : 'Customer Creation - Individual'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Customer Tab/Dropdown - Title'), 
    TITLE, true)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Customer Tab/input_Last Name'), 
    LAST_NAME)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Customer Tab/input_First Name'), 
    FIRST_NAME)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Customer Tab/input_Middle Name'), 
    MIDDLE_NAME)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Customer Tab/input_Full Name'), 
    FULL_NAME)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Customer Tab/input_Name on Card'), 
    NAME_ON_CARD)

WebUI.delay(1)

String CIF = WebUI.getText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer CORP/BasicDetailsTab/CIF'))

String MNEMONIC = 'C' + CIF

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Customer Tab/input_Mnemonic'), 
    MNEMONIC)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Customer Tab/radiobtn - GENDER - Male'))

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Customer Tab/input_Date of Birth'), 
    DATE_OF_BIRTH)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Customer Tab/input_Country of Birth'), 
    COUNTRY_OF_BIRTH)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Customer Tab/input_Province of Birth'), 
    PROVINCE_OF_BIRTH)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Customer Tab/input_CityMunicipality of Birth'), 
    MUNICIPALITY_OF_BIRTH)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Customer Tab/input_Mother Maiden Name'), 
    MOTHERS_MAIDEN_NAME)

WebUI.selectOptionByValue(findTestObject('Teller Screen/Customer/Create Customer IND/Customer Tab/input_Marital Status'), 
    MARITAL_STATUS, true)

//WebUI.selectOptionByLabel(findTestObject('Teller Screen/Customer/Create Customer IND/Customer Tab/input_Religion'), RELIGION, 
//    true)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Customer Tab/input_Customer Sector'), 
    CUSTOMER_SECTOR)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Customer Tab/input_SIC Code'), 
    SIC_CODE)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Customer Tab/input_Nature of Employment'), 
    NATURE_OF_EMPLOYMENT)

WebUI.click(findTestObject('Teller Screen/Customer/Create Customer IND/Customer Tab/radiobtn - CUSTOMER.RISK - Normal Risk'))

WebUI.click(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Address Tab/span_AddressTab'))

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Address Tab/input_HouseUnit NoBldg NameSubd Name_1'), 
    HOUSE_UNIT_1)

WebUI.click(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Address Tab/td'))

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Address Tab/input_HouseUnit NoBldg NameSubd Name_2'), 
    HOUSE_UNIT_2)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Address Tab/input_Province'), 
    PROVINCE)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Address Tab/input_ZIP Code'), 
    ZIP_CODE)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Address Tab/input_Country'), 
    COUNTRY)

WebUI.click(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Address Tab/radiobtn - PERM.ADD - Yes'))

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Address Tab/input_Mobile Number'), 
    MOBILE)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Address Tab/input_Email Address'), 
    EMAIL)

WebUI.click(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/ID Doc Tab/span_ID Doc'))

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/ID Doc Tab/input_TIN'), TIN)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/ID Doc Tab/input_ID Number'), 
    ID_NUMBER)

WebUI.selectOptionByLabel(findTestObject('Teller Screen/Customer/Create Customer IND/ID Doc Tab/Dropdown - IDs Presented - CompanyID'), 
    ID_PRESENTED, true)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/ID Doc Tab/input_Issue Date'), 
    ISSUE_DATE)

WebUI.click(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Financial Details Tab/span_Financial Details'))

WebUI.selectOptionByLabel(findTestObject('Teller Screen/Customer/Create Customer IND/Financial Details Tab/Dropdown - Source of Funds - Personal Savings'), 
    SOURCE_OF_FUNDS, true)

WebUI.selectOptionByLabel(findTestObject('Teller Screen/Customer/Create Customer IND/Financial Details Tab/Dropdown - Employment Status - Deped Mbhte - Apds'), 
    EMPLOYMENT_STATUS, true)

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Financial Details Tab/input_Gross Monthly Income'), 
    GROSS_MONTHLY_INCOME)

WebUI.click(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Communication Details Tab/span_Communication Details'))

WebUI.setText(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Communication Details Tab/input_Introduced By'), 
    INTRODUCED_BY)

WebUI.click(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Validate_Commit/Validate a Deal - btn'))

WebUI.click(findTestObject('Object Repository/Teller Screen/Customer/Create Customer IND/Validate_Commit/Commit a deal - btn'))

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

