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

WebUI.openBrowser('https://hr.zesthub.my.id/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Leave Approval/input_Email_email'), 'haryo@unifam.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Leave Approval/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Leave Approval/button_Log In'))

WebUI.click(findTestObject('Object Repository/Leave Approval/a_Leave Management'))

WebUI.click(findTestObject('Object Repository/Leave Approval/a_Approval'))

WebUI.click(findTestObject('Object Repository/Leave Approval/input_Date_start_date'))

WebUI.click(findTestObject('Object Repository/Leave Approval/td_1'))

WebUI.click(findTestObject('Object Repository/Leave Approval/input_Date_end_date'))

WebUI.click(findTestObject('Object Repository/Leave Approval/td_28'))

WebUI.setText(findTestObject('Object Repository/Leave Approval/input_Search_form-control form-control-sm'), 'clarisa')

WebUI.click(findTestObject('Object Repository/Leave Approval/a_Reject'))

WebUI.setText(findTestObject('Object Repository/Leave Approval/input__reason'), 'denied')

WebUI.click(findTestObject('Object Repository/Leave Approval/button_OK'))

WebUI.navigateToUrl('https://hr.zesthub.my.id/leave-management/leave-approval')

