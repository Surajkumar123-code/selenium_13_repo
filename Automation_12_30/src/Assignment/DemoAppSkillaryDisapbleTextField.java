package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoAppSkillaryDisapbleTextField {

	public static void main(String[] args) throws InterruptedException, IOException {
		String shot = LocalDateTime.now().toString().replace(":", "-");
ChromeOptions opt=new ChromeOptions();
opt.addArguments("--start-maximized ");
WebDriver driver=new ChromeDriver(opt);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
driver.get("https://demoapp.skillrary.com/");
WebElement disabletf = driver.findElement(By.xpath("//input[@class='form-control']"));
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("arguments[0].value='suraj'", disabletf);
TakesScreenshot ts=(TakesScreenshot) driver;
File tem = ts.getScreenshotAs(OutputType.FILE);
File dest=new File("./Screenshot/"+shot+".png");
FileHandler.copy(tem, dest);
LocalDateTime time=LocalDateTime.now();
System.out.println(time);


Thread.sleep(2000);
driver.quit();

	}

}
