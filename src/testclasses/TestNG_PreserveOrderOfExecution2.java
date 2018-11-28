package testclasses;

import org.testng.annotations.Test;

public class TestNG_PreserveOrderOfExecution2 {
	
	
	@Test
	public void testMethod1() {
		System.out.println("\nRunning Test -->TestNG_PreserveOrderOfExecution2 -->Test Method1");
	}

	@Test
	public void testMethod2() {
		System.out.println("\nRunning Test -->TestNG_PreserveOrderOfExecution2 -->Test Method2");
	}
	
}
