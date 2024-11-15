package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentButtonIsDispay {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//input[@type='button'][1]"));
          System.out.println(button.isDisplayed());
          System.out.println(button.getRect().height);
          System.out.println(button.getRect().getWidth());
          System.out.println(button.getRect().getX());
          System.out.println(button.getRect().getY());
          driver.quit();
	}
}
