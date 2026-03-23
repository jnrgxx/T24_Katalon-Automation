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

WebUI.switchToWindowIndex(2)

WebUI.refresh()

WebUI.waitForElementPresent(findTestObject('Object Repository/3_Page_Input Command Value/inputCommand'), 60)
WebUI.setText(findTestObject('Object Repository/3_Page_Input Command Value/inputCommand'), INPUT_COMMAND_LINE + CIF)

WebUI.waitForElementPresent(findTestObject('Object Repository/3_Page_Input Command Value/clkCheck'), 60)
WebUI.click(findTestObject('Object Repository/3_Page_Input Command Value/clkCheck'))

WebUI.switchToWindowTitle('CUSTOMER')

WebUI.maximizeWindow()

String Path = 'Test Data\\Create Product.xlsx'
String Sheet = 'Verified CIF'
int rowCount = CustomKeywords.'com.ExcelPackage.writeExcel.getRowCount'(Path, Sheet)

WebUI.delay(1)

String CIFAdd = 'A' + String.valueOf(rowCount + 1)
CustomKeywords.'com.ExcelPackage.writeExcel.writeToExcel'(Path, Sheet, CIFAdd, CIF)

WebUI.delay(5)


if (WebUI.verifyElementPresent(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Verify_Account/INAU'), 10, FailureHandling.OPTIONAL)) 
	{
	String NotAuth = 'B' + String.valueOf(rowCount + 1)
	CustomKeywords.'com.ExcelPackage.writeExcel.writeToExcel'(Path, Sheet, NotAuth, 'No')
	}
	else if (WebUI.verifyElementPresent(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Verify_Account/Authorizer'), 10, FailureHandling.OPTIONAL))
	{
	String Auth = 'B' + String.valueOf(rowCount + 1)
	CustomKeywords.'com.ExcelPackage.writeExcel.writeToExcel'(Path, Sheet, Auth, 'Yes')
	}

String Sector  = WebUI.getText(findTestObject('Object Repository/Service Manager Screen/Account and Deposit/Verify_Account/Sector'))
String SectorAdd = 'C' + String.valueOf(rowCount + 1)
	
CustomKeywords.'com.ExcelPackage.writeExcel.writeToExcel'(Path, Sheet, SectorAdd, Sector)
	
WebUI.takeScreenshot(RunConfiguration.getReportFolder() + '\\verified_customer.png')
	
System.out.println('Report saved to - ' + RunConfiguration.getReportFolder())
	
WebUI.delay(2)

WebUI.closeWindowTitle('CUSTOMER')





