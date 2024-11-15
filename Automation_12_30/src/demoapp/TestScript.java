package demoapp;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends BaseClass{
	@Test
	
	public void verifyHistory() {
		driver.findElement(By.xpath("//span[text()='Sales']")).click();
		String actualresult = driver.getTitle();
		String expectedresult="Sales History";
		if(actualresult.equals(expectedresult)) {
			Reporter.log("History page is display",true);
		}
		else {
			Reporter.log("History page is not display",true);
		}
		
	}

}
