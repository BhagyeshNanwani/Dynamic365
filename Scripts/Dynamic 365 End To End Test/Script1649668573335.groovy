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

WebUI.setText(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sign in to your account/input_Sign in_loginfmt'), 
    'bhagyeshnanwani22@gmail.com')

WebUI.click(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sign in to your Microsoft account/input_Enter password_passwd'), 
    'cJZAETvQhHiAF6pCLCMhah1wzavccz+8')

WebUI.click(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sign in to your Microsoft account/input_Forgotten your password_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Microsoft account/input_concat(Don, , t show this again)_idBtn_Back'))

WebUI.click(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard -/i_'))

WebUI.click(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard -/span_Search for records across multiple ent_e46704'))

WebUI.click(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard -/span_Account'))

WebUI.setText(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard -/input_Account Name_id-c9e7ec2d-efca-4e4c-b3_3f4614'), 
    'Katalon')

WebUI.setText(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard -/input_Main Phone_id-c9e7ec2d-efca-4e4c-b3e3_f27c06'), 
    '9029134756')

WebUI.click(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard -/input_Primary Contact_id-c9e7ec2d-efca-4e4c_fc2774'))

WebUI.click(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard -/label_New Contact'))

WebUI.uploadFile(findTestObject('Dynamic 365 End To End Test/Page_Sales dashboard -/div_Scan Business Card'), '/Users/bhagyesh/Desktop/BusinessCard.jpg')

WebUI.delay(5)

//WebUI.click(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard -/div_Scan Business Card'))
not_run: WebUI.setText(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard -/input_First Name_id-661157fe-2fc9-4eaa-835f_21e048'), 
    'Bhagyesh R')

not_run: WebUI.setText(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard -/input_Last Name_id-661157fe-2fc9-4eaa-835f-_038829'), 
    'Nanwani')

not_run: WebUI.setText(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard -/input_Job Title_id-661157fe-2fc9-4eaa-835f-_4f964c'), 
    'Solutions Engineer')

WebUI.clearText(findTestObject('Dynamic 365 End To End Test/Page_Sales dashboard - Dynamics 365/input_Account Name'))

WebUI.setText(findTestObject('Dynamic 365 End To End Test/Page_Sales dashboard - Dynamics 365/input_Account Name'), 'Katalon')

WebUI.click(findTestObject('Dynamic 365 End To End Test/Page_Sales dashboard - Dynamics 365/li_Katalon9029134885Las Vegas'))

WebUI.clearText(findTestObject('Dynamic 365 End To End Test/Page_Sales dashboard -/input_Email_id-661157fe-2fc9-4eaa-835f-5bfa_72c7b8'))

WebUI.setText(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard -/input_Email_id-661157fe-2fc9-4eaa-835f-5bfa_72c7b8'), 
    'bhagyeshnanwani22@gmail.com')

WebUI.clearText(findTestObject('Dynamic 365 End To End Test/Page_Sales dashboard -/input_Mobile Phone_id-661157fe-2fc9-4eaa-83_b45ba1'))

WebUI.setText(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard -/input_Mobile Phone_id-661157fe-2fc9-4eaa-83_b45ba1'), 
    '9029134885')

WebUI.clearText(findTestObject('Dynamic 365 End To End Test/Page_Sales dashboard -/input_Business Phone_id-661157fe-2fc9-4eaa-_9b319e'))

WebUI.setText(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard -/input_Business Phone_id-661157fe-2fc9-4eaa-_9b319e'), 
    '022847583920')

WebUI.clearText(findTestObject('Dynamic 365 End To End Test/Page_Sales dashboard -/textarea_C'))

WebUI.setText(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard -/textarea_C'), 'Champion From Katalon')

WebUI.clearText(findTestObject('Dynamic 365 End To End Test/Page_Sales dashboard -/input_Street 1_id-661157fe-2fc9-4eaa-835f-5_77c00c'))

WebUI.setText(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard -/input_Street 1_id-661157fe-2fc9-4eaa-835f-5_77c00c'), 
    'Las Vegas')

WebUI.clearText(findTestObject('Dynamic 365 End To End Test/Page_Sales dashboard -/input_Street 2_id-661157fe-2fc9-4eaa-835f-5_3bc72e'))

WebUI.setText(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard -/input_Street 2_id-661157fe-2fc9-4eaa-835f-5_3bc72e'), 
    'Las Vegas')

WebUI.clearText(findTestObject('Dynamic 365 End To End Test/Page_Sales dashboard -/input_City_id-661157fe-2fc9-4eaa-835f-5bfa2_f66584'))

WebUI.setText(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard -/input_City_id-661157fe-2fc9-4eaa-835f-5bfa2_f66584'), 
    'Mumbai')

WebUI.clearText(findTestObject('Dynamic 365 End To End Test/Page_Sales dashboard -/input_ZIPPostal Code_id-661157fe-2fc9-4eaa-_8709e9'))

WebUI.setText(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard -/input_ZIPPostal Code_id-661157fe-2fc9-4eaa-_8709e9'), 
    '401102')

WebUI.click(findTestObject('Dynamic 365 End To End Test/Page_Sales dashboard -/span_Save and Close'))

WebUI.click(findTestObject('Dynamic 365 End To End Test/Page_Sales dashboard -/button_Ignore and save'), FailureHandling.CONTINUE_ON_FAILURE)

//not_run: if (WebUI.verifyElementPresent(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard -/button_Ignore and save'), 
//    10)) {
//    WebUI.click(findTestObject('Dynamic 365 End To End Test/Page_Sales dashboard -/button_Ignore and save'))
//} else {
//    System.out.println('Not Found')
//}
WebUI.clearText(findTestObject('Dynamic 365 End To End Test/Page_Sales dashboard -/input_Annual Revenue_id-c9e7ec2d-efca-4e4c-_618e89'))

WebUI.setText(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard -/input_Annual Revenue_id-c9e7ec2d-efca-4e4c-_618e89'), 
    '500000')

WebUI.clearText(findTestObject('Dynamic 365 End To End Test/Page_Sales dashboard -/input_Number of Employees_id-c9e7ec2d-efca-_60b27a'))

WebUI.setText(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard -/input_Number of Employees_id-c9e7ec2d-efca-_60b27a'), 
    '200')

WebUI.clearText(findTestObject('Dynamic 365 End To End Test/Page_Sales dashboard -/textarea_A'))

WebUI.setText(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard -/textarea_A'), 'A potential opportunity')

WebUI.clearText(findTestObject('Dynamic 365 End To End Test/Page_Sales dashboard -/input_Street 1_id-c9e7ec2d-efca-4e4c-b3e3-f_691710'))

WebUI.setText(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard -/input_Street 1_id-c9e7ec2d-efca-4e4c-b3e3-f_691710'), 
    'Peachtree Street')

WebUI.clearText(findTestObject('Dynamic 365 End To End Test/Page_Sales dashboard -/input_Street 2_id-c9e7ec2d-efca-4e4c-b3e3-f_f807be'))

WebUI.setText(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard -/input_Street 2_id-c9e7ec2d-efca-4e4c-b3e3-f_f807be'), 
    'Sen Diago')

WebUI.clearText(findTestObject('Dynamic 365 End To End Test/Page_Sales dashboard -/input_City_id-c9e7ec2d-efca-4e4c-b3e3-f63c4_2acf78'))

WebUI.setText(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard -/input_City_id-c9e7ec2d-efca-4e4c-b3e3-f63c4_2acf78'), 
    'Atlanta, GA')

WebUI.clearText(findTestObject('Dynamic 365 End To End Test/Page_Sales dashboard -/input_ZIPPostal Code_id-c9e7ec2d-efca-4e4c-_fab6d5'))

WebUI.setText(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard -/input_ZIPPostal Code_id-c9e7ec2d-efca-4e4c-_fab6d5'), 
    '1776')

WebUI.click(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard -/span_Save and Close_1'))

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard -/button_Ignore and save'), 
    10)) {
    WebUI.click(findTestObject('Dynamic 365 End To End Test/Page_Sales dashboard -/button_Ignore and save'))
}

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard -/span_Contacts'))

not_run: WebUI.click(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Contacts My Active Contacts - Dynamics 365/span_Bhagyesh Nanwani'))

WebUI.verifyTextPresent('MARK', false)

WebUI.click(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Contact Sales Insights Bhagyesh Nanwan_d13344/span_Sales_symbolFont BackButton-symbol pa-am'))

WebUI.click(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Contacts My Active Contacts - Dynamics 365/span_Sales_symbolFont BackButton-symbol pa-am'))

WebUI.click(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard - Dynamics 365/div_Accounts'))

not_run: WebUI.click(findTestObject('Dynamic 365 End To End Test/Page_Accounts My Active Accounts - Dynamics 365/span_Katalon'))

WebUI.verifyTextPresent('Katalon', false)

WebUI.click(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Accounts My Active Accounts - Dynamics 365/div_Dashboard'))

WebUI.click(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard - Dynamics 365/div_BN'))

WebUI.click(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sales dashboard - Dynamics 365/button_Sign out'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Dynamic 365 End To End Test/Page_Sign in to your account/div_Pick an account_background-logo-holder'), 
    0)

WebUI.closeBrowser()

