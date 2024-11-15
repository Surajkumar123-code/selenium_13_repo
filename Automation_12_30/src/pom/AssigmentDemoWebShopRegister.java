package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssigmentDemoWebShopRegister {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fils=new FileInputStream("./testdata/demoWebShop.properties");
		Properties pop=new Properties();
		pop.load(fils);
		String url = pop.getProperty("url");
		Object url2 = pop.getProperty("url1");
		
		FileInputStream fil=new FileInputStream("./testdata/DemoWebShop.xlsx");
		Workbook workbook = WorkbookFactory.create(fil);
		String fistname = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String lastname = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String email = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		String ps=workbook.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		String conpasd = workbook.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue();
		
		
	
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     driver.get(url);
     
     
     WelcomePage pg=new WelcomePage(driver);
     pg.getRegisterLink().click();
     
     RegisterPage page=new RegisterPage(driver);
     page.getGenderButton().click();
     
     page.getFirstNametf().sendKeys(fistname);
     page.getLastNAmetf().sendKeys(lastname);
     page.getEmailtf().sendKeys(email);
     page.getPasswordtf().sendKeys(ps);
     page.getConfirmPasswordtf().sendKeys(conpasd);
     page.getRegisterbutton().click();
     
     String url1 = driver.getCurrentUrl();
     if(!url1.equals(url2)) {
    	 System.out.println("User not Register successfulyy");
    	 
     }else
     {
    	 System.out.println("User  Register successfully");
     }
     Thread.sleep(2000);
     driver.quit();
   
     
     
     
     
     
	}

}
