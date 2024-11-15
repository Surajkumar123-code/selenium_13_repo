package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignementDoubleClick {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://demoapps.qspiders.com/");
WebElement uitesting = driver.findElement(By.xpath("//p[text()='UI Testing Concepts']"));
Actions ui=new Actions(driver);
ui.click(uitesting).perform();
 driver.findElement(By.xpath("//section[text()='Button']")).click();
WebElement rightlink = driver.findElement(By.linkText("Right Click"));
ui.click(rightlink).perform();
WebElement rightclick = driver.findElement(By.id("btn30"));
ui.contextClick(rightclick).perform();
WebElement yes = driver.findElement(By.xpath("//div[text()='Yes']"));
ui.click(yes).perform();
WebElement message = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']"));
System.out.println(message.getText());
String color = message.getCssValue("color");
String border = message.getCssValue("border-radius");
String boxsizing = message.getCssValue("box-sizing");
String margin = message.getCssValue("margin-inline-start");
System.out.println(color);
System.out.println(border);
System.out.println(boxsizing);
System.out.println(margin);
Thread.sleep(2000);
driver.quit();
}
}