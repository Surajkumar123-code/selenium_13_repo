package crossbrowsertesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import dataprovider.DataStorage;

public class BaseClassAssignment {
	public WebDriver driver;
	
	@BeforeClass
	
	public void launchbrowser(@Optional("chrome")String browsername) {
		
		if(browsername.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}else if (browsername.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
			
	}
	@BeforeMethod
	//@Test(dataProviderClass = DataStorage.class, dataProvider = "logindata")
	public void login() {
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	}
	
	@AfterMethod
	public void logout() {
		driver.findElement(By.xpath("//span[text()='SkillRary Admin']")).click();
		driver.findElement(By.xpath("//a[@href='../logout.php']")).click();
	}
	
	
	
	@AfterClass
	public void closebrowser() {
		driver.quit();
	}

}
