package location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnCapturePriceByusingXpath {
	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.dunzo.com/search");
			Thread.sleep(2000);
	driver.findElement(By.xpath("(//p[text()='Apple - Kashmiri'])[1]/../..//p[contains(text(),'₹')]")).click();
	Thread.sleep(2000);
	driver.quit();
	}

}
