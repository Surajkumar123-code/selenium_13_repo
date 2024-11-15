package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChildWindowPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.id("compare")).click();
		Set<String> allwindoeids = driver.getWindowHandles();//capture all windows id
		for(String id:allwindoeids) {
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			if(url.contains("flipkar")) {
				break;
			}
		}
		driver.manage().window().maximize();

	}

}
