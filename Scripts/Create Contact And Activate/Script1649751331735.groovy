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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://org32cb6c3c.crm8.dynamics.com/main.aspx?appid=7a81cf22-33b3-ec11-983f-000d3a0a84fb&forceUCI=1&pagetype=dashboard&id=eaa6e6bb-4712-ec11-b6e7-00224820f09b&type=system&_canOverride=true')

WebUI.setText(findTestObject('Object Repository/Create Contact And Activate/Page_Sign in to your account/input_Sign in_loginfmt'), 
    'bhagyeshnanwani22@gmail.com')

WebUI.click(findTestObject('Object Repository/Create Contact And Activate/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Create Contact And Activate/Page_Sign in to your Microsoft account/input_Enter password_passwd'), 
    'cJZAETvQhHiAF6pCLCMhah1wzavccz+8')

WebUI.click(findTestObject('Object Repository/Create Contact And Activate/Page_Sign in to your Microsoft account/input_Forgotten your password_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Create Contact And Activate/Page_Microsoft account/input_concat(Don, , t show this again)_idBtn_Back'))

WebUI.click(findTestObject('Object Repository/Create Contact And Activate/Page_Sales dashboard -/i_'))

WebUI.click(findTestObject('Object Repository/Create Contact And Activate/Page_Sales dashboard -/span_Contacts'))

WebUI.click(findTestObject('Object Repository/Create Contact And Activate/Page_Contacts My Active Contacts - Dynamics 365/img_Show Chart_pa-dt pa-du pa-ds pa-dv'))

WebUI.setText(findTestObject('Object Repository/Create Contact And Activate/Page_Contacts My Active Contacts - Dynamics 365/input_First Name_id-661157fe-2fc9-4eaa-835f_21e048'), 
    'Alex')

WebUI.setText(findTestObject('Object Repository/Create Contact And Activate/Page_Contacts My Active Contacts - Dynamics 365/input_Last Name_id-661157fe-2fc9-4eaa-835f-_038829'), 
    'Nanwani')

WebUI.setText(findTestObject('Object Repository/Create Contact And Activate/Page_Contacts My Active Contacts - Dynamics 365/input_Job Title_id-661157fe-2fc9-4eaa-835f-_4f964c'), 
    'Solutions Consultant')

WebUI.setText(findTestObject('Object Repository/Create Contact And Activate/Page_Contacts My Active Contacts - Dynamics 365/input_Account Name_id-661157fe-2fc9-4eaa-83_9727fb'), 
    'Katalon')

WebUI.click(findTestObject('Object Repository/Create Contact And Activate/Page_Contacts My Active Contacts - Dynamics 365/li_Katalon'))

WebUI.click(findTestObject('Object Repository/Create Contact And Activate/Page_Contacts My Active Contacts - Dynamics 365/input_Mobile Phone_id-661157fe-2fc9-4eaa-83_b45ba1'))

WebUI.setText(findTestObject('Object Repository/Create Contact And Activate/Page_Contacts My Active Contacts - Dynamics 365/input_Email_id-661157fe-2fc9-4eaa-835f-5bfa_72c7b8'), 
    'alex@gmail.com')

WebUI.setText(findTestObject('Object Repository/Create Contact And Activate/Page_Contacts My Active Contacts - Dynamics 365/input_Mobile Phone_id-661157fe-2fc9-4eaa-83_b45ba1'), 
    '90291345843')

WebUI.click(findTestObject('Object Repository/Create Contact And Activate/Page_Contacts My Active Contacts - Dynamics 365/input_Business Phone_id-661157fe-2fc9-4eaa-_9b319e'))

WebUI.setText(findTestObject('Create Contact And Activate/Page_Contacts My Active Contacts - Dynamics 365/textarea_O'), 
    'Our Point of contact from Katalon')

WebUI.setText(findTestObject('Object Repository/Create Contact And Activate/Page_Contacts My Active Contacts - Dynamics 365/input_Street 1_id-661157fe-2fc9-4eaa-835f-5_77c00c'), 
    'Mahesh Apt, Wing-A')

WebUI.setText(findTestObject('Object Repository/Create Contact And Activate/Page_Contacts My Active Contacts - Dynamics 365/input_Street 2_id-661157fe-2fc9-4eaa-835f-5_3bc72e'), 
    'Peters steet')

WebUI.setText(findTestObject('Object Repository/Create Contact And Activate/Page_Contacts My Active Contacts - Dynamics 365/input_City_id-661157fe-2fc9-4eaa-835f-5bfa2_f66584'), 
    'Mumbai')

WebUI.setText(findTestObject('Object Repository/Create Contact And Activate/Page_Contacts My Active Contacts - Dynamics 365/input_ZIPPostal Code_id-661157fe-2fc9-4eaa-_8709e9'), 
    '3029304')

WebUI.click(findTestObject('Object Repository/Create Contact And Activate/Page_Contacts My Active Contacts - Dynamics 365/span_Save and Close'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Create Contact And Activate/Page_Contacts My Active Contacts - Dynamics 365/i_'))

WebUI.click(findTestObject('Object Repository/Create Contact And Activate/Page_Contacts My Active Contacts - Dynamics 365/span_Activate'))

WebUI.click(findTestObject('Object Repository/Create Contact And Activate/Page_Contacts My Active Contacts - Dynamics 365/button_Activate'))

