package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotificationPopoup {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		//option.addArguments("--disable-notifications ");
		//option.addArguments("--incognito");
		//option.addArguments("--start-maximized ");
		option.addArguments("--start-fullscreen");
    WebDriver driver=new ChromeDriver(option);
   // driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    WebDriverWait act=new WebDriverWait(driver, Duration.ofSeconds(20));
    driver.get("https://www.myntra.com/");
    driver.findElement(By.partialLinkText("MEN")).click();
    
	}

}
