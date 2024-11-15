package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBook {
	@FindBy(xpath = "//div[text()='Switch accounts']")
	private WebElement register;
	
	@FindBy(xpath = "//input[@aria-label='Phone number, username, or email']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@aria-label='Password']")
	private WebElement password;
	
	public FaceBook(WebDriver driver) {
     PageFactory.initElements(driver, this);	}

	public WebElement getRegister() {
		return register;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
	

}
