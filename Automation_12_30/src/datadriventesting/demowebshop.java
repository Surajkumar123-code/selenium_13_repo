package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demowebshop {

	public static void main(String[] args) throws IOException {
FileInputStream fil=new FileInputStream("./testdata/demowebshop");
Properties pop=new Properties();
pop.load(fil);
String url = pop.getProperty("url");
String e = pop.getProperty("email");
String p = pop.getProperty("password");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get(url);
driver.findElement(By.id("Email")).sendKeys(e);
driver.findElement(By.id("Password")).sendKeys(p);
	}

}
