package crossbrowsertesting;

import org.testng.annotations.DataProvider;

public class DataSkillary {
	
	@DataProvider	
	public String[][] logindata() {
		
		String [][]data= {{"admin","admin"},{"admin","admin"},{"admin","admin"},{"admin","admin"}};
		return data;
		
	}

}
