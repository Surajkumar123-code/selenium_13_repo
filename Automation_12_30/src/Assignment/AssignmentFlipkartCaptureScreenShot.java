package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AssignmentFlipkartCaptureScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		String times = LocalDateTime.now().toString().replace(":", "_-");
		 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement searchtf = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		searchtf.sendKeys("Mobile");
		Thread.sleep(2000);
		searchtf.submit();
		Thread.sleep(5000);
		TakesScreenshot wp=(TakesScreenshot) driver;
		File tem=wp.getScreenshotAs(OutputType.FILE);
		File des=new File("./Screenshot/"+times+".png");
		FileHandler.copy(tem, des);
		LocalDateTime time=LocalDateTime.now();
		System.out.println(time);
		
		
		driver.quit();

	}

}
