package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNG_TestClass1 {
	
	@BeforeClass
	public void setUp() {
		System.out.println("\nTestNG_TestClass1 -->This runs once before class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\nTestNG_TestClass1 -->This runs once before every method");
	}
	
	@Test
	public void testMethod1() {
		System.out.println("\nRunning Test -->TestNG_TestClass1 -->Test Method1");
	}

	@Test
	public void testMethod2() {
		System.out.println("\nRunning Test -->TestNG_TestClass1 -->Test Method2");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("\nTestNG_TestClass1 -->This runs once after every method");
	}
	
	@AfterClass
	public void cleanUp() {
		System.out.println("\nTestNG_TestClass1 -->This runs once after class");
	}

}
