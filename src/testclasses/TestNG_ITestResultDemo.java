package testclasses;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNG_ITestResultDemo {
	
	@Test
	public void testMethod1() {
		System.out.println("\nRunning Test -->TestNG_ITestResultDemo -->Test Method1");
		Assert.assertTrue(false);
	}

	@Test
	public void testMethod2() {
		System.out.println("\nRunning Test -->TestNG_ITestResultDemo -->Test Method2");
		Assert.assertTrue(true);
	}

	@AfterMethod
	public void afterMethod(ITestResult testResult) {
		System.out.println("\nTestNG_ITestResultDemo -->This runs once after every method");
		if(testResult.getStatus() == ITestResult.FAILURE){
			System.out.println("Failed: "+testResult.getMethod().getMethodName());
		}
		else if(testResult.getStatus() == ITestResult.SUCCESS){
			System.out.println("Passed: "+testResult.getMethod().getMethodName());
			
		}
	}

}
