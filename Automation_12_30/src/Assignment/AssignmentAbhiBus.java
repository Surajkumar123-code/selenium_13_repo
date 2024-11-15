package Assignment;

import java.util.HashSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentAbhiBus {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Hyderabad to Bangalore Bus']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Bus Partner']")).click();
		Thread.sleep(2000);
		WebElement x = driver.findElement(By.xpath("//label[text()='BSR TOURS & TRAVELS']/..//input[@type='checkbox']"));
		x.click();
		WebElement z = driver.findElement(By.xpath("//h5[@class='title']"));
		
		
		

		//x.getSize();
		
		Thread.sleep(2000);
		HashSet<Object> h=new HashSet<Object>();
		h.add(z);
		for(Object i:h) 
		{
			System.out.println(i);
			
		}
		int count=0;
	
		{
			
		}
		//driver.findElement(By.xpath("//span[text()='21 Sat']")).click();
		
		//driver.quit();

	}

}
