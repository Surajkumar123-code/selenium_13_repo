package location;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathHandleTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Suraj%20Kumar/OneDrive/Desktop/mke.html");
		/*String a = driver.findElement(By.xpath("//td[text()='Kgf']/following-sibling::td[2]")).getText();
		String b = driver.findElement(By.xpath("//td[text()='Kgf']/preceding-sibling::td")).getText();
		String c = driver.findElement(By.xpath("//td[text()='Kgf']/following-sibling::td[1]")).getText();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		driver.quit();*/
		List<WebElement> a = driver.findElements(By.xpath("//td[text()='Kgf']/following-sibling::td"));
	}

}
