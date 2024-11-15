import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	 
		public static void main(String[] args) throws InterruptedException {
	        // Set the path to the ChromeDriver executable

	       WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        
	        driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	        
	        // Click on the desired option
	        driver.findElement(By.xpath("(//div[@class='focusable optionWrap  '])[1]")).click();
	        
	        // Locate the file input element and upload the file
	        WebElement uploadElement = driver.findElement(By.xpath("//input[@type='file']"));
	        uploadElement.sendKeys("C:\\Users\\Suraj Kumar\\OneDrive\\Desktop\\Current Test Set.pdf");
	        
	        // Add any additional steps if needed
	        
	        // Close the browser
	       // driver.quit();
	    }
	
	}


