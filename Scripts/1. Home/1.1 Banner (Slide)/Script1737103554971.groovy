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

Mobile.startApplication('Test Files/Setia_City_Mall_Version_5_13_11_(Version_Code_162).apk', false)

Mobile.delay(10)

'Get Device Height and Store in device_height variable'
device_Height = Mobile.getDeviceHeight()

'Get Device Width and Store in device_Width variable'
device_Width = Mobile.getDeviceWidth()

'Storing the startX,endX values by dividing device height by 2 Because Y coordinates are constant'
int startY = device_Height / 2

'Here endY and startY values are equal for vertical Swiping for that assigning startY value to endY'
int endY = startY

'Storing the startX value'
int startX = device_Width * 0.30

'Storing the endX value'
int endX = device_Width * 0.70

'Here Y constant for Swipe Vertical Left to Right'
Mobile.swipe(startX, startY, endX, endY)

'Here Y constant for Swipe Vertical Left to Right'
Mobile.swipe(startX, startY, endX, endY)

'Here Y constant for Swipe Vertical Left to Right'
Mobile.swipe(startX, startY, endX, endY)

Mobile.delay(3)

'open content\r\n'
Mobile.tap(findTestObject('Object Repository/SCM/Home_Object/android.widget.FrameLayout (1)'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3)

