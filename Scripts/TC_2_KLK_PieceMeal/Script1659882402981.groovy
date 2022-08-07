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

Mobile.verifyElementText(findTestObject('KLK PieceMeal OR/android.widget.TextView - General work'), 'General work')
Mobile.takeScreenshot()
Mobile.tap(findTestObject('KLK PieceMeal OR/android.widget.TextView - General work'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/KLK PieceMeal OR/android.widget.TextView - Piecemeal'), 'Piecemeal')
Mobile.takeScreenshot()
Mobile.tap(findTestObject('KLK PieceMeal OR/android.widget.TextView - Piecemeal'), 0)
Mobile.takeScreenshot()
Mobile.verifyElementText(findTestObject('KLK PieceMeal OR/android.widget.TextView - Date'), 'Date')

Mobile.tap(findTestObject('KLK PieceMeal OR/android.widget.EditText - Sunday 07 Aug, 2022'), 0)
Mobile.takeScreenshot()
Mobile.tap(findTestObject('KLK PieceMeal OR/android.widget.Button - OK'), 0)
Mobile.takeScreenshot()
Mobile.verifyElementText(findTestObject('Object Repository/KLK PieceMeal OR/android.widget.TextView - PM Code'), 'PM Code')

Mobile.tap(findTestObject('KLK PieceMeal OR/android.widget.TextView - Select an option'), 0)
Mobile.takeScreenshot()
Mobile.tap(findTestObject('Object Repository/KLK PieceMeal OR/android.widget.EditText - Search PM code'), 0)
Mobile.takeScreenshot()
Mobile.sendKeys(findTestObject('Object Repository/KLK PieceMeal OR/android.widget.EditText - Search PM code (1)'), 'Scout')
Mobile.takeScreenshot()
Mobile.verifyElementText(findTestObject('Object Repository/KLK PieceMeal OR/android.widget.TextView - KS - Scout Harvesting'), 
    'KS - Scout Harvesting')

Mobile.tap(findTestObject('KLK PieceMeal OR/android.widget.TextView - KS - Scout Harvesting'), 0)
Mobile.takeScreenshot()
Mobile.verifyElementText(findTestObject('Object Repository/KLK PieceMeal OR/android.widget.TextView - Job Code (1)'), 'Job Code')
Mobile.takeScreenshot()
Mobile.tap(findTestObject('KLK PieceMeal OR/JobCode'), 0)

Mobile.tap(findTestObject('KLK PieceMeal OR/android.widget.EditText - Search job code'), 0)
Mobile.takeScreenshot()
Mobile.sendKeys(findTestObject('KLK PieceMeal OR/android.widget.EditText - Search job code'), 'FISH POND')
Mobile.takeScreenshot()
Mobile.verifyElementText(findTestObject('KLK PieceMeal OR/android.widget.TextView - E0503 - FISH POND'), 'E0503 - FISH POND')
Mobile.takeScreenshot()
Mobile.tap(findTestObject('KLK PieceMeal OR/android.widget.TextView - E0503 - FISH POND'), 0)
Mobile.takeScreenshot()
Mobile.verifyElementText(findTestObject('Object Repository/KLK PieceMeal OR/android.widget.TextView - Field (1)'), 'Field')
Mobile.takeScreenshot()
Mobile.tap(findTestObject('KLK PieceMeal OR/Field'), 0)
Mobile.takeScreenshot()
Mobile.tap(findTestObject('KLK PieceMeal OR/android.widget.EditText - Search field'), 0)
Mobile.takeScreenshot()
Mobile.sendKeys(findTestObject('KLK PieceMeal OR/android.widget.EditText - Search field'), '2008A')
Mobile.takeScreenshot()
Mobile.verifyElementText(findTestObject('Object Repository/KLK PieceMeal OR/android.widget.TextView - 2008A'), '2008A')
Mobile.takeScreenshot()
Mobile.tap(findTestObject('KLK PieceMeal OR/android.widget.TextView - 2008A'), 0)
Mobile.takeScreenshot()
Mobile.verifyElementText(findTestObject('Object Repository/KLK PieceMeal OR/android.widget.TextView - Unit'), 'Unit')

Mobile.tap(findTestObject('Object Repository/KLK PieceMeal OR/android.widget.EditText - 0 (2)'), 0)
Mobile.takeScreenshot()
Mobile.sendKeys(findTestObject('Object Repository/KLK PieceMeal OR/android.widget.EditText - 0 (3)'), '1')
Mobile.takeScreenshot()
Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Object Repository/KLK PieceMeal OR/android.widget.TextView - Rate'), 'Rate')

Mobile.tap(findTestObject('Object Repository/KLK PieceMeal OR/android.widget.EditText - 0 (4)'), 0)
Mobile.takeScreenshot()
Mobile.sendKeys(findTestObject('KLK PieceMeal OR/android.widget.EditText - 0'), '2')
Mobile.takeScreenshot()
Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Object Repository/KLK PieceMeal OR/android.widget.TextView - Worker (1)'), 'Worker')

Mobile.tap(findTestObject('Object Repository/KLK PieceMeal OR/android.widget.ImageButton (1)'), 0)
Mobile.takeScreenshot()
Mobile.tap(findTestObject('Object Repository/KLK PieceMeal OR/android.widget.EditText - Search worker name  code'), 0)

Mobile.sendKeys(findTestObject('Object Repository/KLK PieceMeal OR/android.widget.EditText - Search worker name  code (1)'), 
    'DINESH')
Mobile.takeScreenshot()
Mobile.tap(findTestObject('Object Repository/KLK PieceMeal OR/android.widget.ImageView'), 0)
Mobile.takeScreenshot()
Mobile.verifyElementText(findTestObject('Object Repository/KLK PieceMeal OR/android.widget.Button - DONE'), 'DONE')

Mobile.tap(findTestObject('KLK PieceMeal OR/android.widget.Button - DONE'), 0)
Mobile.takeScreenshot()
Mobile.verifyElementText(findTestObject('Object Repository/KLK PieceMeal OR/android.widget.TextView - 1'), '1')

Mobile.verifyElementVisible(findTestObject('Object Repository/KLK PieceMeal OR/android.widget.Button - SAVE'), 0)
Mobile.takeScreenshot()
Mobile.tap(findTestObject('KLK PieceMeal OR/android.widget.Button - SAVE'), 0)
Mobile.takeScreenshot()
Mobile.verifyElementText(findTestObject('Object Repository/KLK PieceMeal OR/android.widget.TextView - Document successfully created'), 
    'Document successfully created')
Mobile.takeScreenshot()
Mobile.verifyElementText(findTestObject('Object Repository/KLK PieceMeal OR/android.widget.Button - BACK TO HOME'), 'BACK TO HOME')

Mobile.verifyElementText(findTestObject('Object Repository/KLK PieceMeal OR/android.widget.Button - NEW PIECEMEAL'), 'NEW PIECEMEAL')

Mobile.tap(findTestObject('KLK PieceMeal OR/android.widget.Button - BACK TO HOME'), 0)
Mobile.takeScreenshot()
Mobile.verifyElementText(findTestObject('Object Repository/KLK PieceMeal OR/android.widget.TextView - Home'), 'Home')
Mobile.takeScreenshot()
Mobile.closeApplication()

