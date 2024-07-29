package testng.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {

	@Test(priority = 4, invocationCount = 5)
	public void testMethod() {
		System.out.println("Hello");
	}

	@Test(priority = 1, groups = "demo1", enabled = false)
	public void testMethod1() {
		System.out.println("testMethod1 begins");
	}

	@Test(priority = 3,groups = "demo1")
	public void testMethod2() {
		System.out.println("testMethod2");
	}

	@Test(priority = 2, dependsOnMethods = { "testMethod", "testMethod2" })
	public void testMethod3() {
		System.out.println("testMethod3");
	}

	@BeforeSuite
	public void testMethodBeforeSuite() {
		System.out.println("Test Method Before Suite");
	}

	@BeforeClass
	public void testMethodBeforeClass() {
		System.out.println("Test Method Before Class");
	}

	@BeforeMethod
	public void testMethodBeforeMethod() {
		System.out.println("Test Method Before Method");
	}

	@BeforeTest
	public void testMethodBeforeTest() {
		System.out.println("Test Method Before Test");
	}

	@AfterSuite
	public void testMethodAfterSuite() {
		System.out.println("Test Method After Suite");
	}

	@AfterClass
	public void testMethodAfterClass() {
		System.out.println("Test Method After Class");
	}

	@AfterMethod
	public void testMethodAfterMethod() {
		System.out.println("Test Method After Method");
	}

	@AfterTest
	public void testMethodAfterTest() {
		System.out.println("Test Method After Test");
	}

	@Test(priority = 1, groups = "sanity")
	public void testMethod5() {
		System.out.println("testMethod1");
	}

	@Test(priority = 3, groups = "sanity")
	public void testMethod6() {
		System.out.println("testMethod2 sanity");
	}

	@Test(priority = 2, groups = "sanity")
	public void testMethod7() {
		System.out.println("testMethod3");
	}

}
