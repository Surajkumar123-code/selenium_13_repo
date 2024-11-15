  package location;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTagName {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));//to call tagName by using List<WebElement> reference variable like alllinks.get
		List<WebElement> alllink = driver.findElements(By.tagName("img"));
		List<WebElement> alllinkp = driver.findElements(By.tagName("input"));
		System.out.println(alllinks.size());
		System.out.println(alllink.size());
		System.out.println(alllinkp.size());
		alllinks.get(alllinks.size()-1).click();//it used to click to last element of web element
		for( WebElement ele:alllinks)
		{
			System.out.println(ele.getText());//get.text using foe which  element in web elements in  using  is 
			
		}
		
	}

}
