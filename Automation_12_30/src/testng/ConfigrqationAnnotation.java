package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigrqationAnnotation {

	@BeforeSuite
	public void beforesuite() {
		Reporter.log("Before suite", true);
	}
	@BeforeTest
	public void beforetest() {
		Reporter.log("before test", true);
	}
	
	@BeforeClass
	public void beforeclass() {
		Reporter.log("Before Class", true);
	}
	@BeforeMethod
	public void beforemethod() {
		Reporter.log("befroe method", true);
	}

	@Test

	public void demo() {

		Reporter.log("@test demo test case executed", true);
		
	}
	@Test
	public void sample() {
		Reporter.log("@test sample", true);
	}
	@AfterMethod
	public void aftermethod() {
		Reporter.log("aftermethod", true);
	}
	
	@AfterClass
	public void sfterclass() {
		Reporter.log("afterclass", true);
	}
	
	@AfterTest
	public void aftertest() {
		Reporter.log("aftertest", true);
		
	}
	

	@AfterSuite
	public void aftersuit() {
		Reporter.log("after suite", true);

	}
}
