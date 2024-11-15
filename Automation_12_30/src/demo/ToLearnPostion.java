package demo;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnPostion {
	public static void main(String[] args) {
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Point postion = driver.manage().window().getPosition();
		System.out.println("x:"+postion.getX());
		System.out.println("y:"+postion.getY());
		
	}

}
