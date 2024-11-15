package location;

import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwapEbayPostionAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/57");
		Thread.sleep(15000);
		String sigle = driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();
		Thread.sleep(2000);
		
		Set<String> allwindowids = driver.getWindowHandles();
		for(String id:allwindowids)
		{
		/*	driver.switchTo().window(id);
			String aurl = driver.getCurrentUrl();
			System.out.println(aurl);
			
			
			if(!aurl.contains("ebay"))
			{
				Point positios = driver.manage().window().getPosition();
				Dimension sizs = driver.manage().window().getSize();
				System.out.println("postion"+positios+"  "+"Dimension ebay"+"  "+sizs);
			}
			if(!aurl.contains("flipkart"))
			{
				Point positionm = driver.manage().window().getPosition();
				Dimension sizem = driver.manage().window().getSize();
				System.out.println("postion"+positionm+"  "+"Dimension flipkart"+"  "+sizem);
				
				
			}
			if(!aurl.contains("amazon"))
			{
				Point positions = driver.manage().window().getPosition();
				Dimension sizes = driver.manage().window().getSize();
				System.out.println("postion"+positions+"  "+"amazon"+"  "+sizes);
			
			
			}*/
			driver.switchTo().window(sigle);
			//driver.quit();
			
			
			
		}
		

	}

}
//amazon
//ebay
//flipkart