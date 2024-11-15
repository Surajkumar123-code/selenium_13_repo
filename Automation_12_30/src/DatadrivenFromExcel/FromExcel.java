package DatadrivenFromExcel;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
     FileInputStream files=new FileInputStream("./testdata/skillaryTestDAta.xlsx");
    Workbook work = WorkbookFactory.create(files);
    String url = work.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
   String username = work.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
   String password = work.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
   String expected = work.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
    double price = work.getSheet("Sheet1").getRow(1).getCell(4).getNumericCellValue();
    boolean ststus = work.getSheet("Sheet1").getRow(1).getCell(5).getBooleanCellValue();
    LocalDateTime date = work.getSheet("Sheet1").getRow(1).getCell(6).getLocalDateTimeCellValue();
    
    
    int month = date.getDayOfMonth();
    		int monthdate = date.getDayOfMonth();
    		int year = date.getYear();
    		System.out.println(month);
    		System.out.println(monthdate);
    		System.out.println(year);
   
    System.out.println(url);
    System.out.println(username);
    System.out.println(password);
    System.out.println(expected);
    System.out.println(price);
    System.out.println(ststus);
    System.out.println(date);
    
    
    /*WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    driver.get(url);
    driver.findElement(By.id("email")).sendKeys(username);
    driver.findElement(By.id("password")).sendKeys(password);*/
	}

}
