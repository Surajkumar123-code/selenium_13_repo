package crossbrowsertesting;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScriptCrossBrowser extends BaseClassAssignment{
	
	@Test
	public void verifysaleslink() {
		driver.findElement(By.xpath("//span[text()='Sales']")).click();
		assertTrue(driver.findElement(By.xpath("//span[text()='Sales']")).isDisplayed(),"sales link is not visible" );
		Reporter.log("Sales page is visible",true);
	}

}
