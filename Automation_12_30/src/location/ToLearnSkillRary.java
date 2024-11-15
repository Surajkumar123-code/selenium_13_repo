package location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSkillRary {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapp.skillrary.com/");
		
		driver.findElement(By.linkText("LOGIN")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.name("firstname")).sendKeys("Suraj");
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		Thread.sleep(2000);

		driver.findElement(By.id("email")).sendKeys("mr.rajsuraj@gmail.com");
		}

}
