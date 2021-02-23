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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://hr.zesthub.my.id/login')

WebUI.setText(findTestObject('Object Repository/input_Email_email'), 'clarisa@unifam.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_ZestHub HR/a_Overtime'))

WebUI.click(findTestObject('Page_ZestHub HR/a_Request'))

WebUI.navigateToUrl('https://hr.zesthub.my.id/overtime/request')

WebUI.click(findTestObject('Object Repository/Page_ZestHub HR/a_Create'))

WebUI.click(findTestObject('Object Repository/Page_ZestHub HR/input_Date_date'))

WebUI.click(findTestObject('Object Repository/Page_ZestHub HR/td_24'))

WebUI.setText(findTestObject('Object Repository/Page_ZestHub HR/input_Time Request_hour'), '4')

WebUI.setText(findTestObject('Object Repository/input_Hour_minute'), '0')

WebUI.setText(findTestObject('Object Repository/textarea_Description_description'), 'Lembur')

WebUI.click(findTestObject('Object Repository/Page_ZestHub HR/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_ZestHub HR/button_OK'))

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Page_ZestHub HR/img_IT Strategy Staff_rounded-circle'))

WebUI.click(findTestObject('Object Repository/Page_ZestHub HR/i_Logout_dripicons-exit text-muted'))

WebUI.navigateToUrl('https://hr.zesthub.my.id/login')

WebUI.closeBrowser()

