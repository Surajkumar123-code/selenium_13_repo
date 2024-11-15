package demo;

import javax.swing.text.Position;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntaApp {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().fullscreen();
	driver.get("https://www.myntra.com/?utm_source=dms_bing&utm_medium=bing_cpc&utm_campaign=dms_bing_Brand_BMM_Desktop&utm_source=bing&msclkid=6c4d59ffa14419c1d67c3f30cc7e84f5&utm_term=myntra%20%5C&utm_content=Myntra_Generic");

	Point position = driver.manage().window().getPosition();
	System.out.println("x"+position.getX());
	System.out.println("Y"+position.getY());
	driver.quit();
	
	}

}
