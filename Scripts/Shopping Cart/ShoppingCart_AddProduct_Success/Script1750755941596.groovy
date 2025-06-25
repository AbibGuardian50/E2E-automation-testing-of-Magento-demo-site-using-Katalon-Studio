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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.openBrowser('')

WebUI.navigateToUrl('https://magento.softwaretestingboard.com/')

WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Home Page/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Shopping Cart/Page_Customer Login/input_Email_loginusername'), 'validtest@email.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Shopping Cart/Page_Customer Login/input_Password_loginpassword'), 
    'stN/TboW5edfPsNvh3vqcA==')

WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Customer Login/span_Sign In'))

WebUI.navigateToUrl('https://magento.softwaretestingboard.com/checkout/cart/')

if (WebUI.verifyElementPresent(findTestObject('Shopping Cart/Page_Shopping Cart/form_Shopping Cart Items                                                Item                    Price                    Qty                    Subtotal'), 5, FailureHandling.OPTIONAL)) {
    println 'Cart is not empty, starting to remove items...'
    
    while (WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping Cart/Page_Shopping Cart/a_Remove item'), 3, FailureHandling.OPTIONAL)) {
        WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Shopping Cart/a_Remove item'))
        
        // Tambahkan delay sedikit agar halaman sempat refresh
        WebUI.delay(1)
    }

    println 'All items removed from the cart.'
    
} else {
    println 'Cart is already empty, proceeding...'
}


WebUI.navigateToUrl('https://magento.softwaretestingboard.com/argus-all-weather-tank.html')

WebUI.verifyElementPresent(findTestObject('Page_Shopping Cart/a_My Cart                    1                                        1                items'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping Cart/Page_Argus All-Weather Tank/span_Argus All-Weather Tank'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping Cart/Page_Argus All-Weather Tank/a_Be the first to review this product'), 
    0)

WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Argus All-Weather Tank/div_XL'))

WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Argus All-Weather Tank/div_Color_option-label-color-93-item-52'))

WebUI.setText(findTestObject('Object Repository/Shopping Cart/Page_Argus All-Weather Tank/input_Qty_qty'), '4')

WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Argus All-Weather Tank/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Argus All-Weather Tank/div_You added Argus All-Weather Tank to you_3a70b3'))

WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Argus All-Weather Tank/a_My Cart                    4             _2292c1'))

WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Argus All-Weather Tank/span_View and Edit Cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping Cart/Page_Shopping Cart/span_Price'), 0)

WebUI.rightClick(findTestObject('Object Repository/Shopping Cart/Page_Shopping Cart/span_22.00'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping Cart/Page_Shopping Cart/span_22.00'), 0)

WebUI.verifyElementPresent(findTestObject('Shopping Cart/Page_Shopping Cart/span_4                                        4                items'), 
    0)

WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Shopping Cart/span_88.00'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping Cart/Page_Shopping Cart/span_88.00'), 0)

