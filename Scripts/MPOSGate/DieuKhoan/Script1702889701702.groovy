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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Mpos/div_VND'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Mpos/Page_Mpos/li_EUR'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Mpos/a_iu khon v iu kin'))

WebUI.delay(3)

url = WebUI.getUrl()

WebUI.switchToWindowUrl('https://dev-mpos.9pay.mobi/hmc')

keyCtrl = Keys.CONTROL

inputBill = findTestObject('Object Repository/ThanhToan/Page_Mpos/input_form-control mt-5 ant-input')

inputDes = findTestObject('Object Repository/ThanhToan/Page_Mpos/textarea_form-control mt-3 description ant-input')

button = findTestObject('Object Repository/ThanhToan/Page_Mpos/button_Thanh ton')


WebUI.click(inputDes)

WebUI.sendKeys(inputDes, Keys.chord(keyCtrl, 'a'))

WebUI.sendKeys(inputDes, Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(inputDes, url)

WebUI.delay(1)

WebUI.click(inputDes)

WebUI.sendKeys(inputDes, Keys.chord(keyCtrl, 'a'))

WebUI.sendKeys(inputDes, Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(inputDes, 'ninh')

WebUI.click(inputBill)

WebUI.sendKeys(inputBill, Keys.chord(keyCtrl, 'a'))

WebUI.sendKeys(inputBill, Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(inputBill, '5000')

WebUI.click(button)

WebUI.verifyTextPresent('Chọn phương thức thanh toán', false)

