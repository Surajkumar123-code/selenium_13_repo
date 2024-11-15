package location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearned {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("mr.rajsuraj@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("899553355");
		driver.get("https://demowebshop.tricentis.com/register");
	
		driver.navigate().forward()
;		driver.findElement(By.id("First name")).sendKeys("suraj");
	}

}
