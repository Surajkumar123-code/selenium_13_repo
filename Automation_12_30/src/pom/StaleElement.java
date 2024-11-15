package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		
		
		
		
		SkillaryPage sp=new SkillaryPage(driver);
		sp.getSearchbar().sendKeys("selenium",Keys.ENTER);
		Thread.sleep(2000);
		sp.getSearchbar().sendKeys("testNg");
		
		/*
		WebElement search = driver.findElement(By.id("navbar-search-input"));
		search.sendKeys("selenium",Keys.ENTER);
		search.sendKeys("testng");*/
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
