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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demowebshop.tricentis.com/')

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_Email_Email'), 'Rickyhousemen@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_Password_Password'), '1HlznLksjVeZKyuPlibM8g==')

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_Forgot password_button-1 login-button'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop/input_You have no items in your shopping cart_q'), 'blue jeans')

WebUI.sendKeys(findTestObject('Object Repository/Page_Demo Web Shop/input_You have no items in your shopping cart_q'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Search/div_Blue Jeans                             _82ef6f'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Search/input_Jeans_button-2 product-box-add-to-car_50ee1e'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Search/input_Sub-Total_q'), 'smartphone')

WebUI.sendKeys(findTestObject('Object Repository/Page_Demo Web Shop. Search/input_Sub-Total_q'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Search/input_Jeans_button-2 product-box-add-to-car_50ee1e'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Search/span_Shopping cart'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Demo Web Shop. Shopping Cart/strong_101.00'), '101.00')

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Shopping Cart/input_Remove_removefromcart'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Shopping Cart/input_Remove_removefromcart_1'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Shopping Cart/input_Total_updatecart'))

WebUI.closeBrowser()

