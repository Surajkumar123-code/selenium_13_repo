package testng;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoApp {

	@Test(priority = 1, invocationCount = 1)
	public void createaccount() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/accounts/login/");

		FaceBook fb = new FaceBook(driver);
		
		WebElement username = fb.getUsername();
		
		Actions act=new Actions(driver);
		act.sendKeys(username, "8235389936").perform();
		
		WebElement password = fb.getPassword();
		Actions act1=new Actions(driver);
		act1.sendKeys(password, "Suraj@123b").perform();
		
		Reporter.log("Create Account sucessfully", true);
	}
/*
	@Test(priority = 3)
	public void deleteaccount() {
		Reporter.log("delete Account sucessfully", true);

	}

	@Test(priority = 2, invocationCount = 3, threadPoolSize = 3)

	public void editaccount() {
		Reporter.log("edit Account sucessfully", true);*/

	}

