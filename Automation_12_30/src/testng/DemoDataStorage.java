package testng;

import org.testng.annotations.DataProvider;

public class DemoDataStorage {
	
	@DataProvider
	public String[][] login() {
		String data[][]= {{"abhis1234@gmail.com","abhis@1234"},{"abhis@1234gmail.com","abhis@12"},{"abhi45@.com","abh"},{"abhgmail.com","his@1234"},{"abhi","abhi"}};
		return data;
	

}
}
