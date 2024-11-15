package AutomationExercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClasseAutomationExercise {
	
	public WebDriver driver;
	
	@BeforeClass
	public void LaunchBrowser() {
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://automationexercise.com");
		Assert.assertEquals(driver.getTitle(), "Automation Exercise","Home page is not display");
		Reporter.log("Home page is display",true);
	}
	@BeforeMethod
	public void login() {
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Login to your account']")).isDisplayed(), "Login to account is not is visible");
		Reporter.log("Login Accountr is visible");
		driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[1]")).sendKeys("mr.rajsurajk2001@gmail.com");
		driver.findElement(By.xpath("(//input[@placeholder='Password'])[1]")).sendKeys("Suraj@123b");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Assert.assertEquals(driver.getTitle(), "Automation Exercise", "Logged in as username' is not visible");
		Reporter.log("USer is login sucessfully",true);
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	
		
	}

}
