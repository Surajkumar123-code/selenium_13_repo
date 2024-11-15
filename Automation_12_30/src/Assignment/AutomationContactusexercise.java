package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationContactusexercise {

	public static void main(String[] args) throws IOException {
		FileInputStream files=new FileInputStream("./testdata/Automation.properties");
		Properties pop=new Properties();
		pop.load(files);
		String url7 = pop.getProperty("url");
		String name = pop.getProperty("name1");
		String email = pop.getProperty("email3");
		String subject = pop.getProperty("subject");
		String message = pop.getProperty("message");
		//String file = pop.getProperty("file");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get(url7);
		String url = driver.getCurrentUrl();
		if(url.contains("https://automationexercise.com/")) {
			System.out.println("Home page is display");
		}
		driver.findElement(By.xpath("//a[@href='/contact_us']")).click();
		WebElement getintouch = driver.findElement(By.xpath("//h2[text()='Get In Touch']"));
		System.out.println(getintouch.getText()+" is visible");
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys(subject);
		driver.findElement(By.id("message")).sendKeys(message);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Suraj Kumar\\OneDrive\\Desktop\\PURCHASE PROCESSES.txt");
		
		 driver.findElement(By.xpath("//input[@type='submit']")).submit();
		Alert popup = driver.switchTo().alert();
		popup.accept();
		
		WebElement successmg = driver.findElement(By.xpath("(//div[text()='Success! Your details have been submitted successfully.'])[1]"));
		
		System.out.println(successmg.getText()+"is visible");
		
		driver.findElement(By.xpath("(//a[@href='/'])[2]")).click();
		String verifyhm = driver.getCurrentUrl();
		if(verifyhm.contains("https://automationexercise.com/")) {
			System.out.println("home page is display");
		}
		else {
			System.out.println("home page is not dispaly");
		}
		driver.quit();
          
	}

}
