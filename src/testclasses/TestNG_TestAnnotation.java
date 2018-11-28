package testclasses;

import org.testng.annotations.Test;
import appcode.SomeClassToTest;

public class TestNG_TestAnnotation {
	
	//Default run order of TestNG test methods is by alphabetic order 
	
	@Test
	public void testMethod1() {
		SomeClassToTest obj = new SomeClassToTest();
		int result = obj.sumNumbers(3, 5);
		System.out.println("Sum of two numbers is: "+result);
		System.out.println("Running Test -->Test Method1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("Running Test -->Test Method2");
	}
	
	@Test
	public void testMethod3() {
		System.out.println("Running Test -->Test Method3");
	}
}
