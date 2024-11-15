package assignmentDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class DemoWebAppBase {
	public static WebDriver driver;
	public Properties pop;
    
	@BeforeTest
	public void dataProvider() throws IOException {
		FileInputStream file=new FileInputStream("./testdata/DemoApp.properties");
		 pop=new Properties();
		pop.load(file);
	}
	@BeforeClass
	public void launchBrowser() {
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.get(pop.getProperty("url"));
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	

}
