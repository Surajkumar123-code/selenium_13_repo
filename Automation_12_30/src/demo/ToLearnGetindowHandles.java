package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetindowHandles {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Facebook")).click();
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println(allwindow);
		for(String id: allwindow)
		{
			System.out.println(id);
		}
		Thread.sleep(5000);
	driver.quit();
		
		
		/*Thread.sleep(5000);
		driver.findElement(By.id("browserButton3")).click();
		 Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		for(String id:windows)
		{
			System.out.println(id);
		}
		Thread.sleep(10000);
		driver.quit();*/
		
	}

}
