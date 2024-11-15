package dataprovider;

import org.testng.annotations.DataProvider;

public class DataStorage {
	@DataProvider
	public String[][] login() {
		String data[][]={{"admin","admin"},{"admin","ad"},{"ad","admin"},{"ad","ad"}};
		return data;
	}

}
