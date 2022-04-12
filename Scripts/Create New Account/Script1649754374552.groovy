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

WebUI.navigateToUrl('https://org32cb6c3c.crm8.dynamics.com/main.aspx?appid=7a81cf22-33b3-ec11-983f-000d3a0a84fb&forceUCI=1&pagetype=dashboard&id=eaa6e6bb-4712-ec11-b6e7-00224820f09b&type=system&_canOverride=true')

WebUI.setText(findTestObject('Object Repository/Create New Account/Page_Sign in to your account/input_Sign in_loginfmt'), 
    'bhagyeshnanwani22@gmail.com')

WebUI.click(findTestObject('Object Repository/Create New Account/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Create New Account/Page_Sign in to your Microsoft account/input_Enter password_passwd'), 
    'cJZAETvQhHiAF6pCLCMhah1wzavccz+8')

WebUI.click(findTestObject('Object Repository/Create New Account/Page_Sign in to your Microsoft account/input_Forgotten your password_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Create New Account/Page_Microsoft account/input_concat(Don, , t show this again)_idBtn_Back'))

WebUI.click(findTestObject('Object Repository/Create New Account/Page_Sales dashboard - Dynamics 365/i_'))

WebUI.click(findTestObject('Object Repository/Create New Account/Page_Sales dashboard - Dynamics 365/span_Accounts'))

WebUI.click(findTestObject('Object Repository/Create New Account/Page_Accounts My Active Accounts - Dynamics 365/img_Show Chart_pa-dt pa-du pa-ds pa-dv'))

WebUI.setText(findTestObject('Object Repository/Create New Account/Page_Accounts My Active Accounts - Dynamics 365/input_Account Name_id-c9e7ec2d-efca-4e4c-b3_3f4614'), 
    'Katalon')

WebUI.setText(findTestObject('Object Repository/Create New Account/Page_Accounts My Active Accounts - Dynamics 365/input_Main Phone_id-c9e7ec2d-efca-4e4c-b3e3_f27c06'), 
    '9029134885')

WebUI.setText(findTestObject('Object Repository/Create New Account/Page_Accounts My Active Accounts - Dynamics 365/input_Primary Contact_id-c9e7ec2d-efca-4e4c_fc2774'), 
    'Alex')

WebUI.click(findTestObject('Object Repository/Create New Account/Page_Accounts My Active Accounts - Dynamics 365/li_Alex Bakeralextreyresearch.net619-555-01_b852f9'))

not_run: WebUI.setText(findTestObject('Object Repository/Create New Account/Page_Accounts My Active Accounts - Dynamics 365/input_Primary Contact_id-c9e7ec2d-efca-4e4c_fc2774'), 
    'Alex')

WebUI.setText(findTestObject('Object Repository/Create New Account/Page_Accounts My Active Accounts - Dynamics 365/input_Annual Revenue_id-c9e7ec2d-efca-4e4c-_618e89'), 
    '3000000')

WebUI.setText(findTestObject('Object Repository/Create New Account/Page_Accounts My Active Accounts - Dynamics 365/input_Number of Employees_id-c9e7ec2d-efca-_60b27a'), 
    '300')

WebUI.setText(findTestObject('Object Repository/Create New Account/Page_Accounts My Active Accounts - Dynamics 365/textarea_A'), 
    'A very big opportunity')

WebUI.setText(findTestObject('Object Repository/Create New Account/Page_Accounts My Active Accounts - Dynamics 365/input_Street 1_id-c9e7ec2d-efca-4e4c-b3e3-f_691710'), 
    'Las Vegas')

WebUI.setText(findTestObject('Object Repository/Create New Account/Page_Accounts My Active Accounts - Dynamics 365/input_Street 2_id-c9e7ec2d-efca-4e4c-b3e3-f_f807be'), 
    'Las Vegas')

WebUI.setText(findTestObject('Object Repository/Create New Account/Page_Accounts My Active Accounts - Dynamics 365/input_City_id-c9e7ec2d-efca-4e4c-b3e3-f63c4_2acf78'), 
    'Mumbai')

WebUI.setText(findTestObject('Object Repository/Create New Account/Page_Accounts My Active Accounts - Dynamics 365/input_ZIPPostal Code_id-c9e7ec2d-efca-4e4c-_fab6d5'), 
    '401102')

WebUI.click(findTestObject('Object Repository/Create New Account/Page_Accounts My Active Accounts - Dynamics 365/button_Save and Close'))

WebUI.click(findTestObject('Object Repository/Create New Account/Page_Accounts My Active Accounts - Dynamics 365/button_Ignore and save'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Katalon', false)

WebUI.closeBrowser()

