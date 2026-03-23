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
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import java.io.FileInputStream as FileInputStream
import java.io.FileOutputStream as FileOutputStream
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

// Build the formatted string
WebUI.waitForPageLoad(15, FailureHandling.STOP_ON_FAILURE)

String suffix = ''

if (TYPE == 'MAKER') {
    suffix = 'M' // default or error handling
} else if (TYPE == 'APPROVER') {
    suffix = 'A'
} else {
    suffix = 'M'
}

String formattedText = ('USER, S EWB' + ID_NUM) + suffix

WebUI.setText(findTestObject('T24 Creation/input_command or HMM'), formattedText)

WebUI.click(findTestObject('T24 Creation/img_go btn homepage'))

WebUI.switchToWindowTitle('USER PROFILE')

WebUI.delay(2)

WebUI.click(findTestObject('T24 Creation/select_More Actions'))

WebUI.selectOptionByLabel(findTestObject('T24 Creation/select_More Actions'), 'Copy', false)

WebUI.click(findTestObject('T24 Creation/img_go copy'))

WebUI.closeWindowTitle('USER PROFILE')

WebUI.switchToWindowTitle('Message')

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('T24 Creation/td_Deal Copied to your T24 clipboard'), 15)

WebUI.closeWindowTitle('Message')

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowTitle('T24 - OSDBUAT')

String formattedEditText = ('USER, I EWB' + NEWID_NUM) + suffix

WebUI.setText(findTestObject('T24 Creation/input_command or HMM'), formattedEditText)

WebUI.click(findTestObject('T24 Creation/img_go btn homepage'))

WebUI.switchToWindowTitle('USER PROFILE')

WebUI.click(findTestObject('T24 Creation/select_More Actions'))

WebUI.selectOptionByLabel(findTestObject('T24 Creation/select_More Actions'), 'Paste', false)

WebUI.click(findTestObject('T24 Creation/img_go copy'))

WebUI.waitForElementPresent(findTestObject('T24 Creation/select_More Actions'), 15)

WebUI.setText(findTestObject('T24 Creation/input_Username fieldname'), USERNAME)

WebUI.setText(findTestObject('T24 Creation/input_Signname fieldname'), SIGN_NAME)

WebUI.setText(findTestObject('T24 Creation/input_date fieldname'), DATE)

WebUI.click(findTestObject('T24 Creation/img_validate'))

WebUI.click(findTestObject('T24 Creation/img_commit a deal'))

WebUI.verifyElementPresent(findTestObject('T24 Creation/btn_txn'), 3)

WebUI.closeWindowTitle('USER PROFILE')

WebUI.switchToWindowTitle('T24 - OSDBUAT')

WebUI.callTestCase(findTestCase('T24 Creation/TC_Signoff - Copy'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('T24 Creation/TC_Login - Copy - Copy'), [('SIGN_NAME') : SIGN_NAME, ('PASSWORD') : PASSWORD], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('T24 Creation/input_new password'), 15)

WebUI.setText(findTestObject('T24 Creation/input_new password'), PASSWORD)

WebUI.setText(findTestObject('T24 Creation/input_new confirm password'), PASSWORD)

WebUI.click(findTestObject('T24 Creation/img_go btn new pass'))

