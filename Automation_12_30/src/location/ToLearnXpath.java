package location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		
		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("mobile");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(2000);
		/*find a path using xpath by text()
		 syntax is 
		 tagname[]text()='text value']*/
		
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		Thread.sleep(2000);
		
		driver.quit();		
		
	}
		
	}


//span[text()='Shopping cart']
//span[text()='Shopping cart']