package testng.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	// create data provider
	@DataProvider(name = "testProvider")
	public Object[] function() {

		return new Object[] { "Google", "Firefox", "Microsoft Edge", "Safari" };
	}

	// use the data provider which presents in same class
	// if it is not present in same class we need to use parameter as a argument
	// like below
	// @Test(dataProvider = "testProvider", dataProviderClass = DataProviders.class)
	
	@Test(dataProvider = "testProvider")
	public void testMethod(String searchEngine) {
		System.out.println("Search Engine order : " + searchEngine);
	}

}
