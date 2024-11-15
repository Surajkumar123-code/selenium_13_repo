package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnAlertPopup {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
driver.get("https://demowebshop.tricentis.com/");
 driver.findElement(By.xpath("//input[@value='Search']")).click();
 Alert popup = driver.switchTo().alert();
 String msg = popup.getText();
 System.out.println(msg);
 Thread.sleep(2000);
 popup.accept();
	}

}
