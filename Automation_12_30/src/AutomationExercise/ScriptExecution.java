package AutomationExercise;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ScriptExecution extends BaseClasseAutomationExercise
{
	
	@Test
	public void delete(){
		driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//b[text()='Account Deleted!']")).isDisplayed(), "Account is not delete");
		Reporter.log("Account is delete sucessfuly",true);
		
	}
	

}
