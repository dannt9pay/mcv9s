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

WebUI.waitForElementVisible(findTestObject('Menu/span_Qun l dch v'), 0)

WebUI.click(findTestObject('Menu/span_Qun l dch v'))

WebUI.waitForElementVisible(findTestObject('Menu/a_MPOS'), 0)

WebUI.click(findTestObject('Menu/a_MPOS'))

//
//WebUI.setText(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control card-shop__info'), nameShop)
//
//WebUI.setText(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control card-shop__info_1'), fone)
//
//WebUI.setText(findTestObject('Object Repository/New Folder/Page_Thng tin Mpos/input_form-control card-shop__info_1_2'), 
//    email)
WebUI.delay(5)

