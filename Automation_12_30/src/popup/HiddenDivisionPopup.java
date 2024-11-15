package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenDivisionPopup {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
driver.get("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|B|Brand|Brand-BrandExact_DT|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|RSA|&s_kwcid=AL!1631!3!!e!!o!!makemytrip%5D&ef_id=:G:s&msclkid=5ad3de96b79516ddfa69b869211b959b");
	driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
	driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
	//if i am not changing the path then we store object in variable and that variable given in that path after that we not changing the path
	//we are not distubing path if space is there then give space if space is not there then dont give space
	String month="June";
	int date=25;
	int year=2025;
	while(true)//infinite loop 
	{
		try {
			driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//p[text()='"+date+"']")).click();
             break;
		} catch (Exception e) {
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
	
	/*while(true)
	{
		try {
			driver.findElement(By.xpath("//div[text()='March 2025']/../..//p[text()='25']")).click();
             break;
		} catch (Exception e) {
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}*/
		
	}
	
	}

}
