package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnManage {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	//driver.manage().window().maximize();
	//driver.manage().window().minimize();
	driver.manage().window().fullscreen();

	driver.get("https://www.agoda.com/en-in/?site_id=1914935&tag=3cda3586-9ec8-88d2-2819-7b1e8bb3ad04&msclkid=c23b1ca19032149568e57a6f41d11a36&ds=jLFv5gKHIauVmUIW");
}
}
