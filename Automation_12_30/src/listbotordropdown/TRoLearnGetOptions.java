package listbotordropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TRoLearnGetOptions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		WebElement pricebox = driver.findElement(By.id("cars"));
		Select price = new Select(pricebox);
		List<WebElement> alloption = price.getOptions();
		System.out.println(alloption.size());
		for(WebElement i:alloption) {
			System.out.println(i.getText());
			Thread.sleep(2000);
			driver.quit();
		}
		

	}

}
