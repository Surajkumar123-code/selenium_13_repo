package listeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listenerimplementation  extends BaseClass implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(driver);
		String methodName = result.getName();
		String timestamp = LocalDateTime.now().toString().replaceAll(":", "-");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File tem = ts.getScreenshotAs(OutputType.FILE);
		File des=new File("./Screenshot/"+methodName+timestamp+".png");
		try {
			FileHandler.copy(tem, des);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Reporter.log("test script is failed",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test Sript is passed",true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test script is skiped");
	}
	
	

}
