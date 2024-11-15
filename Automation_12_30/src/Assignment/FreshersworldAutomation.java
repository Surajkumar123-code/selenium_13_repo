package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FreshersworldAutomation {
	public static void main(String[] args) {
       WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

       

        try {
            
            driver.get("https://www.freshersworld.com");

           
            WebElement registerNowButton = driver.findElement(By.linkText("Register Now"));
            if (registerNowButton.isDisplayed()) {
                System.out.println("Register Now button is displayed.");

                registerNowButton.click();

                Select cityDropdown = new Select(driver.findElement(By.id("currentCity")));
                cityDropdown.selectByVisibleText("Bangalore");

                Select qualificationDropdown = new Select(driver.findElement(By.id("highestQualification")));
                qualificationDropdown.selectByVisibleText("BE/BTech");

                System.out.println("Automation steps completed successfully.");
            } else {
                System.out.println("Register Now button is not displayed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
           // driver.quit();
        }
	}
}


