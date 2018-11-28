package testclasses;

import org.testng.annotations.Test;

public class TestNG_Parallel1 {
	
	@Test
	public void testMethod1() throws InterruptedException {
		System.out.println("\nRunning Test -->TestNG_Parallel1 -->Test Method1");
		Thread.sleep(4000);
		System.out.println("\nRunning Test -->TestNG_Parallel1 -->Test Method1 -->More Steps....");
	}

	@Test
	public void testMethod2() throws InterruptedException {
		System.out.println("\nRunning Test -->TestNG_Parallel1 -->Test Method2");
		Thread.sleep(4000);
		System.out.println("\nRunning Test -->TestNG_Parallel1 -->Test Method2 -->More Steps....");
		
	}
	
}
