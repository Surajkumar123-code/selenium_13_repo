package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DoubleclickOnWebPages {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://www.facebook.com/?locale2=en_GB&_rdr");
driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Suraj");
driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Kumar");
WebElement day = driver.findElement(By.id("id=\"day\""));
Select days = new Select(day);
days.selectByIndex(12);
List<WebElement> allselection = days.getAllSelectedOptions();
for(WebElement i:allselection) {
       System.out.println(i.getText());
}
Thread.sleep(4000);
driver.quit();
	}

}
