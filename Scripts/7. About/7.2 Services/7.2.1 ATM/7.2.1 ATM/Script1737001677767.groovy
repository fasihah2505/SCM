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
// Dynamically generate the file path using the project directory
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

<<<<<<< HEAD
Mobile.startApplication('C:\\Users\\User\\Downloads\\Setia_City_Mall_Version_5_13_11_(Version_Code_162).apk', true)
=======
String projectDir = RunConfiguration.getProjectDir()

String apkFilePath = projectDir + '/Test Files/Setia_City_Mall_Version_5_13_11_(Version_Code_162).apk'

// Launch the application using the relative path
Mobile.startApplication(apkFilePath, true)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (22)'), 0)
>>>>>>> branch 'main' of https://github.com/fasihah2505/SCM.git

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (14)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - About (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Services'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ScrollView'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - ATM'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (16)'), 0)

