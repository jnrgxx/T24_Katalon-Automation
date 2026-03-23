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

	WebUI.maximizeWindow()

	CIF = CIF
	CURRENCY = CURRENCY
		
	WebUI.waitForElementPresent(findTestObject('Object Repository/Teller Screen/Account and Deposit/ProductCatalog/AccountCreation/inputCustomer'),
		10)
	
	WebUI.setText(findTestObject('Object Repository/Teller Screen/Account and Deposit/ProductCatalog/AccountCreation/inputCustomer'),
		CIF)
	
	WebUI.setText(findTestObject('Object Repository/Teller Screen/Account and Deposit/ProductCatalog/AccountCreation/inputCurrency'),
		CURRENCY)
	
	String P1 = WebUI.getText(findTestObject('Object Repository/Teller Screen/Account and Deposit/ProductCatalog/AccountCreation/LabelProduct'))
	
	String P2 = PRODUCT
	
	Result = WebUI.verifyMatch(P1, P2, false, FailureHandling.CONTINUE_ON_FAILURE)
	
	if (Result == true) {
		WebUI.click(findTestObject('Object Repository/Teller Screen/Account and Deposit/ProductCatalog/AccountCreation/Img_Validate'))
	
		WebUI.delay(3)
		
	
		//ShortName
		WebUI.waitForElementPresent(findTestObject('Object Repository/Teller Screen/Account and Deposit/ProductCatalog/AccountCreation/LabelShortName'),
			10)
	
		def ShortName = WebUI.getText(findTestObject('Object Repository/Teller Screen/Account and Deposit/ProductCatalog/AccountCreation/LabelShortName'),
			FailureHandling.STOP_ON_FAILURE)
	
		WebUI.waitForElementPresent(findTestObject('Object Repository/Teller Screen/Account and Deposit/ProductCatalog/AccountCreation/inputShortTitle'),
			10)
	
		WebUI.setText(findTestObject('Object Repository/Teller Screen/Account and Deposit/ProductCatalog/AccountCreation/inputShortTitle'),
			ShortName)
		
	
		//WebUI.click(findTestObject('Object Repository/Teller Screen/Account and Deposit/ProductCatalog/AccountCreation/Img_Validate'))
		
		
		WebUI.click(findTestObject('Object Repository/Teller Screen/Account and Deposit/ProductCatalog/AccountCreation/tab_Account'))
		//WebUI.click(findTestObject('Object Repository/Teller Screen/Account and Deposit/ProductCatalog/AccountCreation/Subscription'))
		WebUI.verifyElementClickable(findTestObject('Object Repository/Teller Screen/Account and Deposit/ProductCatalog/AccountCreation/AccountNumber'))
		String AccountNo = WebUI.getAttribute(findTestObject('Object Repository/Teller Screen/Account and Deposit/ProductCatalog/AccountCreation/AccountNumber'), 'value')
		
		String ArrangementID = WebUI.getText(findTestObject('Object Repository/Teller Screen/Account and Deposit/ProductCatalog/AccountCreation/ArrangementID'))
		
		String ProductType = WebUI.getText(findTestObject('Object Repository/Teller Screen/Account and Deposit/ProductCatalog/AccountCreation/ProductType'))
		
		String AActivity = WebUI.getText(findTestObject('Object Repository/Teller Screen/Account and Deposit/ProductCatalog/AccountCreation/AActivity'))
		//----Path----//

String xlsPath = 'Test Data\\Create Product - KOMO.xlsx'

String xlsWorkSheet = 'Accounts'

int rowCount = CustomKeywords.'com.ExcelPackage.writeExcel.getRowCount'(xlsPath, xlsWorkSheet)

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


		WebUI.click(findTestObject('Object Repository/Teller Screen/Account and Deposit/ProductCatalog/AccountCreation/Img_Commit'))
	
		WebUI.maximizeWindow()
	
		WebUI.waitForPageLoad(2)
	
		WebUI.takeScreenshot(RunConfiguration.getReportFolder() + '\\created_account.png')
	
		System.out.println('Report saved to - ' + RunConfiguration.getReportFolder())
	
	} else {
		System.out.println('Product are not matched.')
	}
	

