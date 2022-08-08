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

Mobile.startExistingApplication('my.com.klk.operations')

Mobile.verifyElementText(findTestObject('Object Repository/KLK OC change OR/android.widget.TextView - LADANG LEKIR'), 'LADANG LEKIR')
Mobile.takeScreenshot()
Mobile.verifyElementVisible(findTestObject('Object Repository/KLK OC change OR/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('KLK OC change OR/android.widget.ImageButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/KLK OC change OR/android.widget.TextView - LADANG LEKIR (1)'), 
    'LADANG LEKIR')
Mobile.takeScreenshot()
Mobile.tap(findTestObject('Object Repository/KLK OC change OR/android.widget.Button - OKAY'), 0)
Mobile.takeScreenshot()
Mobile.verifyElementText(findTestObject('Object Repository/KLK OC change OR/android.widget.TextView - Home'), 'Home')
Mobile.takeScreenshot()
Mobile.closeApplication()

