package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoLogin {
	
	@Test(dataProviderClass = DemoDataStorage.class ,dataProvider = "login")
	public void loginPage(String[]crd) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.id("Email")).sendKeys(crd[0]);
		driver.findElement(By.id("Password")).sendKeys(crd[1]);
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//a[@href='/logout']")).isDisplayed(), "user not login sucessfully");
		Reporter.log("user login sucessfully",true);
		Thread.sleep(2000);
		driver.quit();
	}

}
