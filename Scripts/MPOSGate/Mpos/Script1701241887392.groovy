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

//WebUI.waitForElementVisible(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control card-shop__info'), 
//    5)
WebUI.waitForPageLoad(5)

WebUI.delay(2)

if (nameShop == '') {
    // Click vao input
    WebUI.click(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control card-shop__info'))

    // Xoa text bang Ctrl A
    WebUI.sendKeys(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control card-shop__info'), 
        Keys.chord(Keys.CONTROL, 'a'))

    WebUI.sendKeys(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control card-shop__info'), 
        Keys.chord(Keys.BACK_SPACE) // Click vao input
        ) // Xoa text bang Ctrl A
    // Type text to input
} else {
    WebUI.click(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control card-shop__info'))

    WebUI.sendKeys(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control card-shop__info'), 
        Keys.chord(Keys.CONTROL, 'a'))

    WebUI.sendKeys(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control card-shop__info'), 
        Keys.chord(Keys.BACK_SPACE))

    WebUI.sendKeys(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control card-shop__info'), 
        nameShop)
}

WebUI.click(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control card-shop__info_1'))

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control card-shop__info_1'), '')

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control card-shop__info_1'), fone)

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control card-shop__info_1_2'), 
    '')

WebUI.sendKeys(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control card-shop__info_1_2'), 
    email)

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control card-shop__info_1_2_3'), 
    '')

WebUI.sendKeys(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control card-shop__info_1_2_3'), 
    adress)

WebUI.sendKeys(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/textarea_form-control card-shop__info'), 
    des_Viet)

WebUI.sendKeys(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/textarea_form-control card-shop__info_1'), 
    des_En)

WebUI.sendKeys(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control inp-link'), link)

WebUI.click(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/span_Cp nht'))

//Scroll to topup
String script = 'window.scrollTo(0, 0);'
WebUI.executeJavaScript(script, null)

WebUI.delay(2)

WebUI.verifyTextPresent('Cập nhật MPOS thành công!', false)

