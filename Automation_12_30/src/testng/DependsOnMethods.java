package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test
	public void register() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Assert.fail();
		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("register is suceesfull", true);
	 
	}
	
	@Test(dependsOnMethods = "register")
	public void login() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("login is suceesfull", true);
		
	}//if we are using assert.fail(); that time without execution register page another menthod is not execute that time output comes like this 
	@Test(dependsOnMethods = {"register","login"})
	
	public void addtocart() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/cart");
		Reporter.log("login is suceesfull", true);
		
	}
	
	

}
