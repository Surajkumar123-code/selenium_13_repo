package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureChildWindowsAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/23");
		Thread.sleep(15000);
		driver.findElement(By.id("compare")).click();
		Thread.sleep(2000);
		Set<String> allwindowid = driver.getWindowHandles();
		for(String id:allwindowid)
		{
			driver.switchTo().window(id);
			String currenturl = driver.getCurrentUrl();
			System.out.println(currenturl);
			//if(!currenturl.contains("shoppersstack"))
			if(currenturl.contains("ebay"))
			{
				Dimension size = driver.manage().window().getSize();
				System.out.println(size);
			}
		 if(currenturl.contains("flipkart"))
		 {
			 break;
		 }
		 {
			 driver.manage().window().maximize();
			 driver.findElement(By.xpath("//input['Search for Products, Brands and More']")).sendKeys("iphone");
		 }
			
		}

	}

}
//amazon
//flipkart
//ebay