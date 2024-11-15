package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollIntoView {

	public static void main(String[] args) {
ChromeOptions opt=new ChromeOptions();
opt.addArguments("--start-maximized ");
WebDriver driver=new ChromeDriver(opt);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://demowebshop.tricentis.com/");
WebElement newcourse = driver.findElement(By.xpath("//strong[text()='Featured products']"));
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("argument[0].scrollInToView(true)", newcourse);
	}

}
