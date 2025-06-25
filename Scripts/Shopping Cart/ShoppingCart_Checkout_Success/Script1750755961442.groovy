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

WebUI.callTestCase(findTestCase('Shopping Cart/ShoppingCart_AddProduct_Success'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/Page_Shopping Cart/button_Proceed to Checkout'))

if (WebUI.verifyElementPresent(findTestObject('Shopping Cart/Page_Checkout/div_testing     valid     123 Main Street, Anytown, USA, 12345    Washington, Washington 12345    United States    1 234 567 890                Edit'), 
    0)) {
    WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Checkout/td_Fixed'))

    WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Checkout/td_Table Rate'))

    WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Checkout/span_Next'))
} else {
    WebUI.doubleClick(findTestObject('Object Repository/Shopping Cart/Page_Checkout/input_First Name_firstname'))

    WebUI.setText(findTestObject('Object Repository/Shopping Cart/Page_Checkout/input_First Name_firstname'), 'testing')

    WebUI.setText(findTestObject('Object Repository/Shopping Cart/Page_Checkout/input_Last Name_lastname'), 'valid')

    WebUI.setText(findTestObject('Object Repository/Shopping Cart/Page_Checkout/input_Company_company'), 'valid corp')

    WebUI.setText(findTestObject('Object Repository/Shopping Cart/Page_Checkout/input_Street Address Line 1_street0'), '')

    WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Checkout/input_Street Address Line 1_street0'))

    WebUI.setText(findTestObject('Object Repository/Shopping Cart/Page_Checkout/input_Street Address Line 1_street0'), '123 Main Street, Anytown, USA, 12345')

    WebUI.setText(findTestObject('Object Repository/Shopping Cart/Page_Checkout/input_City_city'), 'Washington')

    WebUI.selectOptionByValue(findTestObject('Object Repository/Shopping Cart/Page_Checkout/select_Please select a region, state or pro_d80c8a'), 
        '62', true)

    WebUI.setText(findTestObject('Object Repository/Shopping Cart/Page_Checkout/input_ZipPostal Code_postcode'), '12345')

    WebUI.setText(findTestObject('Object Repository/Shopping Cart/Page_Checkout/input_Phone Number_telephone'), '+1 234 567 890')

    WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Checkout/input_Carrier Title_ko_unique_5'))
}

WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Checkout/span_My billing and shipping address are the same'))

WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Checkout/input_Check  Money order_billing-address-sa_4ac8d0'))

WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Checkout/input_Check  Money order_billing-address-sa_4ac8d0'))

WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Checkout/input_Check  Money order_billing-address-sa_4ac8d0'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Shopping Cart/Page_Checkout/div_testing     valid     123 Main Street, _f607a9'), 
    0)

WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Checkout/div_4            Item in Cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping Cart/Page_Checkout/span_Shipping Method'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping Cart/Page_Checkout/span_Best Way - Table Rate'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping Cart/Page_Checkout/div_Argus All-Weather Tank                 _5d7c09'), 
    0)

WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Checkout/span_Place Order'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping Cart/Page_Success Page/div_Thank you for your purchase            _912305'), 
    0)

WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Success Page/a_Print receipt'))

WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Order  000060128/div_Items Ordered                          _8ea970'))

WebUI.takeFullPageScreenshot()

