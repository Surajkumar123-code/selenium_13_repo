package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutXExercise {		
	public static void main(String[] args) throws IOException {
			FileInputStream files=new FileInputStream("./testdata/Automation.properties");
			Properties prop=new Properties();
			prop.load(files);
			String url4 = prop.getProperty("url");
			String email5 = prop.getProperty("email2");
			String password5 = prop.getProperty("password2");
			
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--start-maximized");
			
			WebDriver driver=new ChromeDriver(opt);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			driver.get(url4);
			
			String currenturl = driver.getCurrentUrl();
			
			if(currenturl.contains("https://automationexercise.com/")) {
				System.out.println("Home page is visible successfully");
			}
			driver.findElement(By.xpath("//a[@href='/login']")).click();
			String loginbutton = driver.getCurrentUrl();
			if(loginbutton.contains("https://automationexercise.com/login")) {
				System.out.println("'Logged in as username' is visible");
			}
			driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[1]")).sendKeys(email5);
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password5);
			driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
			
			String verifyloginpg = driver.getCurrentUrl();
			
			if(verifyloginpg.contains("https://automationexercise.com/")) {
				System.out.println("login page is visible");
			}
			driver.findElement(By.xpath("//a[@href='/logout']")).click();
			String logouturl = driver.getCurrentUrl();
			
			if(logouturl.contains("https://automationexercise.com/logout")) {
				System.out.println("user is not navigated to login page");
			}
			else
			{
				System.out.println("user is navigated to login page");
			}
		}
}


	


