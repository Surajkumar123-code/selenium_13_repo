package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentCaptureMultipleId {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
		//Thread.sleep(10000);
		
		driver.navigate().refresh();
		driver.findElement(By.linkText("Twitter")).click();
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println(allwindow);
		for(String id:allwindow)
		{
			System.out.println(id);
		}
		
		
		
	}

}
/* open demo web shop app and verify welcome page is display or not
  then perform refresh operation click on "Twitter link" and catture multuple window id's & print.
 */