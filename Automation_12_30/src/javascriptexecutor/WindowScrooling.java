package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowScrooling {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--start-maximized ");
		
WebDriver driver=new ChromeDriver(opt);
//driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
driver.get("https://demowebshop.tricentis.com/");
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,500)");
//js.executeScript("window.scrollTo(0,500)");
           
	}

}
