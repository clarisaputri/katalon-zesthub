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

WebUI.navigateToUrl('https://hr.zesthub.my.id/login')

WebUI.setText(findTestObject('Object Repository/Leave Submission/input_Email_email'), 'itstrategystaff@unifam.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Leave Submission/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Leave Submission/button_Log In'))

WebUI.click(findTestObject('Object Repository/Leave Submission/a_Leave Management'))

WebUI.click(findTestObject('Object Repository/Leave Submission/a_Request'))

WebUI.click(findTestObject('Object Repository/Leave Submission/a_Create'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Leave Submission/select_Full Day                            _eaf6fa'), 
    'Half Day', true)

WebUI.click(findTestObject('Object Repository/Leave Submission/div_Request Type                           _35be42'))

WebUI.click(findTestObject('Object Repository/Leave Submission/input_Date_date'))

WebUI.click(findTestObject('Object Repository/Leave Submission/td_12'))

WebUI.click(findTestObject('Object Repository/Leave Submission/input_Date_date'))

WebUI.click(findTestObject('Object Repository/Leave Submission/input_Date_time_start'))

WebUI.click(findTestObject('Object Repository/Leave Submission/input_Date_date'))

WebUI.click(findTestObject('Object Repository/Leave Submission/div_Date'))

WebUI.setText(findTestObject('Object Repository/Leave Submission/input_Date_date'), '')

WebUI.click(findTestObject('Object Repository/Leave Submission/td_2'))

WebUI.click(findTestObject('Object Repository/Leave Submission/input_Date_time_start'))

WebUI.click(findTestObject('Object Repository/Leave Submission/a_0000'))

WebUI.setText(findTestObject('Object Repository/Leave Submission/textarea_Reason_reason'), 'cuti')

WebUI.click(findTestObject('Object Repository/Leave Submission/button_Save'))

WebUI.click(findTestObject('Object Repository/Leave Submission/button_OK'))

WebUI.closeBrowser()

