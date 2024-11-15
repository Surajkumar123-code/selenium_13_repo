package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentUsingSumit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		String verify = driver.getTitle();
		System.out.println(verify);
		Thread.sleep(2000);
		WebElement usernametf = driver.findElement(By.xpath("//input[@id='username']"));
		usernametf.clear();
		usernametf.sendKeys("Testing");
		Thread.sleep(2000);
		WebElement PASSWORFTF = driver.findElement(By.xpath("//input[@id='password']"));		
		PASSWORFTF.clear();
		PASSWORFTF.sendKeys("Test@123");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit'][1]")).submit();
		Thread.sleep(2000);
		driver.quit();
	}

}
