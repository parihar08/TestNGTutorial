package testclasses;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

import appcode.SomeClassToTest;

public class TestNG_SoftAsserts {
	
	@Test
	public void testSum() {
		SoftAssert sa = new SoftAssert();
		System.out.println("Running Test -->Test Sum");
		SomeClassToTest obj = new SomeClassToTest();
		int result = obj.sumNumbers(3, 5);
		Assert.assertEquals(result, 8);	//If any verification point of assert fails,
										//It skips out of the method and doesn't execute any further line of code
		sa.assertEquals(result, 2);
		System.out.println("Incorrect Assertion");
		System.out.println("Soft Asserts continue to run the test method even after assertion failure");
		sa.assertEquals(result, 8);
		System.out.println("Correct Assertion");
		sa.assertAll();
		System.out.println("Assert All gives the result of all pass and fail assertions within the test method");
		System.out.println("End Test -->Test Sum");
	}
}
