package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProvider {
	@Test(dataProviderClass = DataStorage.class,dataProvider = "login")
	public void login(String[] crd) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		
		
		driver.findElement(By.id("email")).sendKeys(crd[0]);
		driver.findElement(By.id("password")).sendKeys(crd[1]);
		
		driver.findElement(By.id("last")).click();
		Assert.assertEquals(driver.getTitle(),"SkillRary Ecommerce","Login Faield");
		Reporter.log("login sucessfully",true);
		
		Thread.sleep(2000);
		driver.quit();
	}
	
	

}
