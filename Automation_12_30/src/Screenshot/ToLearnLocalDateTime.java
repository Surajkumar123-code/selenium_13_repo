package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import graphql.schema.diffing.dot.Dotfile;

public class ToLearnLocalDateTime {

	public static void main(String[] args) throws IOException {
		 String times = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshot tc=(TakesScreenshot) driver;
		File tem = tc.getScreenshotAs(OutputType.FILE);
		 File dec = new File("./Screenshot/"+times+".png");
		 FileHandler.copy(tem, dec);
		
		 LocalDateTime time = LocalDateTime.now();
		 System.out.println(time);
		

	}

}
