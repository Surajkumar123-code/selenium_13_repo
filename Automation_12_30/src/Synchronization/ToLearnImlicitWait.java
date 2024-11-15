package Synchronization;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnImlicitWait {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
     driver.get("https://www.shoppersstack.com/");
   
     driver.findElement(By.id("loginBtn")).click();
    // Thread.sleep(2000);
    driver.quit();
     
	}

	
	
	
	
}
