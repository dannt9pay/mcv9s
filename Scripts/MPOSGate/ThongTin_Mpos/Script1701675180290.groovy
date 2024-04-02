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

WebUI.waitForElementVisible(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control card-shop__info'), 
    2)

keyCtrl = Keys.CONTROL

if (nameShop == '') {
    // Click vao input
    WebUI.click(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control card-shop__info'))

    // Xoa text bang Ctrl A
    WebUI.sendKeys(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control card-shop__info'), 
        Keys.chord(keyCtrl, 'a'))

    WebUI.sendKeys(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control card-shop__info'), 
        Keys.chord(Keys.BACK_SPACE))
} else {
    WebUI.click(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control card-shop__info'))

    WebUI.sendKeys(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control card-shop__info'), 
        Keys.chord(keyCtrl, 'a'))

    WebUI.sendKeys(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control card-shop__info'), 
        Keys.chord(Keys.BACK_SPACE))

    WebUI.sendKeys(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control card-shop__info'), 
        nameShop)
}

inputPhone = findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control card-shop__info_1')

WebUI.click(inputPhone)

WebUI.sendKeys(inputPhone, Keys.chord(keyCtrl, 'a'))

WebUI.sendKeys(inputPhone, Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(inputPhone, fone)

inputEmail = findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control card-shop__info_1_2')

WebUI.click(inputEmail)

WebUI.sendKeys(inputEmail, Keys.chord(keyCtrl, 'a'))

WebUI.sendKeys(inputEmail, Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(inputEmail, email)

inputAddr = findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control card-shop__info_1_2_3')

WebUI.click(inputAddr)

WebUI.sendKeys(inputAddr, Keys.chord(keyCtrl, 'a'))

WebUI.sendKeys(inputAddr, Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(inputAddr, adress)

inputDesViet = findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/textarea_form-control card-shop__info')

WebUI.click(inputDesViet)

WebUI.sendKeys(inputDesViet, Keys.chord(keyCtrl, 'a'))

WebUI.sendKeys(inputDesViet, Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(inputDesViet, des_Viet)

inputDesEn = findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/textarea_form-control card-shop__info_1')

WebUI.click(inputDesEn)

WebUI.sendKeys(inputDesEn, Keys.chord(keyCtrl, 'a'))

WebUI.sendKeys(inputDesEn, Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(inputDesEn, des_En)

inputLink = findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control inp-link')

//WebUI.click(inputLink)
//
//WebUI.sendKeys(inputLink, Keys.chord(keyCtrl, 'a'))
//
//WebUI.sendKeys(inputLink, Keys.chord(Keys.BACK_SPACE))
//
//WebUI.sendKeys(inputLink, link)

WebUI.scrollToElement(findTestObject('New Folder/Page_Thng tin Mpos/span_Cp nht'), 0)

WebUI.mouseOver(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/span_Cp nht'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/span_Cp nht'))

//	WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Thng tin Mpos/div_Cp nht MPOS thnh cngOKNoCancel'), 10)

WebUI.delay(2)

//Scroll to topup
String script = 'window.scrollTo(0, 0);'

WebUI.executeJavaScript(script, null)

WebUI.verifyTextPresent(validateResult, false)

