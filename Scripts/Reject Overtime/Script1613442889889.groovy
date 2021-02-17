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

WebUI.setText(findTestObject('Object Repository/Approval overtimew/input_Email_email'), 'itstrategyspc@unifam.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Approval overtimew/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Approval overtimew/button_Log In'))

WebUI.click(findTestObject('Approval overtimew/a_Overtime'))

WebUI.click(findTestObject('Approval overtimew/a_Approval'))

WebUI.click(findTestObject('Object Repository/Approval overtimew/input_Date_start_date'))

WebUI.click(findTestObject('Object Repository/Approval overtimew/td_1'))

WebUI.click(findTestObject('Object Repository/Approval overtimew/input_Date_end_date'))

WebUI.click(findTestObject('Object Repository/Approval overtimew/td_28'))

WebUI.click(findTestObject('Object Repository/Approval overtimew/span_Waiting'))

WebUI.setText(findTestObject('Object Repository/Approval overtimew/input_Search_form-control form-control-sm'), 'staff')

WebUI.scrollToPosition(900, 900)

WebUI.click(findTestObject('Approval overtimew/a_Reject'))

WebUI.setText(findTestObject('Object Repository/Approval overtimew/input__reason'), 'Gaboleh Lembur')

WebUI.click(findTestObject('Object Repository/Approval overtimew/button_OK'))

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Approval overtimew/span_Rejected'))

WebUI.navigateToUrl('https://hr.zesthub.my.id/overtime/approval')

WebUI.closeBrowser()

