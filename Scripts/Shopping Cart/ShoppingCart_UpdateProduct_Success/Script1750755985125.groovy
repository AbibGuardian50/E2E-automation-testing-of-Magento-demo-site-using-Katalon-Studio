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

WebUI.navigateToUrl('https://magento.softwaretestingboard.com/wayfarer-messenger-bag.html')

WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping Cart/Page_Wayfarer Messenger Bag/span_Wayfarer Messenger Bag'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping Cart/Page_Wayfarer Messenger Bag/span_45.00'), 0)

WebUI.setText(findTestObject('Object Repository/Shopping Cart/Page_Wayfarer Messenger Bag/input_Qty_qty'), '6')

WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Wayfarer Messenger Bag/button_Add to Cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping Cart/Page_Wayfarer Messenger Bag/div_You added Wayfarer Messenger Bag to you_1c53f2'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping Cart/Page_Wayfarer Messenger Bag/div_You added Wayfarer Messenger Bag to you_1c53f2_1'), 
    0)

WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Wayfarer Messenger Bag/a_My Cart                    10            _c953c4'))

WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Wayfarer Messenger Bag/span_View and Edit Cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping Cart/Page_Shopping Cart/a_Argus All-Weather Tank'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping Cart/Page_Shopping Cart/a_Wayfarer Messenger Bag'), 
    0)

