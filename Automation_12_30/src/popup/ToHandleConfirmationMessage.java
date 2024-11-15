package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleConfirmationMessage {

	public static void main(String[] args) throws InterruptedException {
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
  driver.get("https://demo.guru99.com/test/delete_customer.php");
  driver.findElement(By.name("submit")).click();
  Alert confirmpopup = driver.switchTo().alert();
  System.out.println("1st pop "+confirmpopup.getText());
  confirmpopup.accept();
  Thread.sleep(2000);
  System.out.println("2nd pop "+confirmpopup.getText());
  confirmpopup.accept();
	}

}
