package testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_EnableTimeout {
	
	@BeforeClass
	public void setUp() {
		System.out.println("\nTestNG_EnableTimeout -->This runs once before class");
	}
	
	@Test(enabled=false)
	public void testMethod1() {
		System.out.println("\nRunning Test -->TestNG_EnableTimeout -->Test Method1");
	}

	@Test(timeOut=100) //if test method doesn't finish in this time, fail the test case
	public void testMethod2() throws InterruptedException {
		System.out.println("\nRunning Test -->TestNG_EnableTimeout -->Test Method2");
		Thread.sleep(200);
	}
	
	@AfterClass
	public void cleanUp() {
		System.out.println("\nTestNG_EnableTimeout -->This runs once after class");
	}

}
