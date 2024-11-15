package Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchingAmazone {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--start-maximized ");
WebDriver driver=new ChromeDriver(option);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
driver.get("https://www.shoppersstack.com/products_page/23");
driver.findElement(By.id("compare")).click();
Set<String> allwindowid = driver.getWindowHandles();
for(String id:allwindowid) {
	driver.switchTo().window(id);
	String url = driver.getCurrentUrl();
	if(url.contains("amazon")) {
		break;		
	}	
}
    driver.manage().window().maximize();
    Actions act=new Actions(driver);
    act.scrollByAmount(300, 500).perform();
    ArrayList<String> ama=new ArrayList<>();
    
	}

}
