package location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XparhAmazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number')]")).sendKeys("Suraj@123b");
		driver.findElement(By.xpath("//span[contains(text(),'Instagram from Meta')]"));
		Thread.sleep(1000);
		driver.quit();
	}

}
//input[contains(@aria-label,'Phone number, username, or email')]
//span[contains(text(),'Instagram from Meta')]