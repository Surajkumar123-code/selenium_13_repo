package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample {// TestNg Class

	@Test
	public void sample() {// test case
		
		// test steps
		Reporter.log("sample test case wxecuted", true);

	}

	@Test
	public void demo() {// test case
		
		// test steps
		Reporter.log("demo testcase executed", true);

	}

	@Test
	public void add() {// test case
		// test steps
		Reporter.log("add testcase executed", true);

	}

}
