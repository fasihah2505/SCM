import com.kms.katalon.core.testcase.TestCase

// Run individual tests
TestCaseFactory.findTestCase('Test Cases/ATM').run()
TestCaseFactory.findTestCase('Test Cases/Bus').run()

// Tear down the application
//TestCaseFactory.findTestCase('Test Cases/TearDown').run()
