package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentSubscriberbuttonIsdispalyedOrNot {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	Thread.sleep(2000);
	WebElement textfield = driver.findElement(By.xpath("//input[@class='form-control']"));
	System.out.println(textfield.isEnabled());
	driver.quit();
	

	}

}
