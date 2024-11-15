package assignmentDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script extends DemoWebAppBase {
	@Test
	public void book() {
		Path lop=new Path(driver);
		
//		lop.getBooklink().click();
		Actions act=new Actions(driver);
		act.click(lop.getBooklink()).click();
		Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='Books']")).isDisplayed(), "bookpage is not display");
		Reporter.log("Book page is display",true);
		
		//driver.findElement(By.xpath("(//a[@href='/books'])[1]")).click();
		
	}

}
