package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://demowebshop.tricentis.com/");
    
    WelcomePage pg=new WelcomePage(driver);
    //pg.getRegisterLink().click();
    pg.getLoginLink().click();
    
    LoginPAge lop=new LoginPAge(driver);
    lop.getEmailtf().sendKeys("suraj");
    lop.getPasswordtf().sendKeys("kumar");
    lop.getLohhinbutton().click();
	}

}
