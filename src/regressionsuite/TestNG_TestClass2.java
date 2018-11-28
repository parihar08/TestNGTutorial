package regressionsuite;

import org.testng.annotations.Test;

import base.BaseTestSuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNG_TestClass2 extends BaseTestSuite{
	
	@BeforeClass
	public void setUp() {
		System.out.println("\nTestNG_TestClass2 -->Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\nTestNG_TestClass2 -->Before Method");
	}
	
	@Test
	public void testMethod1() {
		System.out.println("\nRunning Test -->TestNG_TestClass2 -->Test Method1");
	}

	@Test
	public void testMethod2() {
		System.out.println("\nRunning Test -->TestNG_TestClass2 -->Test Method2");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("\nTestNG_TestClass2 -->After Method");
	}
	
	@AfterClass
	public void cleanUp() {
		System.out.println("\nTestNG_TestClass2 -->After Class");
	}

}
