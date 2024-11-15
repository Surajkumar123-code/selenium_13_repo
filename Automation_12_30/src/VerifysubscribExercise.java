import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifysubscribExercise {

	public static void main(String[] args) throws InterruptedException {
		//Test Case 10: Verify Subscription in home page 494

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://automationexercise.com/");
String url = driver.getCurrentUrl();
if(url.contains("https://automationexercise.com/")) {
	System.out.println("its vicible");
}else {
	System.out.println("its not visible");
}
WebElement footr = driver.findElement(By.xpath("//p[text()='Get the most recent updates from ']"));
Actions act=new Actions(driver);
act.scrollToElement(footr).perform();
WebElement verifyemail = driver.findElement(By.xpath("//input[@placeholder='Your email address']"));
System.out.println(verifyemail.getText()+"its visible");
Thread.sleep(2000);

driver.findElement(By.xpath("//input[@placeholder='Your email address']")).sendKeys("Suraj@123b");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@type='submit']")).click();
WebElement id = driver.findElement(By.xpath("//div[@id='success-subscribe']"));
System.out.println(id.getText());
/*JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollInToView(true)",footr );*/
	}

}
