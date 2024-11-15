package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
public static void main(String [] args) {
	
ChromeDriver driver=new ChromeDriver();	
	driver.get("https://www.flipkart.com/");
	 String text = driver.findElement(By.name("q")).getAttribute("title");
	System.out.println(text);
	driver.quit();

	//driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
