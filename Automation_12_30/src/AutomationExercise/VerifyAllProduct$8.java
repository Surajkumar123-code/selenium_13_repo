package AutomationExercise;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyAllProduct$8 {

	public static void main(String[] args) throws IOException {
		FileInputStream files=new FileInputStream("./testdata/Automation.properties");
		Properties popr=new Properties();
		popr.load(files);
		String url = popr.getProperty("url");
		
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
			WebElement click = driver.findElement(By.xpath("//a[@href='/product_details/1']"));
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", click);
			
			String productpgv = driver.getCurrentUrl();
			if(productpgv.contains("https://automationexercise.com/product_details/1")) {
				System.out.println(". User is landed successfully to product detail page");
			}else {
				System.out.println(" User is not landed to product detail page");
			}
			
			WebElement pname = driver.findElement(By.xpath("//h2[text()='Blue Top']"));
			System.out.println("Product Name "+pname.getText() +" is Visible");
			
			WebElement categoty = driver.findElement(By.xpath("//p[text()='Category: Women > Tops']"));
			System.out.println(" Category is:- "+ categoty.getText());
			
		   WebElement price = driver.findElement(By.xpath("//span[text()='Rs. 500']"));
		   System.out.println("price is visible "+ price.getText());
		   
		  WebElement availablity = driver.findElement(By.xpath("//p[text()=' In Stock']"));
		  System.out.println( availablity.getText());
		  
		  WebElement condition = driver.findElement(By.xpath("//p[text()=' New']"));
          System.out.println(condition.getText());
 WebElement brand = driver.findElement(By.xpath("//b[text()='Brand:']"));
 System.out.println(brand.getText()+ " is visible");
 driver.quit();
	
	}


}
	

