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

keyCtrl = Keys.CONTROL

if (user == '') {
    // Click vao input
    WebUI.click(findTestObject('Object Repository/New Folder/Page_9Pay/input_username'))

    // Xoa text bang Ctrl A
    WebUI.sendKeys(findTestObject('Object Repository/New Folder/Page_9Pay/input_username'), Keys.chord(keyCtrl, 'a'))

    WebUI.sendKeys(findTestObject('Object Repository/New Folder/Page_9Pay/input_username'), Keys.chord(Keys.BACK_SPACE))
} else {
    WebUI.click(findTestObject('Object Repository/New Folder/Page_9Pay/input_username'))

    WebUI.sendKeys(findTestObject('Object Repository/New Folder/Page_9Pay/input_username'), Keys.chord(keyCtrl, 'a'))

    WebUI.sendKeys(findTestObject('Object Repository/New Folder/Page_9Pay/input_username'), Keys.chord(Keys.BACK_SPACE))

    WebUI.sendKeys(findTestObject('Object Repository/New Folder/Page_9Pay/input_username'), user)
}

inputPass = findTestObject('Object Repository/New Folder/Page_9Pay/input_password')

WebUI.click(inputPass)

WebUI.sendKeys(inputPass, Keys.chord(keyCtrl, 'a'))

WebUI.sendKeys(inputPass, Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(inputPass, passWord)

WebUI.click(findTestObject('Login/span_ng nhp'))

WebUI.delay(2)

if (user == '9pay') {
    WebUI.verifyElementVisible(findTestObject('Page_9Pay/button_OK'))
	WebUI.click(findTestObject('Page_9Pay/button_OK'))
	
} else {
    WebUI.verifyTextPresent(validateResult, false)
}

WebUI.executeJavaScript("localStorage.setItem('device-id-9Service', 'T2WO9-EALAY-YBACF-7505W')", null)


currentURL = WebUI.getUrl()

if (currentURL == 'https://dev-mc.9pay.mobi/') {
	elementTitle = WebUI.getText(findTestObject('Object Repository/Page_Dashboard/a_Sign out'))
	WebUI.verifyEqual(elementTitle, 'Sign out')
	
	WebUI.click(findTestObject('Object Repository/Page_Dashboard/img_USD balance_rounded-1'))
	
	WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Ting vit'))
	
}




