package popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthenticationPopoup {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--start-maximized ");
WebDriver driver=new ChromeDriver(option);
//driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
