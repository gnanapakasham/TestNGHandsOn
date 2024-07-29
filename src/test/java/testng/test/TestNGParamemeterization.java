package testng.test;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParamemeterization {

	@Parameters("keyword")
	@Test(description = "Method to do search in browser engine")
	public void searchEngine(@Optional String keyword) {
		System.out.println("Searching from " + keyword);
	}

}
