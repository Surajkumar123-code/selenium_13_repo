package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCaeexercise {

	public static void main(String[] args) throws IOException {
		FileInputStream files=new FileInputStream("./testdata/Automation.properties");
		Properties popr=new Properties();
		popr.load(files);
		String url = popr.getProperty("url");
		
		 WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		    driver.get(url);
		  String currenturl = driver.getCurrentUrl();
		  if(currenturl.contains("https://automationexercise.com/")) {
			  System.out.println("home page is visible");
		  }
		  else {
			  System.out.println("home page is not visible");
		  }
		  driver.findElement(By.xpath("(//a[@href='/test_cases'])[1]")).click();
		 String testcaseurl = driver.getCurrentUrl();
		 if(testcaseurl.contains("https://automationexercise.com/test_cases")) {
			 System.out.println("user is navigated to test cases page successfully");
		 }
		 else {
			 System.out.println("user is not navigated to test cases page successfully");
		 }
		 driver.quit();
		 
		
	}
	}


