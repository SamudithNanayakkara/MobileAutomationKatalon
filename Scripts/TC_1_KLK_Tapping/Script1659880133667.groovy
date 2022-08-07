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

Mobile.takeScreenshot()

Mobile.verifyElementText(findTestObject('Object Repository/KLK Tapping OR/android.widget.TextView - LADANG LEKIR'), 'LADANG LEKIR')

Mobile.verifyElementText(findTestObject('Object Repository/KLK Tapping OR/android.widget.TextView - Tapping'), 'Tapping')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('KLK Tapping OR/android.widget.TextView - Tapping'), 0)

Mobile.takeScreenshot()

Mobile.verifyElementText(findTestObject('Object Repository/KLK Tapping OR/android.widget.TextView - BucketCage Weighing'), 
    'Bucket/Cage Weighing')

Mobile.tap(findTestObject('KLK Tapping OR/android.widget.TextView - BucketCage Weighing'), 0)

Mobile.takeScreenshot()

Mobile.verifyElementText(findTestObject('Object Repository/KLK Tapping OR/android.widget.TextView - Date'), 'Date')

Mobile.verifyElementText(findTestObject('Object Repository/KLK Tapping OR/android.widget.TextView - Weight(kg)'), 'Weight(kg)')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/KLK Tapping OR/android.widget.EditText - 0'), 0)

Mobile.takeScreenshot()

Mobile.setText(findTestObject('Object Repository/KLK Tapping OR/android.widget.EditText - 0 (1)'), '55', 0)

Mobile.takeScreenshot()

Mobile.verifyElementText(findTestObject('Object Repository/KLK Tapping OR/android.widget.Button - SAVE'), 'SAVE')

Mobile.tap(findTestObject('KLK Tapping OR/android.widget.Button - SAVE'), 0)

Mobile.takeScreenshot()

Mobile.verifyElementText(findTestObject('Object Repository/KLK Tapping OR/android.widget.TextView - Document successfully created'), 
    'Document successfully created')

Mobile.verifyElementText(findTestObject('Object Repository/KLK Tapping OR/android.widget.Button - NEW BUCKETCAGE WEIGHING'), 
    'NEW BUCKET/CAGE WEIGHING')

Mobile.verifyElementText(findTestObject('Object Repository/KLK Tapping OR/android.widget.Button - BACK TO HOME'), 'BACK TO HOME')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('KLK Tapping OR/android.widget.Button - BACK TO HOME'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/KLK Tapping OR/android.widget.TextView - Home'), 'Home')

Mobile.takeScreenshot()

Mobile.closeApplication()

