package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterUserexercise {

	public static void main(String[] args) throws IOException {
    FileInputStream files=new FileInputStream("./testdata/Automation.properties");
    Properties prop=new Properties();
    prop.load(files);
    String url6 = prop.getProperty("url");
   
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    driver.get(url6);
    
    String homepgurl = driver.getCurrentUrl();
    if(homepgurl.contains("https://automationexercise.com/")) {
    	System.out.println("home page is display");
    }
    driver.findElement(By.xpath("//a[@href='/login']")).click();
    String newuse = driver.getCurrentUrl();
    if(newuse.contains("https://automationexercise.com/login")) {
    	System.out.println("New User Signup!' is visible");
    }
    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("surajkumar");
    driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[2]")).sendKeys("mr.rajsuraj@gmail.com");
    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    
    WebElement emailalreadyexist = driver.findElement(By.xpath("//p[text()='Email Address already exist!']"));
    System.out.println(emailalreadyexist.getText());
	}

}
