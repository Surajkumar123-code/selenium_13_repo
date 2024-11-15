package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script extends BaseClass {
	@Test
	public void book() {
		driver.findElement(By.partialLinkText("BOOKS")).click();
		
		String actualTitle = driver.getTitle();
		String ExpectedTitle=workbook.getSheet("Sheet2").getRow(1).getCell(0).getStringCellValue();
		
		if(actualTitle.equals(ExpectedTitle)) {
		Reporter.log("Book page is display",true);
		
	}
	else {
		Reporter.log("Book page is not displayed",true);
		
	}
	
		
	}
}
	
		
	


