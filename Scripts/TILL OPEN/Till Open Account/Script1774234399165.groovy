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
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys

// Navigate to Till creation
WebUI.refresh()
WebUI.click(findTestObject('Till Open/btn_Service Manager Approver'))
WebUI.click(findTestObject('Till Open/btn_Till Administration'))
WebUI.click(findTestObject('Till Open/btn_Create New Till'))
WebUI.switchToWindowIndex(4)
WebUI.delay(2)

// Load Excel data
TestData tillData = findTestData('T24 Creation/Till Open - Till ID')
TestData userData = findTestData('T24 Creation/Till Open - User')

int tillRowCount = tillData.getRowNumbers()
int userRowCount = userData.getRowNumbers()

// Loop through Till IDs until one works
for (int i = 1; i <= tillRowCount; i++) {
	String tillId = tillData.getValue('TILL_ID', i)
	String tillStatus = tillData.getValue('Processed', i)

	// Skip already processed Till IDs
	if (tillStatus != null && tillStatus.trim().length() > 0) {
		continue
	}

	WebUI.setText(findTestObject('Till Open/input_Till'), tillId)
	WebUI.sendKeys(findTestObject('Till Open/input_Till'), Keys.chord(Keys.ENTER))

	boolean errorExists = WebUI.verifyElementPresent(findTestObject('Till Open/error_CANNOT ACCESS RECORD'), 3, FailureHandling.OPTIONAL)

	if (errorExists) {
		println("TILL ID " + tillId + " failed.")
		CustomKeywords.'excelHelper.ExcelHelper.updateCell'(
			'Test Data/T24 Creation.xlsx',
			'TILL',
			i + 1,
			2,   // column index for Processed
			"Failed"
		)
		continue
	}

	// Find the next available User (blank Processed)
	int userRow = -1
	for (int u = 1; u <= userRowCount; u++) {
		String userStatus = userData.getValue('Processed', u)
		if (userStatus == null || userStatus.trim().isEmpty()) {
			userRow = u
			break
		}
	}

	if (userRow == -1) {
		println("No available User IDs left.")
		break
	}

	String userId = userData.getValue('USER_ID', userRow)
	println("TILL ID " + tillId + " accepted, pairing with USER ID " + userId)

	WebUI.setText(findTestObject('Till Open/input_teller id'), userId)
	WebUI.click(findTestObject('Till Open/img_validate'))

	String actualTillId = WebUI.getText(findTestObject('Till Open/get_text'))
	println("Confirmed Till ID: " + actualTillId)

	// Mark Till ID as Success
	CustomKeywords.'excelHelper.ExcelHelper.updateCell'(
		'Test Data/T24 Creation.xlsx',
		'TILL',
		i + 1,
		2,
		"Success"
	)

	// Assign Till ID to User
	CustomKeywords.'excelHelper.ExcelHelper.updateCell'(
		'Test Data/T24 Creation.xlsx',
		'Users',
		userRow + 1,
		2,   // column index for AssignedTill
		actualTillId
	)

	// Mark User as processed
	CustomKeywords.'excelHelper.ExcelHelper.updateCell'(
		'Test Data/T24 Creation.xlsx',
		'Users',
		userRow + 1,
		3,   // column index for Processed
		"Success"
	)
	userData = findTestData('T24 Creation/Till Open - User')
	WebUI.click(findTestObject('Till Open/img_commit a deal'))
}
