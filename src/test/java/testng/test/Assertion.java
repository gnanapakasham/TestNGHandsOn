package testng.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {

	/**
	 * Hard Assertion : whenever the assert condition fails, it will immediately
	 * stop that particular execution
	 * 
	 * Soft Assertion : It will continue the execution even the assert condition
	 * fails
	 * 
	 **/

	@Test()
	public void testMethodCheckAssertEqual() {

		int a = 10;
		int b = 10;
		int c = a + b;
		Assert.assertEquals(c, 20);
	}

	@Test()
	public void testMethodCheckAsserEqualWithErrorMessage() {

		int a = 10;
		int b = 10;
		int c = a + b;
		// We can pass customized error message as a third argument along with testNG
		// exception
		Assert.assertEquals(c, 30, "Actual value and Expected values are different");
	}

	@Test()
	public void testMethodCheckAssertTrue() {

		int a = 10;
		int b = 10;
		int c = a + b;
		// Check whether the given condition is true or not
		Assert.assertTrue((c == (a + b)));
		// We can pass customized error message as a third argument along with testNG
		// exception
		// Assert.assertTrue((c == (a - b)), "Condition failed");
	}

	@Test()
	public void testMethodCheckAssertFalse() {

		int a = 10;
		int b = 10;
		int c = a + b;
		// Check whether the given condition is false or not
		// in case of false test case result will be PASSED
		Assert.assertFalse((c == (a - b)));
	}

	@Test()
	public void testMethodCheckAssertNull() {

		String str = null;
		// Check whether the given string is null or not
		// in case of null test case result will be PASSED
		Assert.assertNull(str);
	}

	@Test()
	public void testMethodCheckAssertNotNull() {

		String str = "testing";
		// Check whether the given string is not null or not
		// in case of not null test case result will be PASSED
		Assert.assertNotNull(str);
	}

	@Test()
	public void testMethodSoftAssertion() {

		SoftAssert soft = new SoftAssert();
		String str = "testing";
		// Check whether the given string is null or not
		// in case of not null test case will not stop the execution and continues till
		// end
		// Finally it will update the test case as FAILED
		soft.assertNull(str);

		System.out.println("Ending test case");

		soft.assertAll();
	}

}
