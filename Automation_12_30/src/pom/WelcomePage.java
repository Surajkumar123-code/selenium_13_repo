package pom;

import java.security.PrivateKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	//declaration
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(xpath = "//a[@href='/login']")
	private WebElement loginLink;
	
	//initalization
	public WelcomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	//getters

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	
	}
	


