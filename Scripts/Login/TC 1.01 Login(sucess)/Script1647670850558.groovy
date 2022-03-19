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

WebUI.navigateToUrl('http://alumni5.cyberlifecafe.com/?fbclid=IwAR3P-h9U9zGaKHgBgDob_JHaCkp3-ecrgIU2AQKilyeiQwrQ99UTwm0QlO0')

WebUI.click(findTestObject('Object Repository/Page_Home/span_Login_glyphicon glyphicon-log-in'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input__id'), '634259027')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input__passwords'), 'ief1bhZxSoD5d4GYmJy9BQ==')

<<<<<<< HEAD:Scripts/Login/TC 1.01 Login(sucess)/Script1647670850558.groovy
WebUI.click(findTestObject('Object Repository/Page_Login Page/button_'))
=======
WebUI.verifyTextPresent('Dashboard', false)

WebUI.takeScreenshot('D:\\TC01Login.png')

WebUI.click(findTestObject('Page_OrangeHRM/a_Welcome'))
>>>>>>> cd9f8c8f88dc859d5690b22d549699d90b67de7b:Scripts/TC 1.01 Login(success DataDrivenTesting)/Script1644896069464.groovy

WebUI.closeBrowser()

WebUI.closeBrowser()

