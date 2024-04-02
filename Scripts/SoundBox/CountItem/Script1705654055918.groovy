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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By

WebUI.setViewPortSize(1920, 1080)

WebUI.click(findTestObject('Object Repository/Page_SoundBox  Danh sch ti khon VA  thit b Soundbox/span_To nhiu VA'))

WebUI.setText(findTestObject('Object Repository/Page_SoundBox  To Virtual Account/input_Tn ti khon_uname'), TenTaiKhoan)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SoundBox  To Virtual Account/input_-_limit'), SoLuong)

WebUI.click(findTestObject('Object Repository/Page_SoundBox  To Virtual Account/button_Xc nhn'))

WebUI.verifyTextPresent(Mess, false)

if (WebUI.verifyTextPresent('Tạo thành công', false)) {
	
	String condition = TenTaiKhoan
	
	println("Tên tài khoản: $condition")
	
	int count = 0
	
	datas_table = WebUI.findWebElements(findTestObject('Object Repository/SoundBox/Page_SoundBox  ng nhp/ListVA'), 0)
	
	datas_table.each({ def element ->
			List<WebElement> cells = element.findElements(By.tagName('td'))
	
			// Kiểm tra giá trị Tên tài khoản
				String text = cells.get(5).getText()
				println("Text get : $text")
	
				if ((text != null) && text.contains(condition)) {
					count++
					println("Số lượng bản ghi: $count")
				}
	})
	
	WebUI.verifyEqual(SoLuong, count)
}



