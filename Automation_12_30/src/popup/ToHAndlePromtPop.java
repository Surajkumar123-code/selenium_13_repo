package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHAndlePromtPop {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
WebDriverWait drievr=new WebDriverWait(driver, Duration.ofSeconds(20));
driver.get("");
driver.switchTo().frame("");
driver.findElement(By.xpath("")).click();
Alert pormhnadle = driver.switchTo().alert();
pormhnadle.sendKeys("suraj");
pormhnadle.accept();
	}

}
