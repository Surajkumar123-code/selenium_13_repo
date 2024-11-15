package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssigmrntGlobalSqa {

	public static void main(String[] args) throws IOException {
		String times = LocalDateTime.now().toString().replace(":", "-");
   WebDriver driver=new ChromeDriver();  
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
   driver.get("https://www.globalsqa.com/demo-site/draganddrop/#:~:text=QA%20Demo%20Site%20|%20Website%20for%20Automation%20|%20Drag%20And");
	WebElement photoframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	driver.switchTo().frame(photoframe);
	WebElement img1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	WebElement img2 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
	WebElement trash = driver.findElement(By.id("trash"));
	Actions act=new Actions(driver);
	act.dragAndDrop(img1, trash).perform();
	act.dragAndDrop(img2, trash).perform();
	  driver.switchTo().defaultContent();
	driver.findElement(By.xpath("(//a[text()='CheatSheets'][1])")).click();
	driver.findElement(By.xpath("//a[text()='SQL Cheat Sheet']")).click();
	
	Set<String> allwindow = driver.getWindowHandles();
	String currenturl="";
	for(String id:allwindow) {
		driver.switchTo().window(id);
		 currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
	if(currenturl.contains("https://www.globalsqa.com/sql-cheat-sheet/"))
	{
		break;
	}
		
	}
	WebElement scroll = driver.findElement(By.xpath("//img[@class='wp-block-jetpack-slideshow_image wp-image-6452 jetpack-lazy-image jetpack-lazy-image--handled'][1]"));
	act.scrollToElement(scroll).perform();
	TakesScreenshot scr=(TakesScreenshot) driver;{
		File temp = scr.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/"+times+".png");
		FileHandler.copy(temp, dest);
		
		LocalDateTime time=LocalDateTime.now();
		System.out.println(time);
		
		
	}
	}
}
	
	



	
	
   
	
    
	
	

	

