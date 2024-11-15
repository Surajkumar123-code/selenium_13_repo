package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPAge {
	@FindBy(id = "Email")
	private WebElement emailtf;
	
	@FindBy(id = "Password")
    private WebElement passwordtf;
	
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	private WebElement lohhinbutton;
	
	
	public LoginPAge(WebDriver driver) {
     PageFactory.initElements(driver, this);		
	}
	public WebElement getEmailtf() {
		return emailtf;
	}
	public WebElement getPasswordtf() {
		return passwordtf;
	}
	public WebElement getLohhinbutton() {
		return lohhinbutton;
	}
	
}
