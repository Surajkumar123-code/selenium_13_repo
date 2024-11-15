package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationExercise {

	private static Object testcase;
	public static void main(String[] args) throws IOException, InterruptedException {
FileInputStream fils=new FileInputStream("./testdata/Automation.properties");
Properties prop=new Properties();
prop.load(fils);
String url = prop.getProperty("url");
String name = prop.getProperty("name");
String email = prop.getProperty("email");
String password = prop.getProperty("password");
 String days = prop.getProperty("days");
 String months = prop.getProperty("month");
 String years = prop.getProperty("years");
String firstname = prop.getProperty("firstname");
String lastname = prop.getProperty("lastname");
String company = prop.getProperty("company");
String adress = prop.getProperty("adress");
String adress2 = prop.getProperty("adress2");
String country = prop.getProperty("country");
String state = prop.getProperty("state");
String city = prop.getProperty("city");
String zipcode = prop.getProperty("zipcode");
String mobile = prop.getProperty("mobile");

System.out.println(url);


WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
driver.get(url);
String currenturl = driver.getCurrentUrl();
if(currenturl.contains("https://automationexercise.com/")) {
	System.out.println("home page is display");
}
  driver.findElement(By.xpath("//a[@href='/login']")).click();
  String loginurl = driver.getCurrentUrl();
  if(loginurl.contains("https://automationexercise.com/login"));{
	  System.out.println("Signup!' page is visible");
  }
  
 driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(name);
 driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[2]")).sendKeys(email);
 
 driver.findElement(By.xpath("//button[text()='Signup']")).click();
 String accounturl = driver.getCurrentUrl();
 if(accounturl.contains("https://automationexercise.com/signup")) {
	 System.out.println("ENTER ACCOUNT INFORMATION' is visible");
 }
 driver.findElement(By.xpath("(//input[@name='title'])[1]")).click();
WebElement name1 = driver.findElement(By.id("name"));
name1.clear();
name1.sendKeys(name);

/*WebElement disabelemail = driver.findElement(By.id("email"));
disabelemail.clear();
email1.sendKeys("mr.rajsuraj@gmail.com");*/
driver.findElement(By.id("password")).sendKeys("password");

WebElement day = driver.findElement(By.id("days"));
Select sec=new Select(day);
sec.selectByValue(days);

WebElement month = driver.findElement(By.id("months"));
Select se=new Select(month);
se.selectByValue(months);

WebElement year = driver.findElement(By.id("years"));
Select secd=new Select(year);
secd.selectByValue(years);

WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("arguments[0].click()", checkbox);

WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
JavascriptExecutor jj=(JavascriptExecutor) driver;
jj.executeScript("arguments[0].click()", checkbox2);

driver.findElement(By.id("first_name")).sendKeys(firstname);
driver.findElement(By.id("last_name")).sendKeys(lastname);
driver.findElement(By.id("company")).sendKeys(company);
driver.findElement(By.id("address1")).sendKeys(adress);
driver.findElement(By.id("address2")).sendKeys(adress2);

WebElement countrys = driver.findElement(By.id("country"));
Select cont=new Select(countrys);
cont.selectByValue(country);

driver.findElement(By.id("state")).sendKeys(state);
driver.findElement(By.id("city")).sendKeys(city);
driver.findElement(By.id("zipcode")).sendKeys(zipcode);
driver.findElement(By.id("mobile_number")).sendKeys(mobile);

WebElement createaccount = driver.findElement(By.xpath("//button[@type='submit']"));
JavascriptExecutor jse=(JavascriptExecutor) driver;
jse.executeScript("arguments[0].click()", createaccount);
String createaccounturl = driver.getCurrentUrl();

if(createaccounturl.contains("https://automationexercise.com/account_created")) {
	System.out.println("ACCOUNT CREATED!' is visible");
}
driver.findElement(By.linkText("Continue")).click();
String userurl = driver.getCurrentUrl();

if(userurl.contains("https://automationexercise.com/")) {
	System.out.println("username' is visible");
}
driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
String deleteac = driver.getCurrentUrl();

if(deleteac.contains("https://automationexercise.com/delete_account")) {
	System.out.println("user successfully delte account");
}
driver.findElement(By.linkText("Continue")).click();
String newurl2 = driver.getCurrentUrl();
 Thread.sleep(3000);
 driver.quit();
 AutomationExercise.loginuser();
 
	}
	
	public static void loginuser() throws IOException, InterruptedException {
		FileInputStream prop=new FileInputStream("./testdata/Automation.properties");
		Properties pop=new Properties();
		pop.load(prop);
		String url = pop.getProperty("url");
		String email2 = pop.getProperty("email2");
		String password2 = pop.getProperty("password2");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get(url);
		String homepgurl = driver.getCurrentUrl();
		if(homepgurl.contains("https://automationexercise.com/")) {
			System.out.println("Login home page is dispaly");
		}
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		String loginpg = driver.getCurrentUrl();
		if(loginpg.contains("https://automationexercise.com/login")) {
			System.out.println("login page account is visible");
		}
		driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[1]")).sendKeys(email2);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password2);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		String loginurl2 = driver.getCurrentUrl();
		if(loginurl2.contains("https://automationexercise.com/")) {
			System.out.println("login as user name is visible");
		}
		/*driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
		String delete = driver.getCurrentUrl();
		if(delete.contains("https://automationexercise.com/delete_account")) {
			System.out.println("ACCOUNT DELETED!' is visible");*/
		driver.quit();
		AutomationExercise.userincorrect();
		}
	
	public static void userincorrect() throws IOException, InterruptedException {
		FileInputStream fils=new FileInputStream("./testdata/Automation.properties");
		Properties pops=new Properties();
		pops.load(fils);
		String url3 = pops.getProperty("url");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get(url3);
		String homepgurl = driver.getCurrentUrl();
		
		if(homepgurl.contains("https://automationexercise.com/")) {
			System.out.println("home page is visible successfully");
			
		}
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		String loginurl3 = driver.getCurrentUrl();
		if(loginurl3.contains("https://automationexercise.com/login")) {
			System.out.println("Login account' is visible");
		}
		driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[1]")).sendKeys("mr.rajsuraj");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Suraj123456");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		String loginurlm = driver.getCurrentUrl();
		if(loginurlm.contains("https://automationexercise.com/login")) {
			System.out.println("user enter incurrect emailid and password ");
		}else
		{
			System.out.println("user login successfully");
		}
		driver.quit();
		AutomationExercise.logoutuser();
		
	}//code for logout
	
		public static void logoutuser() throws IOException, InterruptedException {
			FileInputStream files=new FileInputStream("./testdata/Automation.properties");
			Properties prop=new Properties();
			prop.load(files);
			String url4 = prop.getProperty("url");
			String email5 = prop.getProperty("email2");
			String password5 = prop.getProperty("password2");
			
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--start-maximized");
			
			WebDriver driver=new ChromeDriver(opt);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			driver.get(url4);
			
			String currenturl = driver.getCurrentUrl();
			
			if(currenturl.contains("https://automationexercise.com/")) {
				System.out.println("Home page is visible successfully");
			}
			driver.findElement(By.xpath("//a[@href='/login']")).click();
			String loginbutton = driver.getCurrentUrl();
			if(loginbutton.contains("https://automationexercise.com/login")) {
				System.out.println("'Logged in as username' is visible");
			}
			driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[1]")).sendKeys(email5);
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password5);
			driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
			
			String verifyloginpg = driver.getCurrentUrl();
			
			if(verifyloginpg.contains("https://automationexercise.com/")) {
				System.out.println("login page is visible");
			}
			driver.findElement(By.xpath("//a[@href='/logout']")).click();
			String logouturl = driver.getCurrentUrl();
			
			if(logouturl.contains("https://automationexercise.com/logout")) {
				System.out.println("user is not navigated to login page");
			}
			else
			{
				System.out.println("user is navigated to login page");
			}
			Thread.sleep(2000);
			driver.quit();
			AutomationExercise.registeruser();
			
		}
		public static void registeruser() throws IOException, InterruptedException {
			 FileInputStream files=new FileInputStream("./testdata/Automation.properties");
			    Properties prop=new Properties();
			    prop.load(files);
			    String url6 = prop.getProperty("url");
			   
			    WebDriver driver=new ChromeDriver();
			    driver.manage().window().maximize();
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			    driver.get(url6);
			    
			    String homepgurl = driver.getCurrentUrl();
			    if(homepgurl.contains("https://automationexercise.com/")) {
			    	System.out.println("home page is display");
			    }
			    driver.findElement(By.xpath("//a[@href='/login']")).click();
			    String newuse = driver.getCurrentUrl();
			    if(newuse.contains("https://automationexercise.com/login")) {
			    	System.out.println("New User Signup!' is visible");
			    }
			    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("surajkumar");
			    driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[2]")).sendKeys("mr.rajsuraj@gmail.com");
			    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
			    
			    WebElement emailalreadyexist = driver.findElement(By.xpath("//p[text()='Email Address already exist!']"));
			    System.out.println(emailalreadyexist.getText());
			    Thread.sleep(2000);
			    driver.quit();
			    AutomationExercise.contactus();
			    
				}
		
		//contact-6
                  private static void contactus() throws IOException, InterruptedException {
                	  FileInputStream files=new FileInputStream("./testdata/Automation.properties");
              		Properties pop=new Properties();
              		pop.load(files);
              		String url7 = pop.getProperty("url");
              		String name = pop.getProperty("name1");
              		String email = pop.getProperty("email3");
              		String subject = pop.getProperty("subject");
              		String message = pop.getProperty("message");
              		//String file = pop.getProperty("file");
              		ChromeOptions opt=new ChromeOptions();
              		opt.addArguments("--start-maximized");
              		WebDriver driver=new ChromeDriver(opt);
              		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
              		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
              		driver.get(url7);
              		String url = driver.getCurrentUrl();
              		if(url.contains("https://automationexercise.com/")) {
              			System.out.println("Home page is display");
              		}
              		driver.findElement(By.xpath("//a[@href='/contact_us']")).click();
              		WebElement getintouch = driver.findElement(By.xpath("//h2[text()='Get In Touch']"));
              		System.out.println(getintouch.getText()+" is visible");
              		
              		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(name);
              		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(email);
              		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys(subject);
              		driver.findElement(By.id("message")).sendKeys(message);
              		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Suraj Kumar\\OneDrive\\Desktop\\PURCHASE PROCESSES.txt");
              		
              		 driver.findElement(By.xpath("//input[@type='submit']")).submit();
              		Alert popup = driver.switchTo().alert();
              		popup.accept();
              		
              		WebElement successmg = driver.findElement(By.xpath("(//div[text()='Success! Your details have been submitted successfully.'])[1]"));
              		
              		System.out.println(successmg.getText()+"is visible");
              		
              		driver.findElement(By.xpath("(//a[@href='/'])[2]")).click();
              		String verifyhm = driver.getCurrentUrl();
              		if(verifyhm.contains("https://automationexercise.com/")) {
              			System.out.println("home page is display");
              		}
              		else {
              			System.out.println("home page is not dispaly");
              		}
              		Thread.sleep(2000);
              		driver.quit();
              		AutomationExercise.testcase();
              		
                        
              	}
                  
                  //testcase-7

				private static void testcase() throws IOException, InterruptedException {
					FileInputStream files=new FileInputStream("./testdata/Automation.properties");
					Properties popr=new Properties();
					popr.load(files);
					String url = popr.getProperty("url");
					
					 WebDriver driver=new ChromeDriver();
					    driver.manage().window().maximize();
					    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
					    driver.get(url);
					  String currenturl = driver.getCurrentUrl();
					  if(currenturl.contains("https://automationexercise.com/")) {
						  System.out.println("home page is visible");
					  }
					  else {
						  System.out.println("home page is not visible");
					  }
					  driver.findElement(By.xpath("(//a[@href='/test_cases'])[1]")).click();
					 String testcaseurl = driver.getCurrentUrl();
					 if(testcaseurl.contains("https://automationexercise.com/test_cases")) {
						 System.out.println("user is navigated to test cases page successfully");
					 }
					 else {
						 System.out.println("user is not navigated to test cases page successfully");
					 }
					 driver.quit();
					 AutomationExercise.verifyallproduct();
					 
					
				}
				//Test Case 8: Verify all  product ======================================

				private static void verifyallproduct() throws IOException, InterruptedException {
					FileInputStream files=new FileInputStream("./testdata/Automation.properties");
					Properties popr=new Properties();
					popr.load(files);
					String url = popr.getProperty("url");
					
					 WebDriver driver=new ChromeDriver();
					    driver.manage().window().maximize();
					    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
					    driver.get(url);
					    
					    String currenturl = driver.getCurrentUrl();
						  if(currenturl.contains("https://automationexercise.com/")) {
							  System.out.println("home page is visible");
							
				}
						  driver.findElement(By.xpath("//a[@href='/products']")).click();
							 String productpg = driver.getCurrentUrl();
							 if(productpg.contains("https://automationexercise.com/products")) {
								 System.out.println("user is navigated to ALL PRODUCTS page successfully");
							 }else {
								 System.out.println("user is not navigated to ALL PRODUCTS page successfully");
							 }
							WebElement click = driver.findElement(By.xpath("//a[@href='/product_details/1']"));
							JavascriptExecutor js=(JavascriptExecutor) driver;
							js.executeScript("arguments[0].click()", click);
							
							String productpgv = driver.getCurrentUrl();
							if(productpgv.contains("https://automationexercise.com/product_details/1")) {
								System.out.println(". User is landed successfully to product detail page");
							}else {
								System.out.println(" User is not landed to product detail page");
							}
							
							WebElement pname = driver.findElement(By.xpath("//h2[text()='Blue Top']"));
							System.out.println("Product Name "+pname.getText() +" is Visible");
							
							WebElement categoty = driver.findElement(By.xpath("//p[text()='Category: Women > Tops']"));
							System.out.println(" Category is:- "+ categoty.getText());
							
						   WebElement price = driver.findElement(By.xpath("//span[text()='Rs. 500']"));
						   System.out.println("price is visible "+ price.getText());
						   
						  WebElement availablity = driver.findElement(By.xpath("//p[text()=' In Stock']"));
						  System.out.println( availablity.getText());
						  
						  WebElement condition = driver.findElement(By.xpath("//p[text()=' New']"));
				          System.out.println(condition.getText());
				          WebElement brand = driver.findElement(By.xpath("//b[text()='Brand:']"));
				          System.out.println(brand.getText()+" is  visible");
				 Thread.sleep(2000);
				 driver.quit();
				 AutomationExercise.searchproduct();
				 
					
					}
				//Test Case 9: Search Product

				private static void searchproduct() throws IOException, InterruptedException {
					FileInputStream files=new FileInputStream("./testdata/Automation.properties");
					Properties popr=new Properties();
					popr.load(files);
					String url = popr.getProperty("url");
					String search = popr.getProperty("searchproduct");
					String product = popr.getProperty("sproductname");
					
					 WebDriver driver=new ChromeDriver();
					    driver.manage().window().maximize();
					    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
					    driver.get(url);
					    
					    String currenturl = driver.getCurrentUrl();
						  if(currenturl.contains("https://automationexercise.com/")) {
							  System.out.println("home page is visible");		
					
				}

						  driver.findElement(By.xpath("//a[@href='/products']")).click();
						 String productpg = driver.getCurrentUrl();
						 if(productpg.contains("https://automationexercise.com/products")) {
							 System.out.println("user is navigated to ALL PRODUCTS page successfully");
						 }else {
							 System.out.println("user is not navigated to ALL PRODUCTS page successfully");
						 }
						 driver.findElement(By.xpath("//input[@placeholder='Search Product']")).sendKeys(product);
						 Thread.sleep(2000);
						 driver.findElement(By.xpath("//button[@id='submit_search']")).click();
						 
						String producturl = driver.getCurrentUrl();
						if(producturl.contains(search)) {
							System.out.println("SEARCHED PRODUCTS' is visible");
						}else {
							System.out.println("SEARCHED PRODUCTS' is not visible");
						}
						//System.out.println(driver.findElement(By.xpath("//h2[text()='Searched Products']")).getText());
						
						WebElement allsearchpr = driver.findElement(By.xpath("//div[@class='features_items']"));
						System.out.println("All Search produvt is visible "+ allsearchpr.getText());
						
						Thread.sleep(2000);
						driver.quit();
						 AutomationExercise.verifySubscription();
						 
				}
				
				//Test Case 10: Verify Subscription in home page

				private static void verifySubscription() throws InterruptedException {
					
					WebDriver driver=new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					driver.get("https://automationexercise.com/");
					String url = driver.getCurrentUrl();
					if(url.contains("https://automationexercise.com/")) {
						System.out.println("its vicible");
					}else {
						System.out.println("its not visible");
					}
					WebElement footr = driver.findElement(By.xpath("//p[text()='Get the most recent updates from ']"));
					Actions act=new Actions(driver);
					act.scrollToElement(footr).perform();
					WebElement verifyemail = driver.findElement(By.xpath("//input[@placeholder='Your email address']"));
					System.out.println(verifyemail.getText()+"its visible");
					Thread.sleep(2000);

					driver.findElement(By.xpath("//input[@placeholder='Your email address']")).sendKeys("Suraj@123b");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[@type='submit']")).click();
					WebElement id = driver.findElement(By.xpath("//div[@id='success-subscribe']"));
					System.out.println(id.getText());
					/*JavascriptExecutor js=(JavascriptExecutor) driver;
					js.executeScript("argument[0].scrollInToView(false)",footr );*/
					driver.quit();
					
					
				}

			}

					
					
				
		
		
		
		
		
	
		 
	


