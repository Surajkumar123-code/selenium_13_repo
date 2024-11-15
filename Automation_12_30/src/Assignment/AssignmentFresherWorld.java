package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentFresherWorld {

	public static void main(String[] args) throws InterruptedException {
		/*1. open frsher world .com
		 2.verify register now is displayed or not
		 3.click on register now link
		 4.choose bangalore in current city drop down.
		 5.choose highest qualification as be/btech in qualificaTION drop down
		 */
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		
		driver.get("https://www.freshersworld.com/");
		WebElement registerver = driver.findElement(By.xpath("//span[text()='REGISTER NOW']"));
		System.out.println(registerver.isDisplayed());
		registerver.click();
		WebElement citydropdown = driver.findElement(By.id("currentCity"));
		
		//citydropdown.click();
		Select city=new Select(citydropdown);
		city.selectByVisibleText("Bangalore");
		
		WebElement education = driver.findElement(By.id("course"));
		Select qalification = new Select(education);
		qalification.selectByIndex(3);
		Thread.sleep(5000);
		driver.quit();

	}

}

