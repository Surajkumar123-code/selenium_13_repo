package listbotordropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSingleSelect {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://upload.facebook.com/reg/");
	//driver.findElement(By.id("u_0_0_9x")).click();
	WebElement monthduration = driver.findElement(By.id("year"));
	Select month = new Select(monthduration);
	//month.selectByIndex(3);
	month.selectByValue("2023 ");
	Thread.sleep(2000);
	driver.quit();
	
	}

}
