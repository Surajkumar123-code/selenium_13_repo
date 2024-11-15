package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

import Screenshot.screenShot;

public class AssignmentToScreenShotApplePrice {

	public static void main(String[] args) throws InterruptedException, IOException {
       String times = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
           driver.get("https://demoapps.qspiders.com/");
           driver.findElement(By.xpath("//p[@class='text-[#000000] text-[0.75rem] mt-2']")).click();
         WebElement webtable = driver.findElement(By.xpath("//section[text()='Web Table']"));
         webtable.click();
          System.out.println(webtable.isDisplayed()); 
          WebElement dynamicwebtable = driver.findElement(By.xpath("//a[text()='Dynamic Web Table']"));
          dynamicwebtable.click();
         System.out.println(dynamicwebtable.isDisplayed());
         WebElement price = driver.findElement(By.xpath("//th[text()='Apple iPhone']/following-sibling::td[4]"));
         System.out.println(price.getText()); 
         TakesScreenshot dh =(TakesScreenshot) driver;
       File tem = dh.getScreenshotAs(OutputType.FILE);
       File dec = new File("./Screenshot"+times+".png");
       FileHandler.copy(tem, dec);
       LocalDateTime time=LocalDateTime.now();
       System.out.println(time);
         
		
          Thread.sleep(5000);
           driver.quit();
		

	}

}
