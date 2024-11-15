package listbotordropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		WebElement pricelistbox = driver.findElement(By.id("cars"));
		Select price = new Select(pricelistbox);
		price.selectByIndex(0);
		price.selectByIndex(1);
		price.selectByValue("199");
		price.selectByVisibleText("INR 200 - INR 299 ( 3 )");
		Thread.sleep(6000);
		driver.quit();

	}

}
