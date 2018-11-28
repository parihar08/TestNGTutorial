package testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Priority {
	
	@BeforeClass
	public void setUp() {
		System.out.println("\nTestNG_Priority -->This runs once before class");
	}
	
	@Test(priority=2)
	public void testMethod1() {
		System.out.println("\nRunning Test -->TestNG_Priority -->Test Method1");
	}

	@Test(priority=1)
	public void testMethod2() {
		System.out.println("\nRunning Test -->TestNG_Priority -->Test Method2");
	}
	
	@Test(priority=0)
	public void testMethod3() {
		System.out.println("\nRunning Test -->TestNG_Priority -->Test Method3");
	}

	@AfterClass
	public void cleanUp() {
		System.out.println("\nTestNG_Priority -->This runs once after class");
	}

}
