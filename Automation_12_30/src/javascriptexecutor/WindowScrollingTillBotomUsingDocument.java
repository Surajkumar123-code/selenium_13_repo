package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowScrollingTillBotomUsingDocument {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--start-maximized ");
WebDriver driver=new ChromeDriver(opt);
//driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://demowebshop.tricentis.com/");
JavascriptExecutor js=(JavascriptExecutor) driver;
          js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
          
          Thread.sleep(2000);
          
          js.executeScript("history.go()");
	}

}
