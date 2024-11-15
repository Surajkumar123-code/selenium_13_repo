package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	@FindBy(xpath = "//input[@id='gender-male']")
	private WebElement genderButton;
	
	@FindBy(id = "FirstName")
	private WebElement firstNametf;
	
	@FindBy(id = "LastName")
	private WebElement lastNAmetf;
	
	@FindBy(id = "Email")
	private WebElement emailtf;
	 @FindBy(id = "Password")
	 private WebElement passwordtf;
	 
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPasswordtf;
	
	@FindBy(id = "register-button")
	private WebElement registerbutton;
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getGenderButton() {
		return genderButton;
	}
	public WebElement getFirstNametf() {
		return firstNametf;
	}
	public WebElement getLastNAmetf() {
		return lastNAmetf;
	}
	public WebElement getEmailtf() {
		return emailtf;
	}
	public WebElement getPasswordtf() {
		return passwordtf;
	}
	public WebElement getConfirmPasswordtf() {
		return confirmPasswordtf;
	}
	public WebElement getRegisterbutton() {
		return registerbutton;
	}
	
	
			
	
			
    
}
