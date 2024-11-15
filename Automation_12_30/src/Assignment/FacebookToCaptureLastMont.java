package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookToCaptureLastMont {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569870%7Cb%7Cfacebook%20create%20account%7C&placement=&creative=589460569870&keyword=facebook%20create%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-12091220328%26loc_physical_ms%3D9062010%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gad_source=1&gclid=EAIaIQobChMIyemch9jjiAMVTqtmAh2fBheeEAAYASAAEgLhyfD_BwE");

WebElement monthbutton = driver.findElement(By.id("year"));

Select month = new Select(monthbutton);
WebElement lastmonthis = month.getOptions().getLast();
System.out.println(lastmonthis.getText());

//WebElement lastmonthoption = month.getOptions().get(month.getOptions().size()-1);
//System.out.println("last month option = "+lastmonthoption.getText());


/*for(int i=month.getOptions().size()-1;i>=0;i--) {
	 
	 month.selectByIndex(i);
	
 }*/

Thread.sleep(2000);
driver.quit();
	}

}
