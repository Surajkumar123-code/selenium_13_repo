package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	
		String errormsg = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getText();
System.out.println(errormsg);
if(errormsg.contains("Login was unsuccessful"))
{
	System.out.println("error message is display");
}else
{
	System.out.println("error message is not dispaly and incorrect  ");
}
	}

}
