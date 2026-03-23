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

CIF = CIF

CA = CA.toInteger()

PA = PA.toInteger()

SA = SA.toInteger()

TD = TD.toInteger()

PAY_IN = PAY_IN

PAY_OUT = PAY_OUT

CURRENCY = CURRENCY

for (def i = 1; i <= SA; i++) {
    WebUI.maximizeWindow()

    CATEGORY = 'Accounts'

    GROUP = 'Savings Accounts'

	PRODUCT = 'ATM Savings'

    WebUI.callTestCase(findTestCase('500/Account and Deposit/TC_Select_Product_Catalog'), [('CATEGORY') : CATEGORY, ('GROUP') : GROUP
            , ('PRODUCT') : PRODUCT], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('500/Account and Deposit/TC_Create CASA - KOMO'), [('CIF') : CIF, ('CURRENCY') : CURRENCY, ('PRODUCT') : PRODUCT], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.closeWindowIndex(5)

    WebUI.switchToWindowIndex(4)

    System.out.println('SUCCESS')
}

for (def i = 1; i <= CA; i++) {
    WebUI.maximizeWindow()

    CATEGORY = 'Accounts'

    GROUP = 'Current Accounts'

    PRODUCT = 'DDA Regular'

    WebUI.callTestCase(findTestCase('500/Account and Deposit/TC_Select_Product_Catalog'), [('CATEGORY') : CATEGORY, ('GROUP') : GROUP
            , ('PRODUCT') : PRODUCT], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('500/Account and Deposit/TC_Create CASA - KOMO'), [('CIF') : CIF, ('CURRENCY') : CURRENCY, ('PRODUCT') : PRODUCT], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.closeWindowIndex(5)

    WebUI.switchToWindowIndex(4)

    System.out.println('SUCCESS')
}

for (def i = 1; i <= PA; i++) {
    WebUI.maximizeWindow()

    CATEGORY = 'Accounts'

    GROUP = 'Prepaid Account'

    PRODUCT = 'General Purpose Prepaid'

    WebUI.callTestCase(findTestCase('500/Account and Deposit/TC_Select_Product_Catalog'), [('CATEGORY') : CATEGORY, ('GROUP') : GROUP
            , ('PRODUCT') : PRODUCT], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('500/Account and Deposit/TC_Create CASA - KOMO'), [('CIF') : CIF, ('CURRENCY') : CURRENCY, ('PRODUCT') : PRODUCT], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.closeWindowIndex(5)

    WebUI.switchToWindowIndex(4)

    System.out.println('SUCCESS')
}

for (def i = 1; i <= TD; i++) {
    WebUI.maximizeWindow()

    CATEGORY = 'Deposits'

    GROUP = 'FCY DEPOSITS'

    //GROUP = 'FCY DEPOSITS'
    PRODUCT = 'Time Deposit - FCDU'

    //PRODUCT = 'Time Deposit - FCDU'
    WebUI.callTestCase(findTestCase('500/Account and Deposit/TC_Select_Product_Catalog'), [('CATEGORY') : CATEGORY, ('GROUP') : GROUP
            , ('PRODUCT') : PRODUCT], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('500/Account and Deposit/TC_Create Time Deposit - PHP'), [('CIF') : CIF, ('CURRENCY') : CURRENCY
            , ('PRODUCT') : PRODUCT, ('PAY_IN') : PAY_IN, ('PAY_OUT') : PAY_OUT], FailureHandling.STOP_ON_FAILURE)

    /*WebUI.callTestCase(findTestCase('500/Account and Deposit/TC_Create Time Deposit - USD or OC'), [('CIF') : CIF, ('CURRENCY') : CURRENCY
		, ('PRODUCT') : PRODUCT,('PAY_IN') : PAY_IN, ('PAY_OUT') : PAY_OUT ], FailureHandling.STOP_ON_FAILURE)*/
    WebUI.closeWindowIndex(5)

    WebUI.switchToWindowIndex(4)

    System.out.println('SUCCESS')
}

