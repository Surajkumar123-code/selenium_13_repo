package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		Dimension dimension = driver.findElement(By.xpath("//input[@value='Search']")).getSize();
		System.out.println(dimension.getHeight());
		System.out.println(dimension.getWidth());

	}

}
