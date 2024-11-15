package location;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchAppPostion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/57");
		Thread.sleep(2000);
		driver.findElement(By.id("compare")).click();
		//Thread.sleep(2000);
		
		SwitchTowindow(driver, "flipkart");
		Point flipkart= driver.manage().window().getPosition();
		//driver.manage().window().setPosition(ebay);
		
		
		SwitchTowindow(driver, "ebay");
		Point ebay = driver.manage().window().getPosition();
		driver.manage().window().setPosition(flipkart);
		
		SwitchTowindow(driver, "flipkart");
		driver.manage().window().setPosition(ebay);
		
		
		
	}
		
		public static void SwitchTowindow(WebDriver driver, String url)
		{
			
		
		Set<String> allwindowid = driver.getWindowHandles();
		for(String id:allwindowid)
		{
			driver.switchTo().window(id);
			String acturl = driver.getCurrentUrl();
			if(acturl.contains(url))
			{
				break;
			}
		}
	}
	

}
