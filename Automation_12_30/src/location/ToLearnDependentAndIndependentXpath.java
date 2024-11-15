package location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnDependentAndIndependentXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
driver.findElement(By.xpath("//a[text()='Simple Computer']/../..//input[@value='Add to cart']")).click();
Thread.sleep(2000);
driver.quit();
	}

}
//a[text()='Simple Computer']/../..//input[@value='Add to cart']
//(//p[text()='Apple - Kashmiri'])[1]/../..//p[contains(text(),'₹')]