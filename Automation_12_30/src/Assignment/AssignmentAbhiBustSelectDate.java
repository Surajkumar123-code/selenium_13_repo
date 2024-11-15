package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentAbhiBustSelectDate {

	public static void main(String[] args) throws InterruptedException, IOException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

driver.get("https://www.abhibus.com/");
driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
//driver.findElement(By.xpath("(//div[@class='input-prefix col auto'])[3]")).click();
while(true) {
	try {
       
		driver.findElement(By.xpath("//span[text()='January']/..//span[text()='2025']/../../..//span[@data-date='2']")).click();
		break;
	} catch (Exception e) {
		
		 WebElement nextmonth = driver.findElement(By.xpath("(//div[@class=' col auto'])[3]"));
		nextmonth.click();
	}
	TakesScreenshot tc=(TakesScreenshot) driver;
	File tem = tc.getScreenshotAs(OutputType.FILE);
	File dest=new File("./ScreenShot/image.png");
	FileHandler.copy(tem, dest);
}
}
}
