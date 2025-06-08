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

TestData loginData = findTestData('Invalid Credentials Login Data')

int rowCount = loginData.getRowNumbers()

for (int i = 1; i <= rowCount; i++) {
    WebUI.openBrowser('')

    WebUI.navigateToUrl('https://magento.softwaretestingboard.com/')

    WebUI.click(findTestObject('Object Repository/Login/Page_Home Page/a_Sign In'))

    WebUI.setText(findTestObject('Object Repository/Login/Page_Customer Login/input_Email_loginusername'), loginData.getValue(
            'Email', i))

    WebUI.setText(findTestObject('Login/Page_Customer Login/input_Password_loginpassword'), loginData.getValue('Password', 
            i))

    WebUI.click(findTestObject('Object Repository/Login/Page_Customer Login/span_Sign In'))

    WebUI.waitForElementVisible(findTestObject('Login/Page_Customer Login/div_The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later'), 
        10)

    WebUI.click(findTestObject('Login/Page_Customer Login/div_The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later'))

    WebUI.closeBrowser()
}

