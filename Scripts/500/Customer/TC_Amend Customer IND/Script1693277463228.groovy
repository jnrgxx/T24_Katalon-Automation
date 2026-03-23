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

WebUI.selectOptionByValue(findTestObject('Teller Screen/Customer/Amend Customer IND/Customer_Tab/Dropdown - Title'), TITLE, 
    true)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer IND/Customer_Tab/input_Last Name'), LAST_NAME)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer IND/Customer_Tab/input_First Name'), FIRST_NAME)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer IND/Customer_Tab/input_Middle Name'), MIDDLE_NAME)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer IND/Customer_Tab/input_Full Name'), FULL_NAME)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer IND/Customer_Tab/input_Name on Card'), NAME_ON_CARD)

WebUI.delay(1)

String CIF = WebUI.getText(findTestObject('Teller Screen/Customer/Amend Customer IND/Customer_Tab/CIF'))

String MNEMONIC = 'C' + CIF

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer IND/Customer_Tab/input_Mnemonic'), MNEMONIC)

WebUI.delay(1)

WebUI.click(findTestObject('Teller Screen/Customer/Amend Customer IND/Customer_Tab/radiobtn - GENDER - Male'))

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer IND/Customer_Tab/input_Date of Birth'), DATE_OF_BIRTH)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer IND/Customer_Tab/input_Country of Birth'), COUNTRY_OF_BIRTH)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer IND/Customer_Tab/input_Province of Birth'), PROVINCE_OF_BIRTH)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer IND/Customer_Tab/input_CityMunicipality of Birth'), 
    MUNICIPALITY_OF_BIRTH)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer IND/Customer_Tab/input_MOTHER.MAIDEN'), MOTHERS_MAIDEN_NAME)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer IND/Customer_Tab/input_Customer Sector'), CUSTOMER_SECTOR)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer IND/Customer_Tab/input_SIC Code'), SIC_CODE)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer IND/Customer_Tab/input_Nature of Employment'), NATURE_OF_EMPLOYMENT)

WebUI.click(findTestObject('Teller Screen/Customer/Amend Customer IND/Customer_Tab/radiobtn - CUSTOMER.RISK - Normal'))

WebUI.click(findTestObject('Teller Screen/Customer/Amend Customer IND/Address_Tab/span_Address'))

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer IND/Address_Tab/input_HouseUnit NoBldg NameSubd Name.1'), 
    HOUSE_UNIT_1)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer IND/Address_Tab/input_HouseUnit NoBldg NameSubd Name.2'), 
    HOUSE_UNIT_2)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer IND/Address_Tab/input_Province'), PROVINCE)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer IND/Address_Tab/input_ZIP Code'), ZIP_CODE)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer IND/Address_Tab/input_Country'), COUNTRY)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer IND/Address_Tab/input_Mobile Number'), MOBILE)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer IND/Address_Tab/input_Email Address'), EMAIL)

WebUI.click(findTestObject('Teller Screen/Customer/Amend Customer IND/ID Doc_Tab/span_ID Doc_Tab'))

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer IND/ID Doc_Tab/input_TIN'), TIN)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer IND/ID Doc_Tab/input_ID Number'), ID_NUMBER)

WebUI.selectOptionByLabel(findTestObject('Teller Screen/Customer/Amend Customer IND/ID Doc_Tab/Dropdown - IDs Presented'), 
    ID_PRESENTED, true)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer IND/ID Doc_Tab/input_Issue Date'), ISSUE_DATE)

WebUI.click(findTestObject('Teller Screen/Customer/Amend Customer IND/Financials_Tab/span_Financial Details Tab'))

WebUI.selectOptionByLabel(findTestObject('Teller Screen/Customer/Amend Customer IND/Financials_Tab/Dropdown - Source of Funds'), 
    SOURCE_OF_FUNDS, true)

WebUI.selectOptionByLabel(findTestObject('Teller Screen/Customer/Amend Customer IND/Financials_Tab/Dropdown - Employment Status'), 
    EMPLOYMENT_STATUS, true)

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer IND/Financials_Tab/input_Estimated Gross Monthly Income'), 
    GROSS_MONTHLY_INCOME)

WebUI.click(findTestObject('Teller Screen/Customer/Amend Customer IND/Communication_Tab/span_Communication Details'))

WebUI.setText(findTestObject('Teller Screen/Customer/Amend Customer IND/Communication_Tab/input_Introduced By'), INTRODUCED_BY)

WebUI.click(findTestObject('Teller Screen/Customer/Amend Customer IND/Amend Customer/btn_Validate'))

WebUI.click(findTestObject('Teller Screen/Customer/Amend Customer IND/Amend Customer/btn_CommitDeal'))

WebUI.click(findTestObject('Teller Screen/Customer/Amend Customer IND/Amend Customer/a_Accept Overrides'))

String trans_details = WebUI.getText(findTestObject('Teller Screen/Customer/Amend Customer IND/Amend Customer/td_Txn Complete'))

String txn_complete = trans_details

String[] CustomerNo = txn_complete.split(' ')

println(CustomerNo[2])

String xlsPath = 'Test Data\\Amend Customer IND.xlsx'

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

