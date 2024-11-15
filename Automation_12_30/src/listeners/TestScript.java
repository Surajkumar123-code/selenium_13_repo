package listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(Listenerimplementation.class)
public class TestScript extends BaseClass {

	@Test
	public void login() {
		Reporter.log("click on login link",true);
		driver.findElement(By.linkText("Log in")).click();
		
		Reporter.log("Enter valid credentials",true);
		driver.findElement(By.id("Email")).sendKeys("abhis1234gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("abhis@134");
		
		Reporter.log("click on login button",true);
		
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop","Home page is display");
		Reporter.log("Home page is display",true);
	}
}
