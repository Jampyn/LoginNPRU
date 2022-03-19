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

WebUI.click(findTestObject('Object Repository/Page_Home/a_Register'))

WebUI.setText(findTestObject('Object Repository/Page_Register/input__fname'), 'ปุณยนุช')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__lname'), 'ดิษสมาน')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__id'), '634259027')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__school_years'), '2563')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__groups'), '63/50')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__days'), '5')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__months'), 'กุมภาพันธ์')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__years'), '2565')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__kanas'), 'วิทย์')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__sakhas'), 'วิศวกรรมซอฟต์แวร์')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__addresss'), '40/5')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__provinces'), 'นครปฐม')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__post_codes'), '73000')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__phone'), '0902851055')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__emai'), 'jamjung230559@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input__passwords'), 'ief1bhZxSoD5d4GYmJy9BQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input__confpassword'), 'ief1bhZxSoD5d4GYmJy9BQ==')

WebUI.click(findTestObject('Object Repository/Page_Register/button_'))

WebUI.closeBrowser()