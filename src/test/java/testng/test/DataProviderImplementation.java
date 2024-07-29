package testng.test;

import org.testng.annotations.Test;

public class DataProviderImplementation {

	// Define DataProvider as a separate class file and use that as a parameter in
	// another test class file
	
	@Test(dataProvider = "testProvider", dataProviderClass = DataProviders.class)
	public void searchEngine(String engine) {
		System.out.println("Search Engine oreder is :  " + engine);
	}

}
