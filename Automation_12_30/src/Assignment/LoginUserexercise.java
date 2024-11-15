package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginUserexercise {

		public static void main(String[]args) throws IOException {
			FileInputStream prop=new FileInputStream("./testdata/Automation.properties");
			Properties pop=new Properties();
			pop.load(prop);
			String url = pop.getProperty("url");
			String email2 = pop.getProperty("email2");
			String password2 = pop.getProperty("password2");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
			driver.get(url);
			String homepgurl = driver.getCurrentUrl();
			if(homepgurl.contains("https://automationexercise.com/")) {
				System.out.println("Login home page is dispaly");
			}
			driver.findElement(By.xpath("//a[@href='/login']")).click();
			String loginpg = driver.getCurrentUrl();
			if(loginpg.contains("https://automationexercise.com/login")) {
				System.out.println("login page account is visible");
			}
			driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[1]")).sendKeys(email2);
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password2);
			driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
			String loginurl2 = driver.getCurrentUrl();
			if(loginurl2.contains("https://automationexercise.com/")) {
				System.out.println("login as user name is visible");
			}
			driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
			String delete = driver.getCurrentUrl();
			if(delete.contains("https://automationexercise.com/delete_account")) {
				System.out.println("ACCOUNT DELETED!' is visible");
			}
	}

}
