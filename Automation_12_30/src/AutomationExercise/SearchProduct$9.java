package AutomationExercise;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchProduct$9 {

	public static void main(String[] args) throws IOException, InterruptedException {
		//Test Case 9: Search Product 446
		FileInputStream files=new FileInputStream("./testdata/Automation.properties");
		Properties popr=new Properties();
		popr.load(files);
		String url = popr.getProperty("url");
		String search = popr.getProperty("searchproduct");
		String product = popr.getProperty("sproductname");
		
		 WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		    driver.get(url);
		    
		    String currenturl = driver.getCurrentUrl();
			  if(currenturl.contains("https://automationexercise.com/")) {
				  System.out.println("home page is visible");		
		
	}

			  driver.findElement(By.xpath("//a[@href='/products']")).click();
			 String productpg = driver.getCurrentUrl();
			 if(productpg.contains("https://automationexercise.com/products")) {
				 System.out.println("user is navigated to ALL PRODUCTS page successfully");
			 }else {
				 System.out.println("user is not navigated to ALL PRODUCTS page successfully");
			 }
			 driver.findElement(By.xpath("//input[@placeholder='Search Product']")).sendKeys(product);
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//button[@id='submit_search']")).click();
			 
			String producturl = driver.getCurrentUrl();
			if(producturl.contains(search)) {
				System.out.println("SEARCHED PRODUCTS' is visible");
			}else {
				System.out.println("SEARCHED PRODUCTS' is not visible");
			}
			//System.out.println(driver.findElement(By.xpath("//h2[text()='Searched Products']")).getText());
			
			WebElement allsearchpr = driver.findElement(By.xpath("//div[@class='features_items']"));
			System.out.println("All Search produvt is visible "+ allsearchpr.getText());
			 
	}

}
