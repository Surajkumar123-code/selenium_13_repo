package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsSelected {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/");
Thread.sleep(2000);
WebElement radio = driver.findElement(By.xpath("//label[text()='Good']/..//input[@type='radio']"));
radio.click();
System.out.println(radio.isSelected());
	}

}
//label[text()='Good']/..//input[@type='radio']