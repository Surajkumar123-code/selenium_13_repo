package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginUserIncorrectexercise {

	public static void main(String[] args) throws IOException {
		FileInputStream fils=new FileInputStream("./testdata/Automation.properties");
		Properties pops=new Properties();
		pops.load(fils);
		String url3 = pops.getProperty("url");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get(url3);
		String homepgurl = driver.getCurrentUrl();
		
		if(homepgurl.contains("https://automationexercise.com/")) {
			System.out.println("home page is visible successfully");
			
		}
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		String loginurl3 = driver.getCurrentUrl();
		if(loginurl3.contains("https://automationexercise.com/login")) {
			System.out.println("Login account' is visible");
		}
		driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[1]")).sendKeys("mr.rajsuraj");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Suraj123456");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		String loginurlm = driver.getCurrentUrl();
		if(loginurlm.contains("https://automationexercise.com/login")) {
			System.out.println("user enter incurrect emailid and password ");
		}else
		{
			System.out.println("user login successfully");
		}
		driver.quit();
	}
	}


