package assignmentDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Path {
	@FindBy(xpath = "(//a[@href='/books'])[1]")
	private WebElement booklink;
	
	public  Path(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getBooklink() {
		return booklink;
	}
	

}
