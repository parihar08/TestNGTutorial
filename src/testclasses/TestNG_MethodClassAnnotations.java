package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNG_MethodClassAnnotations {
	
	@BeforeClass
	public void setUp() {
		System.out.println("\nTestNG_MethodClassAnnotations -->This runs once before class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\nTestNG_MethodClassAnnotations -->This runs once before every method");
	}
	
	@Test
	public void testMethod1() {
		System.out.println("\nRunning Test -->TestNG_MethodClassAnnotations -->Test Method1");
	}

	@Test
	public void testMethodw2() {
		System.out.println("\nRunning Test -->TestNG_MethodClassAnnotations -->Test Method2");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("\nTestNG_MethodClassAnnotations -->This runs once after every method");
	}
	
	@AfterClass
	public void cleanUp() {
		System.out.println("\nTestNG_MethodClassAnnotations -->This runs once after class");
	}

}
