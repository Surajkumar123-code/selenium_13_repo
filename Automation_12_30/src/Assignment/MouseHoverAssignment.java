package Assignment;

import java.time.Duration;

import org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTKeyPairGeneratorSpi;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHoverAssignment {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    driver.get("https://demoapp.skillrary.com/");
    WebElement searchbox =driver.findElement(By.id("navbar-search-input"));
    Thread.sleep(2000);
    searchbox.sendKeys("selenium",Keys.ENTER);
    driver.findElement(By.linkText("Selenium")).click();
   WebElement plus = driver.findElement(By.id("add"));
    Actions add=new Actions(driver);
    add.moveToElement(plus).perform();
    add.doubleClick(plus).perform();
    
    driver.quit();
	}

}
