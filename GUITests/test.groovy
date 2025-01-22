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

import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver
import com.kms.katalon.core.webui.driver.DriverFactory

def capabilities = new DesiredCapabilities()
capabilities.setCapability('browserName', 'chrome') // e.g., chrome, firefox, safari
capabilities.setCapability('platformName', 'Windows 10') // Use 'platformName' instead of 'platform'

def sauceOptions = [
	'name': 'My Katalon Test', // Test name
	'build': 'Build 1.0', // Build identifier
	'screenResolution': '1920x1080', // Screen resolution
	'seleniumVersion': '3.141.59', // Selenium version
	'version': 'latest', // Browser version
	'extendedDebugging': true
]
capabilities.setCapability('sauce:options', sauceOptions)

def sauceUsername = 'oauth-rickhousemen2-01e68'
def sauceAccessKey = '38b39e32-c7f2-4f23-aefd-29570df5a412'

def sauceUrl = "https://oauth-rickhousemen2-01e68:38b39e32-c7f2-4f23-aefd-29570df5a412@ondemand.eu-central-1.saucelabs.com:443/wd/hub"
WebDriver driver = new RemoteWebDriver(new URL(sauceUrl), capabilities)

// Set the driver in Katalon
DriverFactory.changeWebDriver(driver)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demowebshop.tricentis.com/')

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_Email_Email'), 'Rickyhousemen@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_Password_Password'), '1HlznLksjVeZKyuPlibM8g==')

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_Forgot password_button-1 login-button'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop/input_You have no items in your shopping cart_q'), 'Smartphone')

WebUI.sendKeys(findTestObject('Object Repository/Page_Demo Web Shop/input_You have no items in your shopping cart_q'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Search/input_Newest Tricentis smartphone_button-2 _a164c3'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Search/input_Newest Tricentis smartphone_button-2 _a164c3'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Search/input_Newest Tricentis smartphone_button-2 _a164c3'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Search/input_Sub-Total_q'), 'blue jeans')

WebUI.sendKeys(findTestObject('Object Repository/Page_Demo Web Shop. Search/input_Sub-Total_q'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Search/input_Newest Tricentis smartphone_button-2 _a164c3'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Search/input_Newest Tricentis smartphone_button-2 _a164c3'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Search/a_Shopping cart                    (5)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Demo Web Shop. Shopping Cart/strong_302.00'), '302.00')

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Shopping Cart/input_Remove_removefromcart'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Shopping Cart/input_Remove_removefromcart_1'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Shopping Cart/input_Total_updatecart'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Shopping Cart/a_Log out'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Demo Web Shop/a_Log in'), 'Log in')

WebUI.closeBrowser()
