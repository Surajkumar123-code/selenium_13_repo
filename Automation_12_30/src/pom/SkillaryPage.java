package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillaryPage {
	
	@FindBy(id = "navbar-search-input")
	public WebElement searchbar;
	
	public SkillaryPage(WebDriver driver) {
     PageFactory.initElements(driver, this);	}

	public WebElement getSearchbar() {
		return searchbar;
	}
	

}
