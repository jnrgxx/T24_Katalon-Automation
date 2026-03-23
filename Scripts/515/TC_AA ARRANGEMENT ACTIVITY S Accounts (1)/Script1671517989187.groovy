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


WebUI.waitForElementPresent(findTestObject('Object Repository/3_Page_Input Command Value/inputCommand'), 60)
WebUI.setText(findTestObject('Object Repository/3_Page_Input Command Value/inputCommand'), INPUT_COMMAND_LINE + ARRANGEMENT_ACTIVITY)

WebUI.waitForElementPresent(findTestObject('Object Repository/3_Page_Input Command Value/clkCheck'), 60)
WebUI.click(findTestObject('Object Repository/3_Page_Input Command Value/clkCheck'))

WebUI.switchToWindowIndex(3)


String ActivityType = WebUI.getText(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Verify_Account/ActivityType'))

String ActType = ActivityType
String[] AT = ActType.split('-')
println(AT[0])

String Atype = AT[0]
String Accounts = 'Accounts'
String Deposits = 'Deposits'
	
	//Result = WebUI.verifyMatch(Atype,Type, false, FailureHandling.CONTINUE_ON_FAILURE)
	
	if (Atype != Accounts) {

String xlsPath = 'C:\\Users\\JCG65808\\Documents\\2022\\AUTOMATION\\DXP\\CASA Test Data.xlsx'
String xlsWorkSheet = 'Test Data'
int rowCount = CustomKeywords.'com.ExcelPackage.writeExcel.getRowCount'(xlsPath, xlsWorkSheet)

WebUI.maximizeWindow()

String CIF = WebUI.getText(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Verify_Account/CIF'))
String ShortName = WebUI.getText(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Verify_Account/ShortName'))
String AccountNo = WebUI.getText(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Verify_Account/AccountNo'))
String ArrangementID = WebUI.getText(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Verify_Account/ArrangementID'))
String ProductType = WebUI.getText(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Verify_Account/ProductType'))
String AActivity = WebUI.getText(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Verify_Account/AActivity'))

String CIF_Address = 'A'+ String.valueOf(rowCount +1)
String NAME = 'B' + String.valueOf(rowCount + 1)
String ACCOUNT_NUMBER = 'C' + String.valueOf(rowCount + 1)
String ARRANGEMENT_ID = 'D' + String.valueOf(rowCount + 1)
String ACCOUNT_TYPE = 'E' + String.valueOf(rowCount + 1)
String ARRANGEMENT_ACTIVITY = 'F' + String.valueOf(rowCount + 1)

CustomKeywords.'com.ExcelPackage.writeExcel.writeToExcel'(xlsPath, xlsWorkSheet, CIF_Address, CIF)
CustomKeywords.'com.ExcelPackage.writeExcel.writeToExcel'(xlsPath, xlsWorkSheet, NAME, ShortName)
CustomKeywords.'com.ExcelPackage.writeExcel.writeToExcel'(xlsPath, xlsWorkSheet, ACCOUNT_NUMBER, AccountNo)
CustomKeywords.'com.ExcelPackage.writeExcel.writeToExcel'(xlsPath, xlsWorkSheet, ARRANGEMENT_ID, ArrangementID)
CustomKeywords.'com.ExcelPackage.writeExcel.writeToExcel'(xlsPath, xlsWorkSheet, ACCOUNT_TYPE, ProductType)
CustomKeywords.'com.ExcelPackage.writeExcel.writeToExcel'(xlsPath, xlsWorkSheet, ARRANGEMENT_ACTIVITY, AActivity)


if (WebUI.verifyElementPresent(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Verify_Account/INAU'), 10, FailureHandling.OPTIONAL)) 
	{
	String NotAuth = 'G' + String.valueOf(rowCount + 1)
	CustomKeywords.'com.ExcelPackage.writeExcel.writeToExcel'(xlsPath, xlsWorkSheet, NotAuth, 'No')
	}
	else if (WebUI.verifyElementPresent(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Verify_Account/Authorizer'), 10, FailureHandling.OPTIONAL))
	{
	String Auth = 'G' + String.valueOf(rowCount + 1)
	CustomKeywords.'com.ExcelPackage.writeExcel.writeToExcel'(xlsPath, xlsWorkSheet, Auth, 'Yes')
	}

WebUI.takeScreenshot(RunConfiguration.getReportFolder() + '\\verified_account.png')
	
System.out.println('Report saved to - ' + RunConfiguration.getReportFolder())
	}
	else if (Atype != Deposits)
	{
		String xlsPath = 'C:\\Users\\JCG65808\\Documents\\2022\\AUTOMATION\\DXP\\DEPOSIT Test Data.xlsx'
		String xlsWorkSheet = 'Test Data'
		int rowCount = CustomKeywords.'com.ExcelPackage.writeExcel.getRowCount'(xlsPath, xlsWorkSheet)
		
		WebUI.maximizeWindow()
		
		String CIF = WebUI.getText(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Verify_Account/CIF'))
		String ShortName = WebUI.getText(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Verify_Account/ShortName'))
		String AccountNum = WebUI.getText(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Verify_Account/AccountNum'))
		String ArrangementID = WebUI.getText(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Verify_Account/ArrangementID'))
		String ProductType = WebUI.getText(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Verify_Account/ProductType'))
		String AActivity = WebUI.getText(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Verify_Account/AActivity'))
		
		String CIF_Address = 'A'+ String.valueOf(rowCount +1)
		String NAME = 'B' + String.valueOf(rowCount + 1)
		String ACCOUNT_NUMBER = 'C' + String.valueOf(rowCount + 1)
		String ARRANGEMENT_ID = 'D' + String.valueOf(rowCount + 1)
		String ACCOUNT_TYPE = 'E' + String.valueOf(rowCount + 1)
		String ARRANGEMENT_ACTIVITY = 'F' + String.valueOf(rowCount + 1)
		
		CustomKeywords.'com.ExcelPackage.writeExcel.writeToExcel'(xlsPath, xlsWorkSheet, CIF_Address, CIF)
		CustomKeywords.'com.ExcelPackage.writeExcel.writeToExcel'(xlsPath, xlsWorkSheet, NAME, ShortName)
		CustomKeywords.'com.ExcelPackage.writeExcel.writeToExcel'(xlsPath, xlsWorkSheet, ACCOUNT_NUMBER, AccountNum)
		CustomKeywords.'com.ExcelPackage.writeExcel.writeToExcel'(xlsPath, xlsWorkSheet, ARRANGEMENT_ID, ArrangementID)
		CustomKeywords.'com.ExcelPackage.writeExcel.writeToExcel'(xlsPath, xlsWorkSheet, ACCOUNT_TYPE, ProductType)
		CustomKeywords.'com.ExcelPackage.writeExcel.writeToExcel'(xlsPath, xlsWorkSheet, ARRANGEMENT_ACTIVITY, AActivity)
		
		
		if (WebUI.verifyElementPresent(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Verify_Account/INAU'), 10, FailureHandling.OPTIONAL))
			{
			String NotAuth = 'G' + String.valueOf(rowCount + 1)
			CustomKeywords.'com.ExcelPackage.writeExcel.writeToExcel'(xlsPath, xlsWorkSheet, NotAuth, 'No')
			}
			else if (WebUI.verifyElementPresent(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Verify_Account/Authorizer'), 10, FailureHandling.OPTIONAL))
			{
			String Auth = 'G' + String.valueOf(rowCount + 1)
			CustomKeywords.'com.ExcelPackage.writeExcel.writeToExcel'(xlsPath, xlsWorkSheet, Auth, 'Yes')
			}
		
		WebUI.takeScreenshot(RunConfiguration.getReportFolder() + '\\verified_deposit.png')
			
		System.out.println('Report saved to - ' + RunConfiguration.getReportFolder())
	}
	else {
		System.out.println('Not matched.')
	}
	
WebUI.delay(2)

WebUI.closeWindowIndex(3)

WebUI.switchToWindowIndex(2)

