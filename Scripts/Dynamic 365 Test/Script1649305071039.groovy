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

WebUI.setText(findTestObject('Object Repository/Dynamic 365/Page_Sign in to your account/input_Sign in_loginfmt'), 'bhagyeshnanwani22@gmail.com')

WebUI.click(findTestObject('Object Repository/Dynamic 365/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Dynamic 365/Page_Sign in to your Microsoft account/input_Enter password_passwd'), 
    'QHBtFOLoaT0q7cO6yVjn+aoR/HCKO+3o')

WebUI.click(findTestObject('Object Repository/Dynamic 365/Page_Sign in to your Microsoft account/input_Forgotten your password_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Dynamic 365/Page_Microsoft account/input_concat(Don, , t show this again)_idBtn_Back'))

WebUI.delay(20)

WebUI.navigateToUrl('https://org32cb6c3c.crm8.dynamics.com/main.aspx?appid=7a81cf22-33b3-ec11-983f-000d3a0a84fb&pagetype=dashboard&id=eaa6e6bb-4712-ec11-b6e7-00224820f09b&type=system&_canOverride=true')

WebUI.click(findTestObject('Object Repository/Dynamic 365/Page_Sales dashboard - Dynamics 365/i_'))

WebUI.click(findTestObject('Object Repository/Dynamic 365/Page_Sales dashboard - Dynamics 365/div_Harriet Parrish'))

WebUI.click(findTestObject('Object Repository/Dynamic 365/Page_Sales dashboard - Dynamics 365/span_Gerald Stephens'))

WebUI.click(findTestObject('Object Repository/Dynamic 365/Page_Sales dashboard - Dynamics 365/span_Lavona Field'))

WebUI.click(findTestObject('Object Repository/Dynamic 365/Page_Phone Call Phone Call Follow-up call -_39ebc9/li_RelatedRelated'))

WebUI.click(findTestObject('Object Repository/Dynamic 365/Page_Phone Call Phone Call Follow-up call -_39ebc9/span_Sales_symbolFont BackButton-symbol pa-am'))

WebUI.click(findTestObject('Object Repository/Dynamic 365/Page_Sales dashboard - Dynamics 365/div_BN'))

WebUI.click(findTestObject('Object Repository/Dynamic 365/Page_Sales dashboard - Dynamics 365/button_Sign out'))

WebUI.closeBrowser()

