package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebbobDemoAppUsingToSwitch {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 Thread.sleep(1500);
	 driver.get("https://demowebshop.tricentis.com/");
	 Thread.sleep(2000);
	 String vrifyurl = driver.getTitle();
	 Thread.sleep(2000);
	 System.out.println(vrifyurl);
	Thread.sleep(2000);
	 driver.findElement(By.xpath("//a[text()='Facebook']")).click();
	switchTowindoe(driver, "facebook");
	 System.out.println("facebook page bisplay");
	 driver.findElement(By.xpath("//span[text()='Create new account']")).click();
	 switchTowindoe(driver, "Register");
	 Thread.sleep(2000);
	 System.out.println("register page open");
	 driver.findElement(By.name("firstname")).sendKeys("suraj");
	 Thread.sleep(2000);
	 driver.findElement(By.name("lastname")).sendKeys("kumar");
	}
public static void switchTowindoe(WebDriver driver,String url)
{
	 Set<String> allwindowid = driver.getWindowHandles();
	for(String id:allwindowid)
	{
	driver.switchTo().window(id);
	String acturl = driver.getCurrentUrl();
	System.out.println(acturl);
	if(acturl.contains(url))
	{
		break;
	}
	}
	
}
}
