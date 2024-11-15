package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		//step 1: create object  for FileInputStream 
FileInputStream fis=new FileInputStream("./testdata/skillararydata.properties");
//step2: create respective file type object
Properties pop=new Properties();
//step3: call read method
pop.load(fis);
String url = pop.getProperty("url");
String name = pop.getProperty("username");
String pasd = pop.getProperty("password");
System.out.println(url);
System.out.println(name);
ChromeOptions opt=new ChromeOptions();
opt.addArguments("--start-maximized");
WebDriver driver=new ChromeDriver(opt);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get(url);
driver.findElement(By.id("email")).sendKeys(name);
driver.findElement(By.id("password")).sendKeys(pasd);


	}

}
