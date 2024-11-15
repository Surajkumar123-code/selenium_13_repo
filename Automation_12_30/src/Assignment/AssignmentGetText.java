package Assignment;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentGetText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		Thread.sleep(2000);
		WebElement nametf = driver.findElement(By.id("username"));
		nametf.clear();
		nametf.sendKeys("surajkumar");
		WebElement passtf = driver.findElement(By.id("password"));
		passtf.clear();
		passtf.sendKeys("6202558716");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit'][1]")).click();
		Thread.sleep(2000);
		WebElement erro = driver.findElement(By.xpath("//span[@id='validationMessage']"));
		System.out.println(erro.getText());
		System.out.println(erro.getCssValue("color"));
		driver.quit();

	}

}
