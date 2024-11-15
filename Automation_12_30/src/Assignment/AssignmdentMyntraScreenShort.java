package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmdentMyntraScreenShort {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		WebElement kids = driver.findElement(By.partialLinkText("KIDS"));
		Actions  act=new Actions(driver);
		act.moveToElement(kids).perform();
		 WebElement ethnic = driver.findElement(By.partialLinkText("Ethnic Wear"));
		ethnic.click();
		String currenturl = driver.getCurrentUrl();
		if(currenturl.contains("https://www.myntra.com/ki-etnhc?f=Gender%3Aboys%2Cboys%20girls&plaEnabled=false")) {
			System.out.println("Ethnic wear id diplayed");
		}else {
			System.out.println("Ethnic wear is not displayed");
			
		}
		
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
