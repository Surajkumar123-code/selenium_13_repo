package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCssValue {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demowebshop.tricentis.com/login");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	 WebElement css = driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));
	 String coloe = css.getCssValue("color");
	String tect = css.getCssValue("text-align");
	 
System.out.println(coloe);
System.out.println(tect);
Thread.sleep(2000);

WebElement register = driver.findElement(By.linkText("Register"));
String xyz = register.getCssValue("color");
String  fontsize= register.getCssValue("font-size");
String  vertical= register.getCssValue("vertical-align");

System.out.println(xyz);
System.out.println(fontsize);
System.out.println(vertical  );
driver.quit();
	}

}
